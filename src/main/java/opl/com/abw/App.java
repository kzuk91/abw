package opl.com.abw;


import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableSwagger2
public class App extends SpringBootServletInitializer {

    /**
     * The socket timeout.
     */
    @Value("${abw.socket.timeout:3000}")
    private int abwSocketTimeout;

    /**
     * The connect timeout.
     */
    @Value("${abw.connect.timeout:3000}")
    private int abwConnectTimeout;

    /**
     * The request timeout.
     */
    @Value("${abw.request.timeout:3000}")
    private int abwRequestTimeout;

    /**
     * The idle connection timeout.
     */
    @Value("${abw.idle.connection.timeout:5000}")
    private int idleConnectionTimeout;

    @Value("${http.client.ssl.trust-store}")
    private Resource keyStore;

    @Value("${http.client.ssl.trust-store-password}")
    private String keyStorePassword;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }

    /**
     * Rest template.
     *
     * @return the rest template
     */

    @Bean
    public TomcatEmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };

        tomcat.addAdditionalTomcatConnectors(initiateHttpConnector());
        return tomcat;
    }

    private Connector initiateHttpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(8080);
        connector.setSecure(false);
        connector.setRedirectPort(8443);

        return connector;
    }
    @Bean
    public RestTemplate restTemplate() {
        PoolingHttpClientConnectionManager pcm = new PoolingHttpClientConnectionManager();
        pcm.closeIdleConnections(idleConnectionTimeout, TimeUnit.MILLISECONDS);
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(abwRequestTimeout).setConnectTimeout(abwConnectTimeout).setSocketTimeout(abwSocketTimeout).build();
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).setSSLHostnameVerifier(new NoopHostnameVerifier()).setConnectionManager(pcm).build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }

    @Bean
    public CloseableHttpClient httpClient() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException {
        SSLContext sslContext = new SSLContextBuilder()
                .loadTrustMaterial(
                        keyStore.getURL(),
                        keyStorePassword.toCharArray()
                ).build();
        /*SSLContext sslContext = new SSLContextBuilder()
                .loadTrustMaterial(null, (certificate, authType) -> true).build();*/
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
        PoolingHttpClientConnectionManager pcm = new PoolingHttpClientConnectionManager();
        pcm.closeIdleConnections(idleConnectionTimeout, TimeUnit.MILLISECONDS);
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(abwRequestTimeout).setConnectTimeout(abwConnectTimeout).setSocketTimeout(abwSocketTimeout).build();
        return HttpClients.custom().setSSLSocketFactory(csf).setDefaultRequestConfig(requestConfig).setConnectionManager(pcm).build();

    }
}

