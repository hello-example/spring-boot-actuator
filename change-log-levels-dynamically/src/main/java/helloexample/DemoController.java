package helloexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        log.trace("TRACE 메시지");
        log.debug("DEBUG 메시지");
        log.info("INFO 메시지");
        log.warn("WARN 메시지");
        log.error("ERROR 메시지");
        return "hello";
    }
}
