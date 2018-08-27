package com.example.springbootdemo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "HRMS_HOUSE")
public class HrmsHouse {
    @Id
    @Column(name = "HRMS_HOUSE_ID")
    private Short hrmsHouseId;

    @Column(name = "HOUSE_NO")
    private String houseNo;

    @Column(name = "HOUSE_FOR_SHORT")
    private String houseForShort;

    @Column(name = "HOUSE_TYPE")
    private String houseType;

    @Column(name = "HOUSE_PROVINCE")
    private String houseProvince;

    @Column(name = "HOUSE_CITY")
    private String houseCity;

    @Column(name = "HOUSE_STREET")
    private String houseStreet;

    @Column(name = "HOUSE_STATUS")
    private String houseStatus;

    @Column(name = "HOUSE_AREA")
    private String houseArea;

    @Column(name = "BUNK")
    private String bunk;

    @Column(name = "LANDLORD_NAME")
    private String landlordName;

    @Column(name = "LANDLORD_PHONE")
    private String landlordPhone;

    @Column(name = "AGENCY_NAME")
    private String agencyName;

    @Column(name = "AGENCY_LINKMAN")
    private String agencyLinkman;

    @Column(name = "AGENCY_PHONE")
    private String agencyPhone;

    @Column(name = "HOUSE_REMARK")
    private String houseRemark;

    @Column(name = "CREATED_BY")
    private Short createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Short lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /**
     * @return HRMS_HOUSE_ID
     */
    public Short getHrmsHouseId() {
        return hrmsHouseId;
    }

    /**
     * @param hrmsHouseId
     */
    public void setHrmsHouseId(Short hrmsHouseId) {
        this.hrmsHouseId = hrmsHouseId;
    }

    /**
     * @return HOUSE_NO
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * @param houseNo
     */
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * @return HOUSE_FOR_SHORT
     */
    public String getHouseForShort() {
        return houseForShort;
    }

    /**
     * @param houseForShort
     */
    public void setHouseForShort(String houseForShort) {
        this.houseForShort = houseForShort;
    }

    /**
     * @return HOUSE_TYPE
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * @param houseType
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    /**
     * @return HOUSE_PROVINCE
     */
    public String getHouseProvince() {
        return houseProvince;
    }

    /**
     * @param houseProvince
     */
    public void setHouseProvince(String houseProvince) {
        this.houseProvince = houseProvince;
    }

    /**
     * @return HOUSE_CITY
     */
    public String getHouseCity() {
        return houseCity;
    }

    /**
     * @param houseCity
     */
    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }

    /**
     * @return HOUSE_STREET
     */
    public String getHouseStreet() {
        return houseStreet;
    }

    /**
     * @param houseStreet
     */
    public void setHouseStreet(String houseStreet) {
        this.houseStreet = houseStreet;
    }

    /**
     * @return HOUSE_STATUS
     */
    public String getHouseStatus() {
        return houseStatus;
    }

    /**
     * @param houseStatus
     */
    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    /**
     * @return HOUSE_AREA
     */
    public String getHouseArea() {
        return houseArea;
    }

    /**
     * @param houseArea
     */
    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    /**
     * @return BUNK
     */
    public String getBunk() {
        return bunk;
    }

    /**
     * @param bunk
     */
    public void setBunk(String bunk) {
        this.bunk = bunk;
    }

    /**
     * @return LANDLORD_NAME
     */
    public String getLandlordName() {
        return landlordName;
    }

    /**
     * @param landlordName
     */
    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    /**
     * @return LANDLORD_PHONE
     */
    public String getLandlordPhone() {
        return landlordPhone;
    }

    /**
     * @param landlordPhone
     */
    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone;
    }

    /**
     * @return AGENCY_NAME
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * @param agencyName
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * @return AGENCY_LINKMAN
     */
    public String getAgencyLinkman() {
        return agencyLinkman;
    }

    /**
     * @param agencyLinkman
     */
    public void setAgencyLinkman(String agencyLinkman) {
        this.agencyLinkman = agencyLinkman;
    }

    /**
     * @return AGENCY_PHONE
     */
    public String getAgencyPhone() {
        return agencyPhone;
    }

    /**
     * @param agencyPhone
     */
    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    /**
     * @return HOUSE_REMARK
     */
    public String getHouseRemark() {
        return houseRemark;
    }

    /**
     * @param houseRemark
     */
    public void setHouseRemark(String houseRemark) {
        this.houseRemark = houseRemark;
    }

    /**
     * @return CREATED_BY
     */
    public Short getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(Short createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return CREATION_DATE
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return LAST_UPDATED_BY
     */
    public Short getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * @param lastUpdatedBy
     */
    public void setLastUpdatedBy(Short lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * @return LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}