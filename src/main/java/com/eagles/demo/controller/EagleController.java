package com.eagles.demo.controller;

import com.eagles.demo.dto.FileData;
import com.eagles.demo.service.MagicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api")
public class EagleController {
    private static final String PROCESS_ENDPOINT_PATH = "/document/process";

    private final MagicService service;

    @Autowired
    public EagleController(MagicService service) {
        this.service = service;
    }

    @PostMapping(PROCESS_ENDPOINT_PATH)
    public ResponseEntity<String> uploadPdfs(@Valid List<FileData> files) {
        service.process(files);
        return ResponseEntity.ok("Files processed successfully");
    }
}
