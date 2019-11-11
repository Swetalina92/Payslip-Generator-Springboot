DROP TABLE IF EXISTS payslip_audit;
 
CREATE TABLE payslip_audit (
  payslip_audit_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(30) DEFAULT NULL,
  pay_date VARCHAR(250) NOT NULL,
  pay_frequency VARCHAR(12) NOT NULL,
  super_rate INT NOT NULL,
  annual_income DECIMAL(15,2) NOT NULL,
  gross_income DECIMAL(15,2) NOT NULL,
  income_tax DECIMAL(15,2) NOT NULL,
  net_income DECIMAL(15,2) NOT NULL,
  super_value DECIMAL(15,2) NOT NULL,
  pay_value DECIMAL(15,2) NOT NULL,
  UNIQUE KEY `UC_Payslip_Audit` (first_name, last_name, annual_income, super_rate )
);
 			
 DROP TABLE IF EXISTS payslip_audit_test;
 
 
CREATE TABLE payslip_audit_test (
  payslip_audit_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(30) DEFAULT NULL,
  pay_date VARCHAR(250) NOT NULL,
  pay_frequency VARCHAR(12) NOT NULL,
  super_rate INT NOT NULL,
  annual_income DECIMAL(15,2) NOT NULL,
  gross_income DECIMAL(15,2) NOT NULL,
  income_tax DECIMAL(15,2) NOT NULL,
  net_income DECIMAL(15,2) NOT NULL,
  super_value DECIMAL(15,2) NOT NULL,
  pay_value DECIMAL(15,2) NOT NULL,
  UNIQUE KEY `UC_Payslip_Audit_Test` (first_name, last_name, annual_income, super_rate )
);

