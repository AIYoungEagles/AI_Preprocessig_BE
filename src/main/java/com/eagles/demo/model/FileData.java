package com.eagles.demo.model;

import com.eagles.demo.type.DOCUMENT_TYPE;
import com.eagles.demo.validation.ValidJpg;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileData {
    @ValidJpg
    @NotNull(message = "File must not be null.")
    private MultipartFile file;

    @NotNull(message = "Document type must not be null.")
    private DOCUMENT_TYPE documentType;
}