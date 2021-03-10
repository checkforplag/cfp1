package com.report.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_array_regional1")
public class TableArrayRegional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sr_no")
    private Integer id;

    @Column(name = "upload_sr_no")
    private Integer uploadSrNo;

    @Column(name = "no_of_array")
    private Integer noOfArray;

    @Column(name = "array_index")
    private String arrayIndex;

    @Column(name = "array")
    private String array;
    @Column(name = "array_nu")
    private String arrayNu;

    @Column(name = "b_tag")
    private String bTag;

    @Column(name = "b_tag_per")
    private Float bTagPer;

    @Column(name = "url")
    private String url;

    @Column(name = "para")
    private String para;

    @Column(name = "b_tag1")
    private String bTag1;

    @Column(name = "b_tag_per1")
    private String bTagPer1;

    @Column(name = "url1")
    private String url1;
    @Column(name = "para1")
    private String para1;

    @Column(name = "b_tag2")
    private String bTag2;
    @Column(name = "b_tag_per2")
    private Float bTagPer2;

    @Column(name = "url2")
    private String url2;

    @Column(name = "para2")
    private String pera2;

    @Column(name = "b_tag_nu")
    private String bTagNu;
    @Column(name = "b_tag_per_nu")
    private Float bTagPerNu;

    @Column(name = "url_nu")
    private String urlNu;

    @Column(name = "para_nu")
    private String peraNu;

    @Column(name = "b_tag_nu1")
    private String bTagNu1;
    @Column(name = "b_tag_per_nu1")
    private Float bTagPerNu1;

    @Column(name = "url_nu1")
    private String urlNu1;

    @Column(name = "para_nu1")
    private String peraNu1;

    @Column(name = "b_tag_nu2")
    private String bTagNu2;
    @Column(name = "b_tag_per_nu2")
    private Float bTagPerNu2;

    @Column(name = "url_nu2")
    private String urlNu2;

    @Column(name = "para_nu2")
    private String peraNu2;

    @Column(name = "btag14")
    private String bTag14;
    @Column(name = "btag14_per")
    private String bTag14Per;

    @Column(name = "url14")
    private String url14;

    @Column(name = "para14")
    private String para14;

    @Column(name = "btag14_nu")
    private String bTag14Nu;
    @Column(name = "btag14_perNU")
    private String bTag14PerNu;

    @Column(name = "url14_nu")
    private String url14Nu;

    @Column(name = "para14_nu")
    private String para14Nu;

    @Column(name = "url_exclude14")
    private Integer urlExclude14;

    @Column(name = "b_tag_db")
    private String bTagDb;

    @Column(name = "b_tag_per_db")
    private Float bTagPerDb;

    @Column(name = "file_path_db")
    private String filePathDB;
    @Column(name = "fulltext_result")
    private String fullTextResult;

    @Column(name = "url_selected")
    private String urlSelected;

    @Column(name = "url_selected14")
    private String urlSelected14;

    @Column(name = "alternate")
    private Integer alterNate;

    @Column(name = "url_exclude")
    private Integer urlExclude;
    @Column(name = "com_status")
    private Integer comStatus;

    @Column(name = "com_status_nu")
    private Integer comStatusNu;

    @Column(name = "uni_status")
    private Integer uniStatus;

    @Column(name = "db_status")
    private Integer dbStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUploadSrNo() {
        return uploadSrNo;
    }

    public void setUploadSrNo(Integer uploadSrNo) {
        this.uploadSrNo = uploadSrNo;
    }

    public Integer getNoOfArray() {
        return noOfArray;
    }

    public void setNoOfArray(Integer noOfArray) {
        this.noOfArray = noOfArray;
    }

    public String getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(String arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array = array;
    }

    public String getArrayNu() {
        return arrayNu;
    }

    public void setArrayNu(String arrayNu) {
        this.arrayNu = arrayNu;
    }

    public String getbTag() {
        return bTag;
    }

    public void setbTag(String bTag) {
        this.bTag = bTag;
    }

    public Float getbTagPer() {
        return bTagPer;
    }

    public void setbTagPer(Float bTagPer) {
        this.bTagPer = bTagPer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getbTag1() {
        return bTag1;
    }

    public void setbTag1(String bTag1) {
        this.bTag1 = bTag1;
    }

    public String getbTagPer1() {
        return bTagPer1;
    }

    public void setbTagPer1(String bTagPer1) {
        this.bTagPer1 = bTagPer1;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getPara1() {
        return para1;
    }

    public void setPara1(String para1) {
        this.para1 = para1;
    }

    public String getbTag2() {
        return bTag2;
    }

    public void setbTag2(String bTag2) {
        this.bTag2 = bTag2;
    }

    public Float getbTagPer2() {
        return bTagPer2;
    }

    public void setbTagPer2(Float bTagPer2) {
        this.bTagPer2 = bTagPer2;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getPera2() {
        return pera2;
    }

    public void setPera2(String pera2) {
        this.pera2 = pera2;
    }

    public String getbTagNu() {
        return bTagNu;
    }

    public void setbTagNu(String bTagNu) {
        this.bTagNu = bTagNu;
    }

    public Float getbTagPerNu() {
        return bTagPerNu;
    }

    public void setbTagPerNu(Float bTagPerNu) {
        this.bTagPerNu = bTagPerNu;
    }

    public String getUrlNu() {
        return urlNu;
    }

    public void setUrlNu(String urlNu) {
        this.urlNu = urlNu;
    }

    public String getPeraNu() {
        return peraNu;
    }

    public void setPeraNu(String peraNu) {
        this.peraNu = peraNu;
    }

    public String getbTagNu1() {
        return bTagNu1;
    }

    public void setbTagNu1(String bTagNu1) {
        this.bTagNu1 = bTagNu1;
    }

    public Float getbTagPerNu1() {
        return bTagPerNu1;
    }

    public void setbTagPerNu1(Float bTagPerNu1) {
        this.bTagPerNu1 = bTagPerNu1;
    }

    public String getUrlNu1() {
        return urlNu1;
    }

    public void setUrlNu1(String urlNu1) {
        this.urlNu1 = urlNu1;
    }

    public String getPeraNu1() {
        return peraNu1;
    }

    public void setPeraNu1(String peraNu1) {
        this.peraNu1 = peraNu1;
    }

    public String getbTagNu2() {
        return bTagNu2;
    }

    public void setbTagNu2(String bTagNu2) {
        this.bTagNu2 = bTagNu2;
    }

    public Float getbTagPerNu2() {
        return bTagPerNu2;
    }

    public void setbTagPerNu2(Float bTagPerNu2) {
        this.bTagPerNu2 = bTagPerNu2;
    }

    public String getUrlNu2() {
        return urlNu2;
    }

    public void setUrlNu2(String urlNu2) {
        this.urlNu2 = urlNu2;
    }

    public String getPeraNu2() {
        return peraNu2;
    }

    public void setPeraNu2(String peraNu2) {
        this.peraNu2 = peraNu2;
    }

    public String getbTag14() {
        return bTag14;
    }

    public void setbTag14(String bTag14) {
        this.bTag14 = bTag14;
    }

    public String getbTag14Per() {
        return bTag14Per;
    }

    public void setbTag14Per(String bTag14Per) {
        this.bTag14Per = bTag14Per;
    }

    public String getUrl14() {
        return url14;
    }

    public void setUrl14(String url14) {
        this.url14 = url14;
    }

    public String getPara14() {
        return para14;
    }

    public void setPara14(String para14) {
        this.para14 = para14;
    }

    public String getbTag14Nu() {
        return bTag14Nu;
    }

    public void setbTag14Nu(String bTag14Nu) {
        this.bTag14Nu = bTag14Nu;
    }

    public String getbTag14PerNu() {
        return bTag14PerNu;
    }

    public void setbTag14PerNu(String bTag14PerNu) {
        this.bTag14PerNu = bTag14PerNu;
    }

    public String getUrl14Nu() {
        return url14Nu;
    }

    public void setUrl14Nu(String url14Nu) {
        this.url14Nu = url14Nu;
    }

    public String getPara14Nu() {
        return para14Nu;
    }

    public void setPara14Nu(String para14Nu) {
        this.para14Nu = para14Nu;
    }

    public Integer getUrlExclude14() {
        return urlExclude14;
    }

    public void setUrlExclude14(Integer urlExclude14) {
        this.urlExclude14 = urlExclude14;
    }

    public String getbTagDb() {
        return bTagDb;
    }

    public void setbTagDb(String bTagDb) {
        this.bTagDb = bTagDb;
    }

    public Float getbTagPerDb() {
        return bTagPerDb;
    }

    public void setbTagPerDb(Float bTagPerDb) {
        this.bTagPerDb = bTagPerDb;
    }

    public String getFilePathDB() {
        return filePathDB;
    }

    public void setFilePathDB(String filePathDB) {
        this.filePathDB = filePathDB;
    }

    public String getFullTextResult() {
        return fullTextResult;
    }

    public void setFullTextResult(String fullTextResult) {
        this.fullTextResult = fullTextResult;
    }

    public String getUrlSelected() {
        return urlSelected;
    }

    public void setUrlSelected(String urlSelected) {
        this.urlSelected = urlSelected;
    }

    public String getUrlSelected14() {
        return urlSelected14;
    }

    public void setUrlSelected14(String urlSelected14) {
        this.urlSelected14 = urlSelected14;
    }

    public Integer getAlterNate() {
        return alterNate;
    }

    public void setAlterNate(Integer alterNate) {
        this.alterNate = alterNate;
    }

    public Integer getUrlExclude() {
        return urlExclude;
    }

    public void setUrlExclude(Integer urlExclude) {
        this.urlExclude = urlExclude;
    }

    public Integer getComStatus() {
        return comStatus;
    }

    public void setComStatus(Integer comStatus) {
        this.comStatus = comStatus;
    }

    public Integer getComStatusNu() {
        return comStatusNu;
    }

    public void setComStatusNu(Integer comStatusNu) {
        this.comStatusNu = comStatusNu;
    }

    public Integer getUniStatus() {
        return uniStatus;
    }

    public void setUniStatus(Integer uniStatus) {
        this.uniStatus = uniStatus;
    }

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
        this.dbStatus = dbStatus;
    }

    @Override
    public String toString() {
        return "TableArrayRegional [id=" + id + ", uploadSrNo=" + uploadSrNo
                + ", noOfArray=" + noOfArray + ", arrayIndex=" + arrayIndex
                + ", array=" + array + ", arrayNu=" + arrayNu + ", bTag=" + bTag
                + ", bTagPer=" + bTagPer + ", url=" + url + ", para=" + para
                + ", bTag1=" + bTag1 + ", bTagPer1=" + bTagPer1 + ", url1="
                + url1 + ", para1=" + para1 + ", bTag2=" + bTag2 + ", bTagPer2="
                + bTagPer2 + ", url2=" + url2 + ", pera2=" + pera2 + ", bTagNu="
                + bTagNu + ", bTagPerNu=" + bTagPerNu + ", urlNu=" + urlNu
                + ", peraNu=" + peraNu + ", bTagNu1=" + bTagNu1
                + ", bTagPerNu1=" + bTagPerNu1 + ", urlNu1=" + urlNu1
                + ", peraNu1=" + peraNu1 + ", bTagNu2=" + bTagNu2
                + ", bTagPerNu2=" + bTagPerNu2 + ", urlNu2=" + urlNu2
                + ", peraNu2=" + peraNu2 + ", bTag14=" + bTag14 + ", bTag14Per="
                + bTag14Per + ", url14=" + url14 + ", para14=" + para14
                + ", bTag14Nu=" + bTag14Nu + ", bTag14PerNu=" + bTag14PerNu
                + ", url14Nu=" + url14Nu + ", para14Nu=" + para14Nu
                + ", urlExclude14=" + urlExclude14 + ", bTagDb=" + bTagDb
                + ", bTagPerDb=" + bTagPerDb + ", filePathDB=" + filePathDB
                + ", fullTextResult=" + fullTextResult + ", urlSelected="
                + urlSelected + ", urlSelected14=" + urlSelected14
                + ", alterNate=" + alterNate + ", urlExclude=" + urlExclude
                + ", comStatus=" + comStatus + ", comStatusNu=" + comStatusNu
                + ", uniStatus=" + uniStatus + ", dbStatus=" + dbStatus + "]";
    }

    public TableArrayRegional() {
        // TODO Auto-generated constructor stub
    }

    public TableArrayRegional(Integer id, Integer uploadSrNo, Integer noOfArray,
            String arrayIndex, String array, String arrayNu, String bTag,
            Float bTagPer, String url, String para, String bTag1,
            String bTagPer1, String url1, String para1, String bTag2,
            Float bTagPer2, String url2, String pera2, String bTagNu,
            Float bTagPerNu, String urlNu, String peraNu, String bTagNu1,
            Float bTagPerNu1, String urlNu1, String peraNu1, String bTagNu2,
            Float bTagPerNu2, String urlNu2, String peraNu2, String bTag14,
            String bTag14Per, String url14, String para14, String bTag14Nu,
            String bTag14PerNu, String url14Nu, String para14Nu,
            Integer urlExclude14, String bTagDb, Float bTagPerDb,
            String filePathDB, String fullTextResult, String urlSelected,
            String urlSelected14, Integer alterNate, Integer urlExclude,
            Integer comStatus, Integer comStatusNu, Integer uniStatus,
            Integer dbStatus) {
        super();
        this.id = id;
        this.uploadSrNo = uploadSrNo;
        this.noOfArray = noOfArray;
        this.arrayIndex = arrayIndex;
        this.array = array;
        this.arrayNu = arrayNu;
        this.bTag = bTag;
        this.bTagPer = bTagPer;
        this.url = url;
        this.para = para;
        this.bTag1 = bTag1;
        this.bTagPer1 = bTagPer1;
        this.url1 = url1;
        this.para1 = para1;
        this.bTag2 = bTag2;
        this.bTagPer2 = bTagPer2;
        this.url2 = url2;
        this.pera2 = pera2;
        this.bTagNu = bTagNu;
        this.bTagPerNu = bTagPerNu;
        this.urlNu = urlNu;
        this.peraNu = peraNu;
        this.bTagNu1 = bTagNu1;
        this.bTagPerNu1 = bTagPerNu1;
        this.urlNu1 = urlNu1;
        this.peraNu1 = peraNu1;
        this.bTagNu2 = bTagNu2;
        this.bTagPerNu2 = bTagPerNu2;
        this.urlNu2 = urlNu2;
        this.peraNu2 = peraNu2;
        this.bTag14 = bTag14;
        this.bTag14Per = bTag14Per;
        this.url14 = url14;
        this.para14 = para14;
        this.bTag14Nu = bTag14Nu;
        this.bTag14PerNu = bTag14PerNu;
        this.url14Nu = url14Nu;
        this.para14Nu = para14Nu;
        this.urlExclude14 = urlExclude14;
        this.bTagDb = bTagDb;
        this.bTagPerDb = bTagPerDb;
        this.filePathDB = filePathDB;
        this.fullTextResult = fullTextResult;
        this.urlSelected = urlSelected;
        this.urlSelected14 = urlSelected14;
        this.alterNate = alterNate;
        this.urlExclude = urlExclude;
        this.comStatus = comStatus;
        this.comStatusNu = comStatusNu;
        this.uniStatus = uniStatus;
        this.dbStatus = dbStatus;
    }

}
