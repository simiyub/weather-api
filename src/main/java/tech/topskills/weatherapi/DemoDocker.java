package tech.topskills.weatherapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDocker {

    @RequestMapping("")
    public String home(){
        return "Hello from Docker world";
    }
}
