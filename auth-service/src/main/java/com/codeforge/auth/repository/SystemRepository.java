package com.codeforge.auth.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SystemRepository {

    public String databaseStatus() {
        return "Database Connected Successfully";
    }

}