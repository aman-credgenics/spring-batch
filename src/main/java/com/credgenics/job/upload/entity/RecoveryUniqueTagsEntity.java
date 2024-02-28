package com.credgenics.job.upload.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "unique_tags", schema = "public", catalog = "local")
public class RecoveryUniqueTagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tag_id", nullable = false)
    private long tagId;
    @Basic
    @Column(name = "company_id", nullable = true)
    private Object companyId;
    @Basic
    @Column(name = "tag_name", nullable = false, length = 200)
    private String tagName;
    @Basic
    @Column(name = "allocation_month", nullable = false, length = 10)
    private String allocationMonth;
    @Basic
    @Column(name = "active", nullable = true)
    private Boolean active;
    @Basic
    @Column(name = "loan_tags_count", nullable = true)
    private Integer loanTagsCount;

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public Object getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getAllocationMonth() {
        return allocationMonth;
    }

    public void setAllocationMonth(String allocationMonth) {
        this.allocationMonth = allocationMonth;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getLoanTagsCount() {
        return loanTagsCount;
    }

    public void setLoanTagsCount(Integer loanTagsCount) {
        this.loanTagsCount = loanTagsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecoveryUniqueTagsEntity that = (RecoveryUniqueTagsEntity) o;
        return tagId == that.tagId && Objects.equals(companyId, that.companyId) && Objects.equals(tagName, that.tagName) && Objects.equals(allocationMonth, that.allocationMonth) && Objects.equals(active, that.active) && Objects.equals(loanTagsCount, that.loanTagsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, companyId, tagName, allocationMonth, active, loanTagsCount);
    }
}
