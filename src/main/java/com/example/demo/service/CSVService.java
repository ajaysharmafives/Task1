package com.example.demo.service;
import com.example.demo.helper.CSVHelper;
import com.example.demo.model.CsvData;
import com.example.demo.repository.CsvDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.*;

@Service
public class CSVService {
    @Autowired
    private CsvDataRepository repository;
    @Autowired
    private  TableCreationService tableCreationService;
    public void save(MultipartFile file) {
        try {
            tableCreationService.createTableIfNotExists();
            List<CsvData> dataList = CSVHelper.csvToData(file.getInputStream());
            repository.saveAll(dataList);
        } catch (IOException e) {
            throw new RuntimeException("Failed to store CSV data: " + e.getMessage());
        }
    }

    public List<CsvData> getAllData() {
        return repository.findAll();
    }
}
