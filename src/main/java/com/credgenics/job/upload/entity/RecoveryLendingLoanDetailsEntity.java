package com.credgenics.job.upload.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "lending_loan_details", schema = "public", catalog = "local")
@IdClass(com.credgenics.job.upload.entity.RecoveryLendingLoanDetailsEntityPK.class)
public class RecoveryLendingLoanDetailsEntity {
    @Basic
    @jakarta.persistence.Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "company_id", nullable = false)
    private Object companyId;

    public Object getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "loan_id", nullable = false, length = -1)
    private String loanId;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    @Basic
    @Column(name = "customer_id", nullable = true)
    private Object customerId;

    public Object getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "loan_details", nullable = false)
    private Object loanDetails;

    public Object getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(Object loanDetails) {
        this.loanDetails = loanDetails;
    }

    @Basic
    @Column(name = "last_remark", nullable = true, length = -1)
    private String lastRemark;

    public String getLastRemark() {
        return lastRemark;
    }

    public void setLastRemark(String lastRemark) {
        this.lastRemark = lastRemark;
    }

    @Basic
    @Column(name = "last_remark_date", nullable = true)
    private Timestamp lastRemarkDate;

    public Timestamp getLastRemarkDate() {
        return lastRemarkDate;
    }

    public void setLastRemarkDate(Timestamp lastRemarkDate) {
        this.lastRemarkDate = lastRemarkDate;
    }

    @Basic
    @Column(name = "archive", nullable = true)
    private Boolean archive;

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Basic
    @Column(name = "updated_by", nullable = true, length = -1)
    private String updatedBy;

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "created_by", nullable = false, length = -1)
    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created", nullable = true)
    private Timestamp created;

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "updated", nullable = true)
    private Timestamp updated;

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Basic
    @Column(name = "loan_type", nullable = true, length = 256)
    private String loanType;

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Basic
    @Column(name = "product_type", nullable = true, length = 256)
    private String productType;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "loan_nbfc_name", nullable = true, length = 256)
    private String loanNbfcName;

    public String getLoanNbfcName() {
        return loanNbfcName;
    }

    public void setLoanNbfcName(String loanNbfcName) {
        this.loanNbfcName = loanNbfcName;
    }

    @Basic
    @Column(name = "applicant_language", nullable = true, length = -1)
    private Object applicantLanguage;

    public Object getApplicantLanguage() {
        return applicantLanguage;
    }

    public void setApplicantLanguage(Object applicantLanguage) {
        this.applicantLanguage = applicantLanguage;
    }

    @Basic
    @Column(name = "applicant_email", nullable = true, length = -1)
    private Object applicantEmail;

    public Object getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(Object applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    @Basic
    @Column(name = "applicant_contact_number", nullable = true, length = -1)
    private Object applicantContactNumber;

    public Object getApplicantContactNumber() {
        return applicantContactNumber;
    }

    public void setApplicantContactNumber(Object applicantContactNumber) {
        this.applicantContactNumber = applicantContactNumber;
    }

    @Basic
    @Column(name = "co_applicant", nullable = true)
    private Object coApplicant;

    public Object getCoApplicant() {
        return coApplicant;
    }

    public void setCoApplicant(Object coApplicant) {
        this.coApplicant = coApplicant;
    }

    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "author", nullable = true, length = -1)
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "role", nullable = true, length = -1)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "created_by_role", nullable = true, length = -1)
    private String createdByRole;

    public String getCreatedByRole() {
        return createdByRole;
    }

    public void setCreatedByRole(String createdByRole) {
        this.createdByRole = createdByRole;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    private Timestamp deleted;

    public void setDeleted(Timestamp deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "cg_customer_id", nullable = true)
    private Object cgCustomerId;

    public Object getCgCustomerId() {
        return cgCustomerId;
    }

    public void setCgCustomerId(Object cgCustomerId) {
        this.cgCustomerId = cgCustomerId;
    }

    @Basic
    @Column(name = "client_source", nullable = true, length = 26)
    private String clientSource;

    public String getClientSource() {
        return clientSource;
    }

    public void setClientSource(String clientSource) {
        this.clientSource = clientSource;
    }

    @Basic
    @Column(name = "applicant_data", nullable = true)
    private Object applicantData;

    public Object getApplicantData() {
        return applicantData;
    }

    public void setApplicantData(Object applicantData) {
        this.applicantData = applicantData;
    }

    @Basic
    @Column(name = "co_applicant_data", nullable = true)
    private Object coApplicantData;

    public Object getCoApplicantData() {
        return coApplicantData;
    }

    public void setCoApplicantData(Object coApplicantData) {
        this.coApplicantData = coApplicantData;
    }

    @Basic
    @Column(name = "references_data", nullable = true)
    private Object referencesData;

    public Object getReferencesData() {
        return referencesData;
    }

    public void setReferencesData(Object referencesData) {
        this.referencesData = referencesData;
    }

    @Basic
    @Column(name = "client_customer_id", nullable = true, length = -1)
    private String clientCustomerId;

    public String getClientCustomerId() {
        return clientCustomerId;
    }

    public void setClientCustomerId(String clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
    }

    @Basic
    @Column(name = "guarantor_data", nullable = true)
    private Object guarantorData;

    public Object getGuarantorData() {
        return guarantorData;
    }

    public void setGuarantorData(Object guarantorData) {
        this.guarantorData = guarantorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecoveryLendingLoanDetailsEntity that = (RecoveryLendingLoanDetailsEntity) o;
        return id == that.id && Objects.equals(companyId, that.companyId) && Objects.equals(loanId, that.loanId) && Objects.equals(customerId, that.customerId) && Objects.equals(loanDetails, that.loanDetails) && Objects.equals(lastRemark, that.lastRemark) && Objects.equals(lastRemarkDate, that.lastRemarkDate) && Objects.equals(archive, that.archive) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(createdBy, that.createdBy) && Objects.equals(created, that.created) && Objects.equals(updated, that.updated) && Objects.equals(loanType, that.loanType) && Objects.equals(productType, that.productType) && Objects.equals(loanNbfcName, that.loanNbfcName) && Objects.equals(applicantLanguage, that.applicantLanguage) && Objects.equals(applicantEmail, that.applicantEmail) && Objects.equals(applicantContactNumber, that.applicantContactNumber) && Objects.equals(coApplicant, that.coApplicant) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(author, that.author) && Objects.equals(role, that.role) && Objects.equals(createdByRole, that.createdByRole) && Objects.equals(deleted, that.deleted) && Objects.equals(cgCustomerId, that.cgCustomerId) && Objects.equals(clientSource, that.clientSource) && Objects.equals(applicantData, that.applicantData) && Objects.equals(coApplicantData, that.coApplicantData) && Objects.equals(referencesData, that.referencesData) && Objects.equals(clientCustomerId, that.clientCustomerId) && Objects.equals(guarantorData, that.guarantorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, loanId, customerId, loanDetails, lastRemark, lastRemarkDate, archive, updatedBy, createdBy, created, updated, loanType, productType, loanNbfcName, applicantLanguage, applicantEmail, applicantContactNumber, coApplicant, isDeleted, author, role, createdByRole, deleted, cgCustomerId, clientSource, applicantData, coApplicantData, referencesData, clientCustomerId, guarantorData);
    }
}
