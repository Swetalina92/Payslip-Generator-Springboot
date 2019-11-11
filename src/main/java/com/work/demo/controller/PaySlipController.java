package com.work.demo.controller;

import javax.validation.Valid;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.demo.entity.PaySlipAudit;
import com.work.demo.exception.CustomExceptions;
import com.work.demo.service.impl.PaySlipAuditServiceImpl;

@RestController
public class PaySlipController {
	
	@Autowired
	PaySlipAuditServiceImpl paySlipAuditServiceRef;
	private static final Logger LOG = LoggerFactory.getLogger(PaySlipController.class);

	@RequestMapping("/savepayslipforaudit")
	public void savePaySlipDetailsForAudit(@Valid @RequestBody PaySlipAudit payslipDetails) throws CustomExceptions {
		try {
			LOG.info("Sending the Payslip details of the employee to be saved.");
			paySlipAuditServiceRef.savePaySlipDetailsForAudit(payslipDetails);
			LOG.info("The Payslip details of the employee to be saved has been sent successfully.");
		} catch (Exception e) {
			LOG.error(e.getMessage());
			throw new CustomExceptions(e.getMessage());
		}
	}
}
