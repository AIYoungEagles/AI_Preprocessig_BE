package com.eagles.demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;


public class JpgFileValidator implements ConstraintValidator<ValidJpg, MultipartFile> {
    private static final String JPG_CONTENT_TYPE = "application/jpg";

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext constraintValidatorContext) {
        if (file.getContentType() == null || !file.getContentType().equals(JPG_CONTENT_TYPE)) {
            return false;
        }

        return true;
    }
}