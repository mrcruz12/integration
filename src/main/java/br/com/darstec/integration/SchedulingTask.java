package br.com.darstec.integration;

import br.com.darstec.integration.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@EnableScheduling
public class SchedulingTask {

    private final long MINUT = 1000 * 60 * 25;
    private long i = 0;
    private static final Logger log = LoggerFactory.getLogger(IntegrationApplication.class);

    @Autowired
    RestTemplate restTemplate;

    @Scheduled(fixedDelay = MINUT)
    public void scheduleFutureTask() {
        //System.out.println("schedule ok!" + i);
        if (restTemplate != null){
            String quote = restTemplate.getForObject(
                    "https://dars-wake-up.herokuapp.com/hello", String.class);
            log.info("Resultado da Chamada RestExampleController:    " + quote);
        }

    }

}
