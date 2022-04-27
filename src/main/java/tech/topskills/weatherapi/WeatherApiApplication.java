package tech.topskills.weatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WeatherApiApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello from Docker world";
	}
	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}

}
