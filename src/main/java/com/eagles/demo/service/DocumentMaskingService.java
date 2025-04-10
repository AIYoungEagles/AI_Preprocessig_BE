package com.eagles.demo.service;

import com.eagles.demo.model.Document;

import java.util.List;

public interface DocumentMaskingService {
    void maskConfidentialFields(List<Document> documents);

    void unmaskConfidentialFields(List<Document> fields);
}
