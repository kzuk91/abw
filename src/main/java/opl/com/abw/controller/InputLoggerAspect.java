package opl.com.abw.controller;

        import org.aspectj.lang.JoinPoint;
        import org.aspectj.lang.annotation.Aspect;
        import org.aspectj.lang.annotation.Before;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

        import com.fasterxml.jackson.core.JsonProcessingException;
        import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class InputLoggerAspect.
 */
@Aspect
@Component
public class InputLoggerAspect {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(InputLoggerAspect.class);

    /** The object mapper. */
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Before.
     *
     * @param pointcut the pointcut
     * @throws JsonProcessingException the json processing exception
     */
    @Before(value = "execution(* *(..)) && @annotation(InputLogger)")
    public void before(JoinPoint pointcut) throws JsonProcessingException {

        Object[] args = pointcut.getArgs();

        for (Object object : args) {
            if(object!=null && !object.toString().equals("\"default\"")) {
                LOGGER.info("{}:{}", object.getClass(), objectMapper.writeValueAsString(object));
            }
        }

    }
}
