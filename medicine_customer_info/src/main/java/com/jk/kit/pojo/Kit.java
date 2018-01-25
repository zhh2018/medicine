package com.jk.kit.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kit implements Serializable{
    private static final long serialVersionUID = -4898750838859309218L;
    private Integer kitId;

    private String kitName;

    private Short kitType;

    private Short kitState;

    private Short kitBrand;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date kitAdddate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date kitUpdate;

    private Short kitShen;

    private Short kitShowlevel;

    private Integer kitHits;

    private Integer kitGrade;

    private Integer kitPrice;

    private String kitInfo;

    private String kitCompany;

    SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
    private   String   showAdddate;
    SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd");
    private   String   showupdate;

    private   String  brandName;

    private  Integer  kitPricemin;

    private  Integer  kitPricemax;

    private String kitAdddatemin;

    private String kitAdddatemax;
    public Integer getKitPricemin() {
        return kitPricemin;
    }

    public void setKitPricemin(Integer kitPricemin) {
        this.kitPricemin = kitPricemin;
    }

    public Integer getKitPricemax() {
        return kitPricemax;
    }

    public void setKitPricemax(Integer kitPricemax) {
        this.kitPricemax = kitPricemax;
    }

    public String getKitAdddatemin() {
        return kitAdddatemin;
    }

    public void setKitAdddatemin(String kitAdddatemin) {
        this.kitAdddatemin = kitAdddatemin;
    }

    public String getKitAdddatemax() {
        return kitAdddatemax;
    }

    public void setKitAdddatemax(String kitAdddatemax) {
        this.kitAdddatemax = kitAdddatemax;
    }

    public Integer getKitId() {
        return kitId;
    }

    public void setKitId(Integer kitId) {
        this.kitId = kitId;
    }

    public String getKitName() {
        return kitName;
    }

    public void setKitName(String kitName) {
        this.kitName = kitName == null ? null : kitName.trim();
    }

    public Short getKitType() {
        return kitType;
    }

    public void setKitType(Short kitType) {
        this.kitType = kitType;
    }

    public Short getKitState() {
        return kitState;
    }

    public void setKitState(Short kitState) {
        this.kitState = kitState;
    }

    public Short getKitBrand() {
        return kitBrand;
    }

    public void setKitBrand(Short kitBrand) {
        this.kitBrand = kitBrand;
    }

    public Date getKitAdddate() { return kitAdddate;  }

    public void setKitAdddate(Date kitAdddate) {
        this.kitAdddate = kitAdddate;
    }

    public Date getKitUpdate() {
        return kitUpdate;
    }

    public void setKitUpdate(Date kitUpdate) {
        this.kitUpdate = kitUpdate;
    }

    public Short getKitShen() {
        return kitShen;
    }

    public void setKitShen(Short kitShen) {
        this.kitShen = kitShen;
    }

    public Short getKitShowlevel() {
        return kitShowlevel;
    }

    public void setKitShowlevel(Short kitShowlevel) {
        this.kitShowlevel = kitShowlevel;
    }

    public Integer getKitHits() {
        return kitHits;
    }

    public void setKitHits(Integer kitHits) {
        this.kitHits = kitHits;
    }

    public Integer getKitGrade() {
        return kitGrade;
    }

    public void setKitGrade(Integer kitGrade) {
        this.kitGrade = kitGrade;
    }

    public Integer getKitPrice() {
        return kitPrice;
    }

    public void setKitPrice(Integer kitPrice) {
        this.kitPrice = kitPrice;
    }

    public String getKitInfo() {
        return kitInfo;
    }

    public void setKitInfo(String kitInfo) {
        this.kitInfo = kitInfo == null ? null : kitInfo.trim();
    }

    public String getKitCompany() {
        return kitCompany;
    }

    public void setKitCompany(String kitCompany) {
        this.kitCompany = kitCompany == null ? null : kitCompany.trim();
    }

    public String getShowAdddate() {
        return kitAdddate!=null?sim.format(kitAdddate):"";
    }

    public void setShowAdddate(String showAdddate) {
        this.showAdddate = showAdddate;
    }

    public String getShowupdate() {
        return kitUpdate!=null?sim.format(kitUpdate):"";
    }

    public void setShowupdate(String showupdate) {
        this.showupdate = showupdate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}