package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuController {
    @GetMapping("/deadLock")
    public String deadLock(){
        Object lock1=new Object();
        Object lock2=new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (lock1) {

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (lock2) {
                        System.out.println("Thread1 Done!");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (lock2) {
                    try {
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (lock1) {
                        System.out.println("Thread2 Done!");
                    }
                }
            }
        }.start();

        return "dead Lock!";
    }

    @GetMapping("deadCycle")
    public String deadCycle(){
        int a=1;
        if(a==1){
            while (true){

            }
        }
        return "deadCycle";
    }
}
