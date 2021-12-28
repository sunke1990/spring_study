package com.scheduling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author sunke
 * @DATE 2021/12/1
 **/
@Component
public class Schedule {

    @Scheduled(fixedDelay = 3000)
    public void time(){
        System.out.println("每三秒钟刷新一次");
    }
}
