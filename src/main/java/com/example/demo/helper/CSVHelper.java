package com.example.demo.helper;


import com.example.demo.model.CsvData;
import com.example.demo.service.TableCreationService;
import org.apache.commons.csv.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {
    public static String TYPE = "text/csv";



    public static boolean hasCSVFormat(MultipartFile file) {
        return TYPE.equals(file.getContentType());
    }

    public static List<CsvData> csvToData(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withTrim())) {





            List<CsvData> dataList = new ArrayList<>();
            for (CSVRecord record : csvParser.getRecords()) {
                CsvData data = new CsvData(
                        record.get("Name"),
                        record.get("Email"),
                        record.get("Phone")
                );
                dataList.add(data);
            }
            return dataList;
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse CSV file: " + e.getMessage());
        }
    }
}