package com.eagles.demo.controller;

import com.eagles.demo.model.DocumentResponse;
import com.eagles.demo.model.FileData;
import com.eagles.demo.service.DocumentMaskingService;
import com.eagles.demo.service.DocumentValidationService;
import com.eagles.demo.service.OciAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/document")
public class DocumentController {

    private final OciAiService ociAiService;
    private final DocumentValidationService documentValidationService;
    private final DocumentMaskingService documentMaskingService;

    public DocumentController(@Autowired OciAiService ociAiService,
                              @Autowired DocumentValidationService documentValidationService,
                              @Autowired DocumentMaskingService documentMaskingService) {
        this.ociAiService = ociAiService;
        this.documentValidationService = documentValidationService;
        this.documentMaskingService = documentMaskingService;
    }

    @PostMapping("/process")
    public ResponseEntity<List<DocumentResponse>> processFiles(@RequestBody List<FileData> fileRequests) {
        List<DocumentResponse> responseList = ociAiService.extractData(fileRequests);
        documentValidationService.validateDocuments(responseList);
        documentMaskingService.maskConfidentialFields(responseList);
        return ResponseEntity.ok(responseList);
    }
}
