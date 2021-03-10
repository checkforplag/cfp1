package com.report.controller;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.report.service.FileReadService;

@RestController
public class ReportFileController {

    @Autowired
    private FileReadService fileReadService;

    Map<String, Object> responsMap;

    @PutMapping("fileuploader")
    public Map<String, Object> takeReportFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam("language") String language,
            @RequestParam("fontName") String fontName) {
        responsMap = new HashedMap<String, Object>();
        if (file.isEmpty() == false) {
            if ((file.getOriginalFilename().endsWith("txt")
                    || file.getOriginalFilename().endsWith("doc")
                    || file.getOriginalFilename().endsWith("docx")
                    || file.getOriginalFilename().endsWith("pdf")
                    || file.getOriginalFilename().endsWith("html")
                    || file.getOriginalFilename().endsWith("htm"))) {
                responsMap = fileReadService.uploadandReadfile(file, language,
                        fontName);
                return responsMap;
            } else {
                responsMap.put("status", false);
                responsMap.put("message",
                        "txt, pdf, doc, docx, html fils are only accepted.");
                return responsMap;
            }
        } else {
            responsMap.put("status", false);
            responsMap.put("message", "Please select file!");
            return responsMap;
        }

    }

    @PutMapping("/savedocument")
    private Map<String, Object> saveDocument(
            @RequestParam("file") MultipartFile file) {
        responsMap = new HashedMap<String, Object>();
        if (file.isEmpty() == false) {
            if ((file.getOriginalFilename().endsWith("txt")
                    || file.getOriginalFilename().endsWith("doc")
                    || file.getOriginalFilename().endsWith("docx")
                    || file.getOriginalFilename().endsWith("pdf")
                    || file.getOriginalFilename().endsWith("html")
                    || file.getOriginalFilename().endsWith("htm"))) {
                responsMap = fileReadService.saveDocument(file);
                return responsMap;
            } else {
                responsMap.put("status", false);
                responsMap.put("message",
                        "txt, pdf, doc, docx, html fils are only accepted.");
                return responsMap;
            }
        } else {
            responsMap.put("status", false);
            responsMap.put("message", "Please select file!");
            return responsMap;
        }
    }

    @PutMapping("/readdocument")
    private Map<String, Object> readDocument(
            @RequestParam("filename") String filename,
            @RequestParam("language") String language,
            @RequestParam("fontName") String fontName) {
        responsMap = new HashedMap<String, Object>();
        if (filename != null && filename.trim().length() != 0) {
            responsMap = fileReadService.readFileFromClient(filename, language,
                    fontName);
            return responsMap;
        } else {
            responsMap.put("status", false);
            responsMap.put("message", "Please provide file name!");
            return responsMap;
        }

    }

    @GetMapping("/filereadString/{filename}")
    private Map<String, Object> getFileStringInfo(
            @PathVariable String filename) {

        responsMap = new HashedMap<String, Object>();
        if (filename.isEmpty() == false) {
            if ((filename.endsWith("txt") || filename.endsWith("doc")
                    || filename.endsWith("docx") || filename.endsWith("pdf")
                    || filename.endsWith("html") || filename.endsWith("htm"))) {
                responsMap = fileReadService.readFile(filename);
                return responsMap;
            } else {
                responsMap.put("status", false);
                responsMap.put("message",
                        "txt, pdf, doc, docx, html fils are only accepted.");
                return responsMap;
            }
        } else {
            responsMap.put("status", false);
            responsMap.put("message", "Please select file!");
            return responsMap;
        }

    }
}
