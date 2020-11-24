package br.com.darstec.integration;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class SchedulingTask {

    private final long MINUT = 1000 * 60 * 10;
    private long i = 0;

    @Scheduled(fixedDelay = MINUT)
    public void scheduleFutureTask() {
        System.out.println("schedule ok!" + i);
        i++;
    }
}
