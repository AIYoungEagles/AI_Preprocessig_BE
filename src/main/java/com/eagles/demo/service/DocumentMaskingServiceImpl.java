package com.eagles.demo.service;

import com.eagles.demo.model.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentMaskingServiceImpl implements DocumentMaskingService {

    @Override
    public void maskConfidentialFields(List<Document> documents) {
        // TODO implement
    }

    @Override
    public void unmaskConfidentialFields(List<Document> fields) {
        // TODO implement
    }
}
