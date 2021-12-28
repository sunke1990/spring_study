package com.test;

import com.aop.AspectJ;
import com.scheduling.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author sunke
 * @DATE 2021/12/1
 **/
@Component
public class Test {
    @Autowired
    private Schedule schedule;

    @Scheduled(fixedDelay = 5000)
    public void fuc(){
        schedule.time();
        System.out.println("-------->");
    }

    @AspectJ(value = "ownership")
    public void ao(String realName,Long userId,Integer ownership){

    }

    public Runnable run(){
        return () -> System.out.println("runnable");
    }
}
