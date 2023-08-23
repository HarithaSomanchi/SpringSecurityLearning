package sh.radical.hostel.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sh.radical.hostel.entities.Health;

@RestController
@Slf4j
public class HealthController {

	@GetMapping(value = "/health")
	public Health getHealth() {
		log.info("health api request received");
		return new Health();
	}
}
