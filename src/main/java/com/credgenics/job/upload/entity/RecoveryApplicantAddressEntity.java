package com.credgenics.job.upload.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "applicant_address", schema = "public", catalog = "local")
public class RecoveryApplicantAddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    private Object companyId;

    public Object getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "loan_id", nullable = false, length = -1)
    private String loanId;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    @Basic
    @Column(name = "applicant_address_type", nullable = true, length = -1)
    private String applicantAddressType;

    public String getApplicantAddressType() {
        return applicantAddressType;
    }

    public void setApplicantAddressType(String applicantAddressType) {
        this.applicantAddressType = applicantAddressType;
    }

    @Basic
    @Column(name = "applicant_address_text", nullable = true, length = -1)
    private String applicantAddressText;

    public String getApplicantAddressText() {
        return applicantAddressText;
    }

    public void setApplicantAddressText(String applicantAddressText) {
        this.applicantAddressText = applicantAddressText;
    }

    @Basic
    @Column(name = "applicant_state", nullable = true, length = -1)
    private String applicantState;

    public String getApplicantState() {
        return applicantState;
    }

    public void setApplicantState(String applicantState) {
        this.applicantState = applicantState;
    }

    @Basic
    @Column(name = "applicant_city", nullable = true, length = -1)
    private String applicantCity;

    public String getApplicantCity() {
        return applicantCity;
    }

    public void setApplicantCity(String applicantCity) {
        this.applicantCity = applicantCity;
    }

    @Basic
    @Column(name = "applicant_pincode", nullable = true)
    private Integer applicantPincode;

    public Integer getApplicantPincode() {
        return applicantPincode;
    }

    public void setApplicantPincode(Integer applicantPincode) {
        this.applicantPincode = applicantPincode;
    }

    @Basic
    @Column(name = "applicant_landmark", nullable = true, length = -1)
    private String applicantLandmark;

    public String getApplicantLandmark() {
        return applicantLandmark;
    }

    public void setApplicantLandmark(String applicantLandmark) {
        this.applicantLandmark = applicantLandmark;
    }

    @Basic
    @Column(name = "location_coordinates", nullable = true)
    private Object locationCoordinates;

    public Object getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(Object locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
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
    @Column(name = "archive", nullable = false)
    private boolean archive;

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    @Basic
    @Column(name = "address_index", nullable = true)
    private Integer addressIndex;

    public Integer getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(Integer addressIndex) {
        this.addressIndex = addressIndex;
    }

    @Basic
    @Column(name = "applicant_address_longitude", nullable = true, length = -1)
    private String applicantAddressLongitude;

    public String getApplicantAddressLongitude() {
        return applicantAddressLongitude;
    }

    public void setApplicantAddressLongitude(String applicantAddressLongitude) {
        this.applicantAddressLongitude = applicantAddressLongitude;
    }

    @Basic
    @Column(name = "applicant_address_latitude", nullable = true, length = -1)
    private String applicantAddressLatitude;

    public String getApplicantAddressLatitude() {
        return applicantAddressLatitude;
    }

    public void setApplicantAddressLatitude(String applicantAddressLatitude) {
        this.applicantAddressLatitude = applicantAddressLatitude;
    }

    @Basic
    @Column(name = "created_by", nullable = true, length = -1)
    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    private Timestamp deleted;

    public void setDeleted(Timestamp deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "is_active", nullable = true)
    private Boolean isActive;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "is_valid", nullable = true)
    private Boolean isValid;

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecoveryApplicantAddressEntity that = (RecoveryApplicantAddressEntity) o;
        return id == that.id && archive == that.archive && Objects.equals(companyId, that.companyId) && Objects.equals(loanId, that.loanId) && Objects.equals(applicantAddressType, that.applicantAddressType) && Objects.equals(applicantAddressText, that.applicantAddressText) && Objects.equals(applicantState, that.applicantState) && Objects.equals(applicantCity, that.applicantCity) && Objects.equals(applicantPincode, that.applicantPincode) && Objects.equals(applicantLandmark, that.applicantLandmark) && Objects.equals(locationCoordinates, that.locationCoordinates) && Objects.equals(author, that.author) && Objects.equals(created, that.created) && Objects.equals(updated, that.updated) && Objects.equals(addressIndex, that.addressIndex) && Objects.equals(applicantAddressLongitude, that.applicantAddressLongitude) && Objects.equals(applicantAddressLatitude, that.applicantAddressLatitude) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(deleted, that.deleted) && Objects.equals(isActive, that.isActive) && Objects.equals(isValid, that.isValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, loanId, applicantAddressType, applicantAddressText, applicantState, applicantCity, applicantPincode, applicantLandmark, locationCoordinates, author, created, updated, archive, addressIndex, applicantAddressLongitude, applicantAddressLatitude, createdBy, updatedBy, isDeleted, deleted, isActive, isValid);
    }
}
