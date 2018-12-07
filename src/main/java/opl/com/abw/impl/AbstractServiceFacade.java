package opl.com.abw.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.Charset;

@Slf4j
public class AbstractServiceFacade {

    @Autowired
    private RestTemplate restTemplate;

    protected <T, R> ResponseEntity<R> getResponse(T request, Class<R> responseType, UriComponentsBuilder endpoint, boolean responseTypePost) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.add("authority", "ipimobile.stg.omnitest.corpnet.pl");
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        ResponseEntity<R> response = null;
        HttpEntity<T> entity = new HttpEntity<>(request, headers);
        try {
            if (responseTypePost) {
                response = restTemplate.exchange(endpoint.build().encode().toUri(), HttpMethod.POST, entity, responseType);
            } else {
                //response = restTemplate.getForEntity(endpoint.build().encode().toUri(), entity, responseType);
                response = restTemplate.exchange(endpoint.build().encode().toUri(), HttpMethod.GET, entity, responseType);
                log.info("Response: " + response);
            }
            return ResponseEntity.ok(response.getBody());
        } catch (HttpStatusCodeException exception) {
            int statusCode = exception.getStatusCode().value();
            log.error("Internal API return response with error code " + statusCode + " and description: " + exception.getResponseBodyAsString(), exception);
            try {
                return new ResponseEntity(HttpStatus.valueOf(statusCode));
            } catch (IllegalArgumentException e) {
                log.error("Error while preparing ResponseEntity", e);
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
