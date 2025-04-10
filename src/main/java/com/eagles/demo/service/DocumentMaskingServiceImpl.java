package com.eagles.demo.service;

import com.eagles.demo.model.DocumentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentMaskingServiceImpl implements DocumentMaskingService {

    @Override
    public void maskConfidentialFields(List<DocumentResponse> documents) {
        // TODO implement
    }
}
