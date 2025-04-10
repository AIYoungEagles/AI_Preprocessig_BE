package com.eagles.demo.service;

import com.eagles.demo.model.Document;
import com.eagles.demo.model.FileData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OciAiServiceImpl implements OciAiService {

    @Override
    public List<Document> extractData(List<FileData> fileDataList) {
        // TODO implement as part of task 3
        return List.of();
    }

    @Override
    public void sendForProcessing(List<Document> documents) {

    }
}
