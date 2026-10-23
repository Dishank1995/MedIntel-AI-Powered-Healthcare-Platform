package com.codeforge.auth.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class StartupService {

    @PostConstruct
    public void start() {

        System.out.println("======================================");
        System.out.println(" CodeForge AI Auth Service Started");
        System.out.println("======================================");

    }

    @PreDestroy
    public void stop() {

        System.out.println("======================================");
        System.out.println(" CodeForge AI Auth Service Stopped");
        System.out.println("======================================");

    }

}