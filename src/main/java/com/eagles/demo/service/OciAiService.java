package com.eagles.demo.service;

import com.eagles.demo.model.Document;
import com.eagles.demo.model.FileData;

import java.util.List;

public interface OciAiService {
    List<Document> extractData(List<FileData> fileDataList);

    void sendForProcessing(List<Document> documents);
}
