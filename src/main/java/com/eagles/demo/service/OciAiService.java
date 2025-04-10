package com.eagles.demo.service;

import com.eagles.demo.model.DocumentResponse;
import com.eagles.demo.model.FileData;

import java.util.List;

public interface OciAiService {
    List<DocumentResponse> extractData(List<FileData> fileDataList);
}
