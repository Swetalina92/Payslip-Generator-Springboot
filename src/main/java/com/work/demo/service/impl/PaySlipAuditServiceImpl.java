package com.work.demo.service.impl;


import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import org.slf4j.*;

import com.work.demo.entity.PaySlipAudit;
import com.work.demo.exception.CustomExceptions;
import com.work.demo.repository.PaySlipAuditRepository;
import com.work.demo.service.PaySlipAuditService;

@Service
public class PaySlipAuditServiceImpl implements PaySlipAuditService{
	
	@Resource
	private PaySlipAuditRepository paySlipAuditRepository;
	private static final Logger LOG = LoggerFactory.getLogger(PaySlipAuditServiceImpl.class);
	private Boolean isSuccess = false;
	@Override
	public Boolean savePaySlipDetailsForAudit(PaySlipAudit payslipObject) throws CustomExceptions {
		
		try {
			LOG.info("Saving Payslip information for Auduiting purpose.");
			isSuccess = true;
			paySlipAuditRepository.save(payslipObject); 	
			LOG.info("Payslip information saved successfully.");
		}catch(Exception e) {
			LOG.error("An exception has occured :" + e.getLocalizedMessage());
			isSuccess = false;
			throw new CustomExceptions(e.getMessage());
		}			
		return isSuccess;
	}

}
