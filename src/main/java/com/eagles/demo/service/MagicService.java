package com.eagles.demo.service;

import com.eagles.demo.model.FileData;
import jakarta.validation.Valid;

import java.util.List;

public interface MagicService {
    void process(@Valid List<FileData> files);
}
