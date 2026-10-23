package com.codeforge.auth.util;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class PasswordGenerator {

    public String generateTempPassword() {
        return "TEMP-" + Instant.now().toEpochMilli();
    }

}