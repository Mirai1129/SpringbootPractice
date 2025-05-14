package tw.mirai1129.springbootpractice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Do 10 pushups";
    }

    @GetMapping("/lucky")
    public String getDailyLucky() {
        return "You are very lucky!";
    }
}
