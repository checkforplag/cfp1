package com.report.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_array2")
public class TableArrayModal implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 174801834830205076L;
    
    
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
    @Column(name = "btag14")
    private String bTag14;
    @Column(name = "btag14_per")
    private String bTag14Per;
    @Column(name = "url14")
    private String url14;
    @Column(name = "para14")
    private String para14;
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
    @Column(name = "alternate")
    private Integer alterNate;
    @Column(name = "url_exclude")
    private Integer urlExclude;
    @Column(name = "com_status")
    private Integer comStatus;
    @Column(name = "db_status")
    private Integer dbStatus;

    public TableArrayModal() {
        // TODO Auto-generated constructor stub
    }

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

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
        this.dbStatus = dbStatus;
    }

    @Override
    public String toString() {
        return "TableArrayModal [id=" + id + ", uploadSrNo=" + uploadSrNo
                + ", noOfArray=" + noOfArray + ", arrayIndex=" + arrayIndex
                + ", array=" + array + ", bTag=" + bTag + ", bTagPer=" + bTagPer
                + ", url=" + url + ", para=" + para + ", bTag1=" + bTag1
                + ", bTagPer1=" + bTagPer1 + ", url1=" + url1 + ", para1="
                + para1 + ", bTag2=" + bTag2 + ", bTagPer2=" + bTagPer2
                + ", url2=" + url2 + ", pera2=" + pera2 + ", bTag14=" + bTag14
                + ", bTag14Per=" + bTag14Per + ", url14=" + url14 + ", para14="
                + para14 + ", urlExclude14=" + urlExclude14 + ", bTagDb="
                + bTagDb + ", bTagPerDb=" + bTagPerDb + ", filePathDB="
                + filePathDB + ", fullTextResult=" + fullTextResult
                + ", urlSelected=" + urlSelected + ", alterNate=" + alterNate
                + ", urlExclude=" + urlExclude + ", comStatus=" + comStatus
                + ", dbStatus=" + dbStatus + ", getId()=" + getId()
                + ", getUploadSrNo()=" + getUploadSrNo() + ", getNoOfArray()="
                + getNoOfArray() + ", getArrayIndex()=" + getArrayIndex()
                + ", getArray()=" + getArray() + ", getbTag()=" + getbTag()
                + ", getbTagPer()=" + getbTagPer() + ", getUrl()=" + getUrl()
                + ", getPara()=" + getPara() + ", getbTag1()=" + getbTag1()
                + ", getbTagPer1()=" + getbTagPer1() + ", getUrl1()="
                + getUrl1() + ", getPara1()=" + getPara1() + ", getbTag2()="
                + getbTag2() + ", getbTagPer2()=" + getbTagPer2()
                + ", getUrl2()=" + getUrl2() + ", getPera2()=" + getPera2()
                + ", getbTag14()=" + getbTag14() + ", getbTag14Per()="
                + getbTag14Per() + ", getUrl14()=" + getUrl14()
                + ", getPara14()=" + getPara14() + ", getUrlExclude14()="
                + getUrlExclude14() + ", getbTagDb()=" + getbTagDb()
                + ", getbTagPerDb()=" + getbTagPerDb() + ", getFilePathDB()="
                + getFilePathDB() + ", getFullTextResult()="
                + getFullTextResult() + ", getUrlSelected()=" + getUrlSelected()
                + ", getAlterNate()=" + getAlterNate() + ", getUrlExclude()="
                + getUrlExclude() + ", getComStatus()=" + getComStatus()
                + ", getDbStatus()=" + getDbStatus() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}