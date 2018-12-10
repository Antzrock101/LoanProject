package com.loanintegrity.academy.datafeed;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class LoanData {

   @Id
   private String loanNumber;
   private String status;
   private String customerName;
   private LocalDate createDate;
   private LocalDate originDate;
   private LocalDate updtDate;
   private String deptName;
   private String deptId;

   public LoanData() {} //No Arg constructor

   public LoanData(String loanNumber, String status, String customerName, LocalDate createDate, LocalDate originDate, LocalDate updtDate, String deptName, String deptId) {
      this.loanNumber = loanNumber;
      this.status = status;
      this.customerName = customerName;
      this.createDate = createDate;
      this.originDate = originDate;
      this.updtDate = updtDate;
      this.deptName = deptName;
      this.deptId = deptId;
   }//constructor



   public String getLoanNumber() {
      return loanNumber;
   }

   public void setLoanNumber(String loanNumber) {
      this.loanNumber = loanNumber;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getCustomerName() {
      return customerName;
   }

   public void setCustomerName(String customerName) {

      this.customerName = customerName;
   }

   public LocalDate getCreateDate() {
      return createDate;
   }

   public void setCreateDate(LocalDate createDate) {

      this.createDate = createDate;
   }

   public LocalDate getOriginDate() {
      return originDate;
   }

   public void setOriginDate(LocalDate originDate) {

      this.originDate = originDate;
   }

   public LocalDate getUpdtDate() {
      return updtDate;
   }

   public void setUpdtDate(LocalDate updtDate) {

      this.updtDate = updtDate;
   }

   public String getDeptName() {
      return deptName;
   }

   public void setDeptName(String deptName) {

      this.deptName = deptName;
   }

   public String getDeptId() {
      return deptId;
   }

   public void setDeptId(String deptId) {

      this.deptId = deptId;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("LoanData{");
      sb.append("loanNumber='").append(loanNumber).append('\'');
      sb.append(", status='").append(status).append('\'');
      sb.append(", customerName='").append(customerName).append('\'');
      sb.append(", createDate=").append(createDate);
      sb.append(", originDate=").append(originDate);
      sb.append(", updtDate=").append(updtDate);
      sb.append(", deptName='").append(deptName).append('\'');
      sb.append(", deptId='").append(deptId).append('\'');
      sb.append('}');
      return sb.toString();
   }//to string



}
