package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/upload")
public class SingleFileUploadController {

    @Value("${spring.servlet.multipart.max-file-size}")
    private String maxFileSize;

    @PostMapping("/single")
    public ResponseEntity<String> uploadSingleFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        long fileSize = file.getSize();
        if (fileSize > parseMaxFileSize()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File size exceeds the limit of " + maxFileSize);
        }
        return ResponseEntity.status(HttpStatus.OK).body(fileName);
    }

    private long parseMaxFileSize() {
        String[] parts = maxFileSize.split("[A-Za-z]");
        long size = Long.parseLong(parts[0]);
        String unit = maxFileSize.substring(parts[0].length());
        switch (unit) {
            case "KB":
                return size * 1024;
            case "MB":
                return size * 1024 * 1024;
            case "GB":
                return size * 1024 * 1024 * 1024;
            default:
                return size;
        }
    }
}
