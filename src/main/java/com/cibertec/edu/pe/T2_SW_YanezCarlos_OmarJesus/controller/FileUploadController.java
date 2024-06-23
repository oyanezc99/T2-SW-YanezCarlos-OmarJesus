package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/upload")
public class FileUploadController {

    @PostMapping("/multiple")
    public ResponseEntity<List<String>> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        List<String> fileNames = new ArrayList<>();
        for (MultipartFile file : files) {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
            if (!isValidExtension(fileExtension)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
            fileNames.add(fileName);
        }
        return ResponseEntity.status(HttpStatus.OK).body(fileNames);
    }

    private boolean isValidExtension(String extension) {
        return extension.equalsIgnoreCase("pdf") ||
                extension.equalsIgnoreCase("png") ||
                extension.equalsIgnoreCase("docx");
    }
}
