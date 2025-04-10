package com.eagles.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Field {
    private String name;
    private String value;
    private boolean isProtected;
    private boolean isConfident;
}
