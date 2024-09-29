package com.TaskManager.TaskManager.Monitors;

import org.springframework.stereotype.Component;

@Component
public class PriorityMonitor implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread can start");
        
        while(true){

        }
    }
}
