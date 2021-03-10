package com.report.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.report.modal.TableArrayModal;
import com.report.modal.TableArrayRegional;
import com.report.repository.TableArrayRegionalRepository;
import com.report.repository.TableArrayRepository;
import com.report.util.FileUtils;

@Service
public class FileReadService {

    @Autowired
    private TableArrayRepository tableArrayRepository;

    @Autowired
    private TableArrayRegionalRepository tableArrayRegionalRepository;

    FileInputStream fileInputStream = null;
    PDDocument pd = null;
    String fileText = "";
    String simbolPattern = "/(?<=([,.?!]))\\s+/";
    List<String> tokenList;
    List<String> fileTExtArray;
    List<String> fileTokenList;
    Map<String, Object> responsMap;

    public Map<String, Object> uploadandReadfile(MultipartFile multipartFile,
            String language, String fontname) {
        responsMap = new HashedMap<String, Object>();
        try {
            responsMap = saveDocument(multipartFile);
            if ((Boolean) responsMap.get("status")) {
                responsMap.clear();
                responsMap = readFileFromClient(
                        multipartFile.getOriginalFilename(), language,
                        fontname);
                return responsMap;
            } else {
                return responsMap;
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            responsMap.put("status", false);
            responsMap.put("message", "Something is wrong, please try again!");
            return responsMap;

        }

    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> readFileFromClient(String fileName,
            String language, String fontName) {
        responsMap = new HashedMap<String, Object>();
        try {

            File file = new File(
                    System.getProperty("user.dir") + "/docfiles/" + fileName);
            if (!file.isFile()) {
                responsMap.put("status", false);
                responsMap.put("message", "File not available in server");
                return responsMap;
            }
            responsMap.clear();
            responsMap = readText(file);
            if ((Boolean) responsMap.get("status")) {

                // checkUnicode here
                if (language.equalsIgnoreCase("english")) {

                    String tokenString = (String) responsMap.get("data");
                    String[] tokenArray = tokenString.split("[।,.?!]");
                    responsMap = splitTokenandSave(tokenArray, language);
                    if ((Boolean) responsMap.get("status")) {
                        return addTokenInTable(
                                (List<String>) responsMap.get("data"));
                    } else {
                        return responsMap;
                    }
                } else {
                    responsMap = FileUtils.checkUnicodeFile(
                            (String) responsMap.get("data"), language,
                            fontName);
                    if ((Boolean) responsMap.get("status")) {
                        String tokenString = (String) responsMap.get("data");
                        String[] tokenArray = tokenString.split("[।,.?!]");
                        responsMap = splitTokenandSave(tokenArray, language);
                        if ((Boolean) responsMap.get("status")) {
                            return addTokenInTable(
                                    (List<String>) responsMap.get("data"));
                        } else {
                            return responsMap;
                        }
                    } else {

                        responsMap = splitTokenandSave(
                                (String[]) responsMap.get("data"), language);

                        if ((Boolean) responsMap.get("status")) {
                            return addTokenInRegionalTable(
                                    (List<String>) responsMap.get("data"));
                        } else {
                            responsMap.clear();
                            responsMap.put("status", false);
                            responsMap.put("message",
                                    "No Content is available");
                            return responsMap;
                        }

                    }

                }

            } else {
                return responsMap;
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            responsMap.put("status", false);
            responsMap.put("message", "Something is wrong, please try again!");
            return responsMap;
        }

    }

    public Map<String, Object> readFile(String fileName) {
        responsMap = new HashedMap<String, Object>();
        try {

            File file = new File(
                    System.getProperty("user.dir") + "/docfiles/" + fileName);

            if (!file.isFile()) {
                responsMap.put("status", false);
                responsMap.put("message", "File not available in server");
                return responsMap;

            }
            responsMap = readText(file);
            if (responsMap.get("status") == (Boolean) false) {
                return responsMap;
            }

            fileText = (String) responsMap.get("data");

            if (fileText != null && fileText.length() >= 0) {
                responsMap.put("status", true);
                responsMap.put("message", "File uploaded successfully");
                responsMap.put("data", fileText);
                return responsMap;
            } else {

                responsMap.put("status", false);
                responsMap.put("message",
                        "There is no content available in your file.");
                return responsMap;
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            responsMap.put("status", false);
            responsMap.put("message", "Something is wrong, please try again!");
            return responsMap;
        }

    }

    public Map<String, Object> saveDocument(MultipartFile multipartFile) {
        responsMap = new HashedMap<String, Object>();

        try {
            FileUtils.saveFile(System.getProperty("user.dir") + "/docfiles/",
                    multipartFile.getOriginalFilename(), multipartFile);
            responsMap.put("status", true);
            responsMap.put("message", "File uploaded successfully");
            return responsMap;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            responsMap.put("status", false);
            responsMap.put("message", "Something is wrong, please try again!");
            return responsMap;

        }
    }

    private Map<String, Object> readText(File file) {
        responsMap = new HashedMap<String, Object>();
        if (file.getName().endsWith("doc")) {
            fileText = FileUtils.readWordDoc(file);
        } else if (file.getName().endsWith("docx")) {
            fileText = FileUtils.readWordDocx(file);
        } else if (file.getName().endsWith("pdf")) {
            fileText = FileUtils.readPdfFie(file);
        } else if (file.getName().endsWith("txt")) {
            fileText = FileUtils.readTxtFile(file);
        } else if (file.getName().endsWith("html")
                || file.getName().endsWith("htm")) {
            fileText = FileUtils.readHTMLFile(file);
        } else {
            responsMap.put("status", false);
            responsMap.put("message",
                    "txt, pdf, doc, docx, html fils are only accepted.");
            return responsMap;
        }

        responsMap.put("status", true);
        responsMap.put("data", fileText);
        return responsMap;
    }

    private Map<String, Object> addTokenInTable(
            final List<String> fileTokenList) {
        responsMap = new HashedMap<String, Object>();
        Integer countAgain = 1;
        for (String info : fileTokenList) {
            System.out.println("Final Token List is ::" + info);
            TableArrayModal tableArrayModal = new TableArrayModal();
            tableArrayModal.setNoOfArray(fileTokenList.size());
            tableArrayModal.setArrayIndex(countAgain.toString());
            tableArrayModal.setArray(info);
            tableArrayModal.setAlterNate(0);
            tableArrayModal.setUrlExclude(0);
            tableArrayModal.setComStatus(0);
            tableArrayModal.setDbStatus(0);
            tableArrayModal.setUrlExclude14(0);
            tableArrayRepository.addTableArrayRepository(tableArrayModal);
            countAgain++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println(" TOTAL TOKENS :: " + fileTokenList.size());
        System.out.println("");
        System.out.println("");
        responsMap.put("status", true);
        responsMap.put("message", "File uploaded successfully");
        return responsMap;

    }

    private Map<String, Object> addTokenInRegionalTable(
            final List<String> fileTokenList) {
        responsMap = new HashedMap<String, Object>();
        Integer countAgain = 1;
        for (String info : fileTokenList) {
            TableArrayRegional tableArrayModal = new TableArrayRegional();
            tableArrayModal.setNoOfArray(fileTokenList.size());
            tableArrayModal.setArrayIndex(countAgain.toString());
            tableArrayModal.setArray(info);
            tableArrayModal.setAlterNate(0);
            tableArrayModal.setUrlExclude(0);
            tableArrayModal.setComStatus(0);
            tableArrayModal.setDbStatus(0);
            tableArrayModal.setUrlExclude14(0);
            tableArrayRegionalRepository.addTableArrayRegional(tableArrayModal);
            countAgain++;
        }
        responsMap.put("status", true);
        responsMap.put("message", "File uploaded successfully");
        return responsMap;

    }

    private Map<String, Object> splitTokenandSave(final String[] fileText,
            String language) {
        responsMap = new HashedMap<String, Object>();
        if (fileText.length >= 0) {
            fileTExtArray = new ArrayList<String>();
            fileTExtArray.addAll(Arrays.asList(fileText));
            StringBuffer sb = new StringBuffer(); // used for concatinate
            fileTokenList = new ArrayList<String>();
            int count = 0;
            for (String data : fileTExtArray) {
                count++;
                String[] dataArray = data.split(" ");
                if (dataArray.length >= 25) {
                    fileTokenList.add(data);
                    sb = new StringBuffer();
                } else {
                    sb.append(data);
                    String newData = sb.toString();
                    String[] newDataArray = newData.split(" ");
                    if (newDataArray.length >= 25
                            || count == fileTExtArray.size()) {
                        fileTokenList.add(newData);
                        sb = new StringBuffer();
                    }
                }
            }

            responsMap.put("status", true);
            responsMap.put("data", fileTokenList);
            return responsMap;

        } else {

            responsMap.put("status", false);
            responsMap.put("message",
                    "There is no content available in your file.");
            return responsMap;
        }

    }

}
