package com.eagles.demo.service;

import com.eagles.demo.model.DocumentResponse;
import com.eagles.demo.model.FileData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OciAiServiceImpl implements OciAiService {

    @Override
    public List<DocumentResponse> extractData(List<FileData> fileDataList) {
        // TODO implement as part of task 3
        return List.of();
    }
}
