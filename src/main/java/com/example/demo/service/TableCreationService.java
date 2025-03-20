package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TableCreationService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTableIfNotExists() {
        String sql = "CREATE TABLE IF NOT EXISTS csv_bulk_data (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "email VARCHAR(255), " +
                "phone VARCHAR(20))";

        jdbcTemplate.execute(sql);
    }
}
