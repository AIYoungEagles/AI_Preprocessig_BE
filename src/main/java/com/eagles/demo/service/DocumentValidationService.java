package com.eagles.demo.service;

import com.eagles.demo.model.Document;
import com.eagles.demo.model.Field;

import java.util.List;

public interface DocumentValidationService {
    void validateDocuments(List<Document> documents);
}
