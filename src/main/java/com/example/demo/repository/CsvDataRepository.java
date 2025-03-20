package com.example.demo.repository;

import com.example.demo.model.CsvData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsvDataRepository extends JpaRepository<CsvData, Long>  {
}