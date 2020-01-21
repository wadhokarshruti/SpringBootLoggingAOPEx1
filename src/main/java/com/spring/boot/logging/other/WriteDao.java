package com.spring.boot.logging.other;

import org.springframework.stereotype.Repository;

@Repository
public class WriteDao {
    public String writeSuccessful() {
        return "Success";
    }
}
