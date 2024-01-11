package com.lcm.tunablewhite.consumer.tunablewhiteconsumer.utility;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.util.Date;

@Component
public class Scheduler {

    //@Scheduled(fixedRate = 5000)//fixedDelay//@Scheduled(cron=". . .")
    //@Scheduled(fixedDelay = 5000)
    @Scheduled(cron = "*/10 * * * * *")
    public void reportCurrentTime() {
        System.out.println(new Date());
    }


}
