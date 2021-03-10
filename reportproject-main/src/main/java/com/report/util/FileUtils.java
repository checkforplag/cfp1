package com.report.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.davidmoten.text.utils.WordWrap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

    public static String saveFile(String uploadDir, String fileName,
            MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);
        String filepath = "";
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);

        }
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            filepath = filePath.toString();
            Files.copy(inputStream, filePath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName,
                    ioe);
        }
        return filepath;
    }

    public static String readWordDoc(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
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

    public static String readWordDocx(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
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

    public static String readPdfFie(File file) {
        try {
            PDDocument pd = PDDocument.load(file);
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

    public static String readTxtFile(File file) {
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

    public static String readHTMLFile(File file) {
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

//    public static void main(String args[]) {
//
//        String s1 = "प्राक्कथन\n"
//                + "‘आरा नगर’ बिहार राज्य तथा पटना प्रमंडल का एक पुराना नगर है। इसी प्राचीन नगर मे भोजपुर जिला का मुख्यालय है। बिहार राज्य की राजधनी ‘पटना नगर’ से इसकी दूरी मात्रा 60 किलोमीटर है। यह नगर देश के अन्य क्षेत्रों को जोड़ने वाली सड़के तथा रेलमार्ग की एक महत्वपूर्ण कड़ी है। यह नगर वाराणसी से 136 कि.मी. पूरब, गंगा नदी से 14 मील दक्षिण तथा सोन नदी से 8 कि.मी. पश्चिम में स्थित है। यह पूर्वी रेलवे की प्रधन शाखा तथा आरा ;सासाराम रेलवे लाइन का जंक्शन ;स्टेशनद्ध है। डिहरी आन-सोन से निकलकर आनेवाली बड़ी नहर की प्रमुख शाखा ;आरा नगरद्ध भी यहाँ से प्रवाहित होकर गंगा में मिल जाती है। आरा को 1865 में नगरपालिका बनाया गया।\n"
//                + "प्रस्तुत अध्ययन को पूर्ण कराने में सर्वप्रथम मैं अपने शोध् पर्यवेक्षक परम पूज्य गुरूवर डा॰ शम्भूनाथ सिंह, एमपी. कॉलेज, मोहनियाँ कैमूर, के प्रति श्रद्धावत् हूँ एवं हृदय से अभारी हूँ जिन्होने स्वंय व्यस्त रहते हुए भी अपने कुशल निर्देशन, प्रोत्साहन, आत्मीयता एवं यथोचित समालोचना के द्वारा इस अध्ययन को पूर्ण कराया।\n"
//                + "वीर कुँवर सिंह विश्वविद्यालय भूगोल विभाग के अध्यक्ष प्रो॰ केशव प्रसाद यादव तथा भूगोल विभाग के अन्य सभी सहायक आचार्य तथा सभी कार्यालय सदस्यों का भी मैं आभारी रहूँगी जिन्होंने प्रेरणा, सहयोग एवं सुभफाव द्वारा मेरे शोध् प्रबन्ध् को परिष्कृत करने में योगदान किया है।";
//
//        String newTest = "[kwclwjr ukf;dk gksus dk ?ke.M pwj&pwj gksuk rFkk jkuh dk [kafMrk ukf;dk cudj jg tkuk iwoZjkx esa Ikzcy mRd\"kZ n'kkZrk gSA in~ekorh ds ‚n; esa iwoZjkx ghjkeu dh ;qfDr ds vuqlkj vius ;ksx ls Ëkjrh&vkdk'k dks thrus okys jktk jRulsu ek?k ekl ds 'kqDy i{k ";
//
//        String test1 = "[kfygku Hkjuk] mudh fIkz; A jkuh ftl\\s vius Ikzse ij A vfr xoZ\\ Fkk mldk A lalkj dh lcls [kwclwjr A ukf;dk gksus dk \\?ke.M pwj&pwj gksuk rFkk\\ jkuh dk [kafMrk A ukf;dk cudj ]jg tkuk iwoZjkx esa] Ikzcy mRd\"kZ] n'kkZrk gSA in~ekorh ds ‚n; esa iwoZjkx ghjkeu dh ;qfDr ds vuqlkj vius ;ksx ls Ëkjrh ";
//        // System.out.println("String of 2c : " + Character.toString((char)
//        // 124));
//
//        String tamil = "இசை உலகில், இசை கொண்டு பக்தியினைப் பரப்பியவர்கள் பலர். நாயன்மார்கள்,\n"
//                + "ஆழ்வார்கள், புரந்தரதாசர், அன்னமாச்சாரியார், தமிழிசை மூவர், சங்கீத மூவர்,\n"
//                + "கோபால கிருஷ்ண பாரதி, நீலகண்ட சிவன், பாபநாசம் சிவன், தஞ்சை சங்கரய்யர்,\n"
//                + "எனக் கூறிக் கொண்டே போகலாம். இவர்களில் தமிழ் தியாகையா எனப்\n"
//                + "போற்றப்படுபவர் பாபநாசம் சிவன் அவர்கள். இவர் எளிய நடையில் பல தமிழ்க்\n"
//                + "கீர்த்தனைகளைத் தந்துள்ளார்.";
//
//        // checkUnicodeFile(test1, "hindi", null);
//    }

    public static Map<String, Object> checkUnicodeFile(String file,
            String fileLanguge, String fontName) {
        String checkUnicodeString = "";
        String[] sentence = {};
        String separater = "";
        String s = "41";

        Boolean isUnicode = false;
        file = file.trim().replaceAll("\\s+{2,}", " ");
        String[] fileArray = WordWrap.from(file).maxWidth(100).newLine("\n")
                .breakWords(false).wrap().split("\n");
        if (fileArray.length > 5) {
            checkUnicodeString = fileArray[6];
        } else {
            checkUnicodeString = fileArray[0];
        }
        // sentence =
        // file.split(Character.toString((char) 124));
        // System.out.println(sentence[1]);

        switch (fileLanguge) {

        case "hindi":
            // boolean isHindi = false;

            System.out.println("You are in Hindi");
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                System.out.println("It is not Hindi Text");
                switch (fontName) {
                case "chanakya":
                    sentence = file.split("[,.?!]");
                    break;
                default:
                    sentence = file.split("[]!-\'A]");
                    break;
                }

            }
            break;

        case "asamiya":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0980 && c < 0x09FF) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।?!]");
                break;
            }
            break;

        case "bengali":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0980 && c < 0x09FF) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।?!]");
                break;
            }
            break;

        case "bhojpuri":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[]!-\'A]");
                break;
            }
            break;

        case "gujarati":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0A80 && c < 0x0AFF) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,.?]");
                break;
            }
            break;

        case "kannada":
            
            System.out.println("It Is Kannad");
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0C80 && c < 0x0CFF) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,.?]");
                break;
            }
            break;

        case "magahi":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।.?!]");
                break;
            }
            break;

        case "maithili":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।.?!]");
                break;
            }
            break;

        case "marathi":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।.?!]");
                break;
            }
            break;

        case "nepali":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                sentence = file.split("[,।.?!]");
                break;
            }
            break;

        case "punjabi":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0A00 && c < 0x0A7F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                switch (fontName) {

                case "AnmolLipi":
                    sentence = file.split("[],?A.]");
                    break;

                case "DrChatrikWeb":
                    sentence = file.split("[],?A.]");
                    break;

                case "Awaze":
                    sentence = file.split("[P,?A.]");
                    break;

                case "Satluj":
                    sentence = file.split("[,?A.]");
                    break;

                case "Asees":
                    sentence = file.split("[,?AH");
                    break;

                case "Joy":
                    sentence = file.split("[,?AH");
                    break;

                default:
                    sentence = file.split("[],?A.]");
                    break;

                }

            }
            break;

        case "sanskrit":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0900 && c < 0x097F) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                switch (fontName) {

                case "chanakya":
                    sentence = file.split("[,.?!]");
                    break;
                default:
                    sentence = file.split("[]!-\'A]");
                    break;

                }

            }
            break;

        case "tamil":
            for (int k = 0; k < Character.codePointCount(checkUnicodeString, 0,
                    checkUnicodeString.length()); k++) {
                int c = checkUnicodeString.codePointAt(k);
                if (c > 0x0B80 && c < 0x0BFF) {
                    isUnicode = true;
                    break;
                }
            }

            if (!isUnicode) {
                switch (fontName) {

                case "Bamini":
                    sentence = file.split("[,.?!]");
                    break;

                case "Boomi":
                    sentence = file.split("[,.?!]");
                    break;

                case "Tab":
                    sentence = file.split("[,.?!]");
                    break;

                case "Tscii":
                    sentence = file.split("[,|.?!]");
                    break;

                default:
                    sentence = file.split("[,|.?!]");
                    break;
                }

            }
            break;

        case "tibetan":
            break;

        case "urdu":
            break;

        default:
            break;

        }

        Map<String, Object> responseMap = new HashMap<String, Object>();
        responseMap.put("status", isUnicode);
        if (isUnicode) {
            responseMap.put("data", file);
        } else {
            responseMap.put("data", sentence);
        }
        return responseMap;

    }

}
