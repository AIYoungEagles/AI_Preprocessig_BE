package com.eagles.demo.service;

import com.eagles.demo.model.DocumentResponse;

import java.util.List;

public interface DocumentValidationService {
    void validateDocuments(List<DocumentResponse> documents);
}
