package com.eagles.demo.model;

import com.eagles.demo.type.DOCUMENT_TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private UUID id;
    private String documentTitle;
    private DOCUMENT_TYPE documentType;
    private List<Field> fields;
}
