package com.mydeveloperplanet.myspringactuatorplanet;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class OddOrEvenMinuteHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 0;
        LocalTime now = LocalTime.now();
        if (now.getMinute() % 2 != 0) {
            errorCode = 1;
        }

        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

}
