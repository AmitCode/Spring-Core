package com.springDemo;

public class LoanInfoClass {
    private String loanId;

    public LoanInfoClass() {
    }

    public LoanInfoClass(String loanId, String loanAmount, String applicantName, String applicantAge) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
    }

    private String loanAmount;
    private String applicantName;
    private String applicantAge;
//    public LoanInfoClass(){
//
//    }
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setApplicantAge(String applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getLoanId() {
        return loanId;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getApplicantAge() {
        return applicantAge;
    }
}
