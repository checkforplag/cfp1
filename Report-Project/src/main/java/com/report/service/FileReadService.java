package com.report.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.report.modal.TableArrayModal;
import com.report.repository.TableArrayRepository;
import com.report.util.FileUtils;

@Service
public class FileReadService {

    @Autowired
    private TableArrayRepository tableArrayRepository;

    FileInputStream fileInputStream = null;
    PDDocument pd = null;
    String fileText = "";
    String simbolPattern = "/(?<=([,.?!]))\\s+/";
    List<String> tokenList;
    List<String> fileTExtArray;
    List<String> fileTokenList;
    Map<String, Object> responsMap;

    public Map<String, Object> readFileFromClient(MultipartFile multipartFile) {
        responsMap = new HashedMap<String, Object>();
        try {
            FileUtils.saveFile(System.getProperty("user.dir") + "/docfiles/",
                    multipartFile.getOriginalFilename(), multipartFile);
            File file = new File(System.getProperty("user.dir") + "/docfiles/"
                    + multipartFile.getOriginalFilename());
            if (file.getName().endsWith("doc")) {
                fileText = readWordDoc(file);
            } else if (file.getName().endsWith("docx")) {
                fileText = readWordDocx(file);
            } else if (file.getName().endsWith("pdf")) {
                fileText = readPdfFie(file);
            } else if (file.getName().endsWith("txt")) {
                fileText = readTxtFile(file);
            } else if (file.getName().endsWith("html")
                    || file.getName().endsWith("htm")) {
                fileText = readHTMLFile(file);
            } else {
                responsMap.put("status", false);
                responsMap.put("message",
                        "txt, pdf, doc, docx, html fils are only accepted.");
                return responsMap;
            }

            if (fileText != null && fileText.length() >= 0) {
                fileTExtArray = new ArrayList<String>();
                fileTExtArray.addAll(Arrays.asList(fileText.split("[,.?!]")));
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
                    tableArrayRepository
                            .addTableArrayRepository(tableArrayModal);
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

    private String readWordDoc(File file) {
        try {
            fileInputStream = new FileInputStream(file);
            HWPFDocument document = new HWPFDocument(fileInputStream);
            WordExtractor extractor = new WordExtractor(document);
            String wordFileString = extractor.getText();
            document.close();
            return wordFileString;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }

    }

    private String readWordDocx(File file) {
        try {
            fileInputStream = new FileInputStream(file);
            XWPFDocument document = new XWPFDocument(fileInputStream);
            XWPFWordExtractor extractor = new XWPFWordExtractor(document);
            String wordFileString = extractor.getText();
            extractor.close();
            return wordFileString;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;

        }

    }

    private String readPdfFie(File file) {
        try {
            pd = PDDocument.load(file);
            PDFTextStripper stripper = new PDFTextStripper();
            // stripper.setEndPage(20);
            String pdfString = stripper.getText(pd);
            pd.close();
            return pdfString;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    private String readTxtFile(File file) {
        try {
            Scanner sc = new Scanner(file);
            String data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine();
            }
            return data;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }

    }

    private String readHTMLFile(File file) {
        try {
            Document html = Jsoup.parse(file, "ISO-8859-1");
            // String title = html.title();
            String h1 = html.body().text();// .getElementsByTag("h1").text();
            return h1;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

}
