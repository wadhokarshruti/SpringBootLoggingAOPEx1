package com.spring.boot.logging.other;

import org.springframework.stereotype.Repository;

@Repository
public class ReadDao {
    public String fetchSuccessful() {
        return "Success";
    }
}
