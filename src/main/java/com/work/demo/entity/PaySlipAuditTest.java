package com.work.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "payslip_audit_test")
public class PaySlipAuditTest {

	@Id
	@GeneratedValue	
	@Column(name = "payslip_audit_id", nullable = false)
	private Integer payslipAuditId;

	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 30, nullable = false)
	private String lastName;

	@Column(name = "pay_date", length = 40, nullable = false)
	private String payDate;

	@Column(name = "pay_frequency", length = 12, nullable = false)
	private String payFrequency;
	
	@Column(name = "super_rate", length = 12, nullable = false)
	private Integer superRate;

	@Column(name = "annual_income", length = 40, nullable = false)
	private Double annualSalary;

	@Column(name = "gross_income", length = 40, nullable = false)
	private Double grossIncome;

	@Column(name = "income_tax", length = 40, nullable = false)
	private Double incomeTax;

	@Column(name = "net_income", length = 40, nullable = false)
	private Double netIncome;

	@Column(name = "super_value", length = 40, nullable = false)
	private Double superValue;

	@Column(name = "pay_value", length = 40, nullable = false)
	private Double payValue;

	public PaySlipAuditTest(Integer payslipAuditId, String firstName, String lastName, String payDate,
			String payFrequency, Integer superRate, Double annualSalary, Double grossIncome, Double incomeTax,
			Double netIncome, Double superValue, Double payValue) {
		super();
		this.payslipAuditId = payslipAuditId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.payDate = payDate;
		this.payFrequency = payFrequency;
		this.superRate = superRate;
		this.annualSalary = annualSalary;
		this.grossIncome = grossIncome;
		this.incomeTax = incomeTax;
		this.netIncome = netIncome;
		this.superValue = superValue;
		this.payValue = payValue;
	}

	public Integer getPayslipAuditId() {
		return payslipAuditId;
	}

	public void setPayslipAuditId(Integer payslipAuditId) {
		this.payslipAuditId = payslipAuditId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
	}

	public Integer getSuperRate() {
		return superRate;
	}

	public void setSuperRate(Integer superRate) {
		this.superRate = superRate;
	}

	public Double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(Double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public Double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public Double getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(Double incomeTax) {
		this.incomeTax = incomeTax;
	}

	public Double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(Double netIncome) {
		this.netIncome = netIncome;
	}

	public Double getSuperValue() {
		return superValue;
	}

	public void setSuperValue(Double superValue) {
		this.superValue = superValue;
	}

	public Double getPayValue() {
		return payValue;
	}

	public void setPayValue(Double payValue) {
		this.payValue = payValue;
	}

}
