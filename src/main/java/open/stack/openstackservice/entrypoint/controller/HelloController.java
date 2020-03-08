package open.stack.openstackservice.entrypoint.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RefreshScope
@Slf4j
public class HelloController {

    @Value("${test.var}")
    private String testVar;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD HH24:mm:SS");

    @RequestMapping("/hello")
    public String index() {
        log.info("/hello called at {}", dateFormat.format(new Date()));
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/testVar")
    public String testVar() {
        log.info("/testVar called at {}", dateFormat.format(new Date()));
        return "The Environment Variable is: " + testVar;
    }

    @RequestMapping("/exception")
    public String forceException() throws Exception {
        log.info("/exception called at {}", dateFormat.format(new Date()));
        throw new Exception("Exception thrown by force at " + dateFormat.format(new Date()));
    }

}