package com.TaskManager.TaskManager;

import com.TaskManager.TaskManager.Monitors.PriorityMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskManagerCommandLineRunner implements CommandLineRunner {

    @Autowired
    PriorityMonitor priorityMonitor;

    @Override
    public void run(String... args) throws Exception {
        Thread priorityMonitorThread = new Thread(priorityMonitor);
        priorityMonitorThread.start();
    }
}
