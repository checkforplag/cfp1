package com.report.controller;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Map<String, Object> takeReportFile(@RequestParam("file") MultipartFile file) {
        responsMap = new HashedMap<String,Object>();
        System.out.println("File Name ::"+file.isEmpty());
        if(file.isEmpty() == false) {
            if((file.getOriginalFilename().endsWith("txt") || file.getOriginalFilename().endsWith("doc") || file.getOriginalFilename().endsWith("docx") || file.getOriginalFilename().endsWith("pdf") || file.getOriginalFilename().endsWith("html") || file.getOriginalFilename().endsWith("htm"))) {
                responsMap =  fileReadService.readFileFromClient(file);
                return responsMap;
            }else
            {
                responsMap.put("status", false);
                responsMap.put("message", "txt, pdf, doc, docx, html fils are only accepted.");
                return responsMap;
            }     
        }else
        {
            System.out.println("You are in Else Condition");
            responsMap.put("status", false);
            responsMap.put("message", "Please select file!");
            return responsMap;
        }
       
       
       
    }
}
