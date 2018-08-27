package com.example.springbootdemo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "HRMS_PERSONNEL")
public class HrmsPersonnel {
    @Id
    @Column(name = "HRMS_PERSONNEL_ID")
    private Short hrmsPersonnelId;

    @Column(name = "PERSONNEL_NO")
    private String personnelNo;

    @Column(name = "PERSONNEL_JOB_NUM")
    private String personnelJobNum;

    @Column(name = "PERSONNEL_NAME")
    private String personnelName;

    @Column(name = "PERSONNEL_SEX")
    private String personnelSex;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "BASE_LAND")
    private String baseLand;

    @Column(name = "PERSONNEL_PHONE")
    private String personnelPhone;

    @Column(name = "PERSONNEL_EMAIL")
    private String personnelEmail;

    @Column(name = "PERSONNEL_STATUS")
    private String personnelStatus;

    @Column(name = "PERSONNEL_REMARK")
    private String personnelRemark;

    @Column(name = "CREATED_BY")
    private Short createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Short lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /**
     * @return HRMS_PERSONNEL_ID
     */
    public Short getHrmsPersonnelId() {
        return hrmsPersonnelId;
    }

    /**
     * @param hrmsPersonnelId
     */
    public void setHrmsPersonnelId(Short hrmsPersonnelId) {
        this.hrmsPersonnelId = hrmsPersonnelId;
    }

    /**
     * @return PERSONNEL_NO
     */
    public String getPersonnelNo() {
        return personnelNo;
    }

    /**
     * @param personnelNo
     */
    public void setPersonnelNo(String personnelNo) {
        this.personnelNo = personnelNo;
    }

    /**
     * @return PERSONNEL_JOB_NUM
     */
    public String getPersonnelJobNum() {
        return personnelJobNum;
    }

    /**
     * @param personnelJobNum
     */
    public void setPersonnelJobNum(String personnelJobNum) {
        this.personnelJobNum = personnelJobNum;
    }

    /**
     * @return PERSONNEL_NAME
     */
    public String getPersonnelName() {
        return personnelName;
    }

    /**
     * @param personnelName
     */
    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    /**
     * @return PERSONNEL_SEX
     */
    public String getPersonnelSex() {
        return personnelSex;
    }

    /**
     * @param personnelSex
     */
    public void setPersonnelSex(String personnelSex) {
        this.personnelSex = personnelSex;
    }

    /**
     * @return DEPARTMENT_NAME
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return BASE_LAND
     */
    public String getBaseLand() {
        return baseLand;
    }

    /**
     * @param baseLand
     */
    public void setBaseLand(String baseLand) {
        this.baseLand = baseLand;
    }

    /**
     * @return PERSONNEL_PHONE
     */
    public String getPersonnelPhone() {
        return personnelPhone;
    }

    /**
     * @param personnelPhone
     */
    public void setPersonnelPhone(String personnelPhone) {
        this.personnelPhone = personnelPhone;
    }

    /**
     * @return PERSONNEL_EMAIL
     */
    public String getPersonnelEmail() {
        return personnelEmail;
    }

    /**
     * @param personnelEmail
     */
    public void setPersonnelEmail(String personnelEmail) {
        this.personnelEmail = personnelEmail;
    }

    /**
     * @return PERSONNEL_STATUS
     */
    public String getPersonnelStatus() {
        return personnelStatus;
    }

    /**
     * @param personnelStatus
     */
    public void setPersonnelStatus(String personnelStatus) {
        this.personnelStatus = personnelStatus;
    }

    /**
     * @return PERSONNEL_REMARK
     */
    public String getPersonnelRemark() {
        return personnelRemark;
    }

    /**
     * @param personnelRemark
     */
    public void setPersonnelRemark(String personnelRemark) {
        this.personnelRemark = personnelRemark;
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

    @Override
    public String toString() {
        return "HrmsPersonnel{" +
                "hrmsPersonnelId=" + hrmsPersonnelId +
                ", personnelNo='" + personnelNo + '\'' +
                ", personnelJobNum='" + personnelJobNum + '\'' +
                ", personnelName='" + personnelName + '\'' +
                ", personnelSex='" + personnelSex + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", baseLand='" + baseLand + '\'' +
                ", personnelPhone='" + personnelPhone + '\'' +
                ", personnelEmail='" + personnelEmail + '\'' +
                ", personnelStatus='" + personnelStatus + '\'' +
                ", personnelRemark='" + personnelRemark + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}