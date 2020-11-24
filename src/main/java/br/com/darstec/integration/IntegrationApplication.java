package br.com.darstec.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationApplication.class, args);

		SchedulingTask scheduling = new SchedulingTask();
		scheduling.scheduleFutureTask();
	}

}
