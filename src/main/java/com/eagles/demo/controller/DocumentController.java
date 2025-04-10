package com.eagles.demo.controller;

import com.eagles.demo.model.Document;
import com.eagles.demo.model.FileData;
import com.eagles.demo.service.DocumentMaskingService;
import com.eagles.demo.service.DocumentValidationService;
import com.eagles.demo.service.OciAiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
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

    @PostMapping("/extract")
    public ResponseEntity<List<Document>> extractFiles(@RequestBody @Valid List<FileData> fileRequests) {
        var documents = ociAiService.extractData(fileRequests);

        documentValidationService.validateDocuments(documents);
        documentMaskingService.maskConfidentialFields(documents);

        return ResponseEntity.ok(documents);
    }

    @PostMapping("/process")
    public ResponseEntity<String> processDocuments(@RequestBody List<Document> documents) {
        documentValidationService.validateDocuments(documents);
        documentMaskingService.unmaskConfidentialFields(documents);
        ociAiService.sendForProcessing(documents);

        return ResponseEntity.ok("Documents were successfully send for processing");
    }
}
