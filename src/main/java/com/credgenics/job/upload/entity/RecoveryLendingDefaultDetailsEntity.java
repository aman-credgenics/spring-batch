package com.credgenics.job.upload.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "lending_default_details", schema = "public", catalog = "local")
@IdClass(com.credgenics.job.upload.entity.RecoveryLendingDefaultDetailsEntityPK.class)
public class RecoveryLendingDefaultDetailsEntity {
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "allocation_month", nullable = false, length = -1)
    private String allocationMonth;

    public String getAllocationMonth() {
        return allocationMonth;
    }

    public void setAllocationMonth(String allocationMonth) {
        this.allocationMonth = allocationMonth;
    }

    @Basic
    @Column(name = "final_status", nullable = true, length = -1)
    private String finalStatus;

    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    @Basic
    @Column(name = "date_of_default", nullable = true, length = -1)
    private String dateOfDefault;

    public String getDateOfDefault() {
        return dateOfDefault;
    }

    public void setDateOfDefault(String dateOfDefault) {
        this.dateOfDefault = dateOfDefault;
    }

    @Basic
    @Column(name = "amount_recovered", nullable = true, precision = 0)
    private BigInteger amountRecovered;

    public BigInteger getAmountRecovered() {
        return amountRecovered;
    }

    public void setAmountRecovered(BigInteger amountRecovered) {
        this.amountRecovered = amountRecovered;
    }

    @Basic
    @Column(name = "total_claim_amount", nullable = true, precision = 0)
    private BigInteger totalClaimAmount;

    public BigInteger getTotalClaimAmount() {
        return totalClaimAmount;
    }

    public void setTotalClaimAmount(BigInteger totalClaimAmount) {
        this.totalClaimAmount = totalClaimAmount;
    }

    @Basic
    @Column(name = "late_fee", nullable = true, precision = 0)
    private BigInteger lateFee;

    public BigInteger getLateFee() {
        return lateFee;
    }

    public void setLateFee(BigInteger lateFee) {
        this.lateFee = lateFee;
    }

    @Basic
    @Column(name = "expected_emi", nullable = true, precision = 0)
    private BigInteger expectedEmi;

    public BigInteger getExpectedEmi() {
        return expectedEmi;
    }

    public void setExpectedEmi(BigInteger expectedEmi) {
        this.expectedEmi = expectedEmi;
    }

    @Basic
    @Column(name = "other_penalty", nullable = true, precision = 0)
    private BigInteger otherPenalty;

    public BigInteger getOtherPenalty() {
        return otherPenalty;
    }

    public void setOtherPenalty(BigInteger otherPenalty) {
        this.otherPenalty = otherPenalty;
    }

    @Basic
    @Column(name = "default_emi_number", nullable = true)
    private Integer defaultEmiNumber;

    public Integer getDefaultEmiNumber() {
        return defaultEmiNumber;
    }

    public void setDefaultEmiNumber(Integer defaultEmiNumber) {
        this.defaultEmiNumber = defaultEmiNumber;
    }

    @Basic
    @Column(name = "allocation_dpd_value", nullable = true)
    private Integer allocationDpdValue;

    public Integer getAllocationDpdValue() {
        return allocationDpdValue;
    }

    public void setAllocationDpdValue(Integer allocationDpdValue) {
        this.allocationDpdValue = allocationDpdValue;
    }

    @Basic
    @Column(name = "actual_date_of_default", nullable = true, length = -1)
    private String actualDateOfDefault;

    public String getActualDateOfDefault() {
        return actualDateOfDefault;
    }

    public void setActualDateOfDefault(String actualDateOfDefault) {
        this.actualDateOfDefault = actualDateOfDefault;
    }

    @Basic
    @Column(name = "allocation_dpd_bracket", nullable = true, length = -1)
    private String allocationDpdBracket;

    public String getAllocationDpdBracket() {
        return allocationDpdBracket;
    }

    public void setAllocationDpdBracket(String allocationDpdBracket) {
        this.allocationDpdBracket = allocationDpdBracket;
    }

    @Basic
    @Column(name = "dpd", nullable = true)
    private Integer dpd;

    public Integer getDpd() {
        return dpd;
    }

    public void setDpd(Integer dpd) {
        this.dpd = dpd;
    }

    @Basic
    @Column(name = "dpd_bracket", nullable = true, length = -1)
    private String dpdBracket;

    public String getDpdBracket() {
        return dpdBracket;
    }

    public void setDpdBracket(String dpdBracket) {
        this.dpdBracket = dpdBracket;
    }

    @Basic
    @Column(name = "client_amount_recovered", nullable = true, precision = 2)
    private BigDecimal clientAmountRecovered;

    public BigDecimal getClientAmountRecovered() {
        return clientAmountRecovered;
    }

    public void setClientAmountRecovered(BigDecimal clientAmountRecovered) {
        this.clientAmountRecovered = clientAmountRecovered;
    }

    @Basic
    @Column(name = "expected_emi_interest_amount", nullable = true, precision = 0)
    private BigInteger expectedEmiInterestAmount;

    public BigInteger getExpectedEmiInterestAmount() {
        return expectedEmiInterestAmount;
    }

    public void setExpectedEmiInterestAmount(BigInteger expectedEmiInterestAmount) {
        this.expectedEmiInterestAmount = expectedEmiInterestAmount;
    }

    @Basic
    @Column(name = "principal_outstanding_amount", nullable = true, precision = 0)
    private BigInteger principalOutstandingAmount;

    public BigInteger getPrincipalOutstandingAmount() {
        return principalOutstandingAmount;
    }

    public void setPrincipalOutstandingAmount(BigInteger principalOutstandingAmount) {
        this.principalOutstandingAmount = principalOutstandingAmount;
    }

    @Basic
    @Column(name = "expected_emi_principal_amount", nullable = true, precision = 0)
    private BigInteger expectedEmiPrincipalAmount;

    public BigInteger getExpectedEmiPrincipalAmount() {
        return expectedEmiPrincipalAmount;
    }

    public void setExpectedEmiPrincipalAmount(BigInteger expectedEmiPrincipalAmount) {
        this.expectedEmiPrincipalAmount = expectedEmiPrincipalAmount;
    }

    @Basic
    @Column(name = "settlement_amount", nullable = true, precision = 0)
    private BigInteger settlementAmount;

    public BigInteger getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigInteger settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    @Basic
    @Column(name = "payment_method", nullable = true, length = -1)
    private String paymentMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Basic
    @Column(name = "payment_mode", nullable = true, length = -1)
    private String paymentMode;

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Basic
    @Column(name = "recovery_date", nullable = true, length = -1)
    private String recoveryDate;

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(String recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    @Basic
    @Column(name = "recovery_method", nullable = true, length = -1)
    private String recoveryMethod;

    public String getRecoveryMethod() {
        return recoveryMethod;
    }

    public void setRecoveryMethod(String recoveryMethod) {
        this.recoveryMethod = recoveryMethod;
    }

    @Basic
    @Column(name = "reference_number", nullable = true, length = -1)
    private String referenceNumber;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Basic
    @Column(name = "closure_with", nullable = true, length = -1)
    private String closureWith;

    public String getClosureWith() {
        return closureWith;
    }

    public void setClosureWith(String closureWith) {
        this.closureWith = closureWith;
    }

    @Basic
    @Column(name = "additional_variables", nullable = true)
    private Object additionalVariables;

    public Object getAdditionalVariables() {
        return additionalVariables;
    }

    public void setAdditionalVariables(Object additionalVariables) {
        this.additionalVariables = additionalVariables;
    }

    @Basic
    @Column(name = "final_status_source", nullable = true, length = -1)
    private String finalStatusSource;

    public String getFinalStatusSource() {
        return finalStatusSource;
    }

    public void setFinalStatusSource(String finalStatusSource) {
        this.finalStatusSource = finalStatusSource;
    }

    @Basic
    @Column(name = "final_status_author", nullable = true, length = -1)
    private String finalStatusAuthor;

    public String getFinalStatusAuthor() {
        return finalStatusAuthor;
    }

    public void setFinalStatusAuthor(String finalStatusAuthor) {
        this.finalStatusAuthor = finalStatusAuthor;
    }

    @Basic
    @Column(name = "final_status_role", nullable = true, length = -1)
    private String finalStatusRole;

    public String getFinalStatusRole() {
        return finalStatusRole;
    }

    public void setFinalStatusRole(String finalStatusRole) {
        this.finalStatusRole = finalStatusRole;
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
    @Column(name = "updated_by", nullable = true, length = -1)
    private String updatedBy;

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
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
    @Column(name = "is_latest_allocation_month", nullable = true)
    private Boolean isLatestAllocationMonth;

    public Boolean getLatestAllocationMonth() {
        return isLatestAllocationMonth;
    }

    public void setLatestAllocationMonth(Boolean latestAllocationMonth) {
        isLatestAllocationMonth = latestAllocationMonth;
    }

    @Basic
    @Column(name = "amount_recovered_breakdown", nullable = true)
    private Object amountRecoveredBreakdown;

    public Object getAmountRecoveredBreakdown() {
        return amountRecoveredBreakdown;
    }

    public void setAmountRecoveredBreakdown(Object amountRecoveredBreakdown) {
        this.amountRecoveredBreakdown = amountRecoveredBreakdown;
    }

    @Basic
    @Column(name = "utilisation", nullable = true, precision = 2)
    private BigDecimal utilisation;

    public BigDecimal getUtilisation() {
        return utilisation;
    }

    public void setUtilisation(BigDecimal utilisation) {
        this.utilisation = utilisation;
    }

    @Basic
    @Column(name = "total_outstanding_amount", nullable = true, precision = 0)
    private BigInteger totalOutstandingAmount;

    public BigInteger getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    public void setTotalOutstandingAmount(BigInteger totalOutstandingAmount) {
        this.totalOutstandingAmount = totalOutstandingAmount;
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
    @Column(name = "uploaded_by", nullable = true, length = -1)
    private String uploadedBy;

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    @Basic
    @Column(name = "uploaded_by_role", nullable = true, length = -1)
    private String uploadedByRole;

    public String getUploadedByRole() {
        return uploadedByRole;
    }

    public void setUploadedByRole(String uploadedByRole) {
        this.uploadedByRole = uploadedByRole;
    }

    @Basic
    @Column(name = "updated_by_role", nullable = true, length = -1)
    private String updatedByRole;

    public String getUpdatedByRole() {
        return updatedByRole;
    }

    public void setUpdatedByRole(String updatedByRole) {
        this.updatedByRole = updatedByRole;
    }

    @Basic
    @Column(name = "last_call_status", nullable = true, length = -1)
    private String lastCallStatus;

    public String getLastCallStatus() {
        return lastCallStatus;
    }

    public void setLastCallStatus(String lastCallStatus) {
        this.lastCallStatus = lastCallStatus;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    private Timestamp deleted;

    public void setDeleted(Timestamp deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "advance_payment", nullable = true, precision = 0)
    private BigInteger advancePayment;

    public BigInteger getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(BigInteger advancePayment) {
        this.advancePayment = advancePayment;
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
    @Column(name = "digital_communication_end_date", nullable = true)
    private Date digitalCommunicationEndDate;

    public Date getDigitalCommunicationEndDate() {
        return digitalCommunicationEndDate;
    }

    public void setDigitalCommunicationEndDate(Date digitalCommunicationEndDate) {
        this.digitalCommunicationEndDate = digitalCommunicationEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecoveryLendingDefaultDetailsEntity that = (RecoveryLendingDefaultDetailsEntity) o;
        return id == that.id && Objects.equals(companyId, that.companyId) && Objects.equals(loanId, that.loanId) && Objects.equals(allocationMonth, that.allocationMonth) && Objects.equals(finalStatus, that.finalStatus) && Objects.equals(dateOfDefault, that.dateOfDefault) && Objects.equals(amountRecovered, that.amountRecovered) && Objects.equals(totalClaimAmount, that.totalClaimAmount) && Objects.equals(lateFee, that.lateFee) && Objects.equals(expectedEmi, that.expectedEmi) && Objects.equals(otherPenalty, that.otherPenalty) && Objects.equals(defaultEmiNumber, that.defaultEmiNumber) && Objects.equals(allocationDpdValue, that.allocationDpdValue) && Objects.equals(actualDateOfDefault, that.actualDateOfDefault) && Objects.equals(allocationDpdBracket, that.allocationDpdBracket) && Objects.equals(dpd, that.dpd) && Objects.equals(dpdBracket, that.dpdBracket) && Objects.equals(clientAmountRecovered, that.clientAmountRecovered) && Objects.equals(expectedEmiInterestAmount, that.expectedEmiInterestAmount) && Objects.equals(principalOutstandingAmount, that.principalOutstandingAmount) && Objects.equals(expectedEmiPrincipalAmount, that.expectedEmiPrincipalAmount) && Objects.equals(settlementAmount, that.settlementAmount) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(paymentMode, that.paymentMode) && Objects.equals(recoveryDate, that.recoveryDate) && Objects.equals(recoveryMethod, that.recoveryMethod) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(closureWith, that.closureWith) && Objects.equals(additionalVariables, that.additionalVariables) && Objects.equals(finalStatusSource, that.finalStatusSource) && Objects.equals(finalStatusAuthor, that.finalStatusAuthor) && Objects.equals(finalStatusRole, that.finalStatusRole) && Objects.equals(archive, that.archive) && Objects.equals(createdBy, that.createdBy) && Objects.equals(created, that.created) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(updated, that.updated) && Objects.equals(isLatestAllocationMonth, that.isLatestAllocationMonth) && Objects.equals(amountRecoveredBreakdown, that.amountRecoveredBreakdown) && Objects.equals(utilisation, that.utilisation) && Objects.equals(totalOutstandingAmount, that.totalOutstandingAmount) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(uploadedBy, that.uploadedBy) && Objects.equals(uploadedByRole, that.uploadedByRole) && Objects.equals(updatedByRole, that.updatedByRole) && Objects.equals(lastCallStatus, that.lastCallStatus) && Objects.equals(deleted, that.deleted) && Objects.equals(advancePayment, that.advancePayment) && Objects.equals(clientSource, that.clientSource) && Objects.equals(digitalCommunicationEndDate, that.digitalCommunicationEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, loanId, allocationMonth, finalStatus, dateOfDefault, amountRecovered, totalClaimAmount, lateFee, expectedEmi, otherPenalty, defaultEmiNumber, allocationDpdValue, actualDateOfDefault, allocationDpdBracket, dpd, dpdBracket, clientAmountRecovered, expectedEmiInterestAmount, principalOutstandingAmount, expectedEmiPrincipalAmount, settlementAmount, paymentMethod, paymentMode, recoveryDate, recoveryMethod, referenceNumber, closureWith, additionalVariables, finalStatusSource, finalStatusAuthor, finalStatusRole, archive, createdBy, created, updatedBy, updated, isLatestAllocationMonth, amountRecoveredBreakdown, utilisation, totalOutstandingAmount, isDeleted, uploadedBy, uploadedByRole, updatedByRole, lastCallStatus, deleted, advancePayment, clientSource, digitalCommunicationEndDate);
    }
}
