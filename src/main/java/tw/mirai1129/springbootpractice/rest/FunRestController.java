package tw.mirai1129.springbootpractice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FunRestController {
    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

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

    @GetMapping("/teaminfo")
    public Map<String, Object> getTeamInfo() {
        Map<String, Object> response = new HashMap<>();

        Map<String, String> team = new HashMap<>();
        team.put("name", teamName);
        response.put("team", team);

        Map<String, String> coach = new HashMap<>();
        coach.put("name", coachName);
        response.put("coach", coach);

        return response;
    }
}
