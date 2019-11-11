package com.work.demo.service;

import com.work.demo.entity.PaySlipAudit;
import com.work.demo.exception.CustomExceptions;

public interface PaySlipAuditService {

	public Boolean savePaySlipDetailsForAudit(PaySlipAudit payslipObject) throws CustomExceptions;
}
