package com.credgenics.job.upload.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tags", schema = "public", catalog = "local")
public class RecoveryTagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "company_id", nullable = false)
    private Object companyId;
    @Basic
    @Column(name = "loan_id", nullable = false, length = 64)
    private String loanId;
    @Basic
    @Column(name = "tag_name", nullable = false, length = -1)
    private String tagName;
    @Basic
    @Column(name = "created", nullable = true)
    private Timestamp created;
    @Basic
    @Column(name = "updated", nullable = true)
    private Timestamp updated;
    @Basic
    @Column(name = "active", nullable = true)
    private Boolean active;
    @Basic
    @Column(name = "allocation_month", nullable = false, length = 10)
    private String allocationMonth;
    @Basic
    @Column(name = "created_by", nullable = true, length = -1)
    private String createdBy;
    @Basic
    @Column(name = "updated_by", nullable = true, length = -1)
    private String updatedBy;
    @Basic
    @Column(name = "tag_expiry", nullable = true)
    private Timestamp tagExpiry;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;
    @Basic
    @Column(name = "source", nullable = false, length = 16)
    private String source;
    @Basic
    @Column(name = "workflow_id", nullable = true, length = -1)
    private String workflowId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAllocationMonth() {
        return allocationMonth;
    }

    public void setAllocationMonth(String allocationMonth) {
        this.allocationMonth = allocationMonth;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getTagExpiry() {
        return tagExpiry;
    }

    public void setTagExpiry(Timestamp tagExpiry) {
        this.tagExpiry = tagExpiry;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecoveryTagsEntity that = (RecoveryTagsEntity) o;
        return id == that.id && Objects.equals(companyId, that.companyId) && Objects.equals(loanId, that.loanId) && Objects.equals(tagName, that.tagName) && Objects.equals(created, that.created) && Objects.equals(updated, that.updated) && Objects.equals(active, that.active) && Objects.equals(allocationMonth, that.allocationMonth) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(tagExpiry, that.tagExpiry) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(source, that.source) && Objects.equals(workflowId, that.workflowId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, loanId, tagName, created, updated, active, allocationMonth, createdBy, updatedBy, tagExpiry, isDeleted, source, workflowId);
    }
}
