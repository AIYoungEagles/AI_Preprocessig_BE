package com.eagles.demo.service;

import com.eagles.demo.dto.FileData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicServiceImpl implements MagicService{
    @Override
    public void process(@Valid List<FileData> files) {
        return;
    }
}
