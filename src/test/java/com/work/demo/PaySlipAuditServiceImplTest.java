package com.work.demo;

import javax.annotation.Resource;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.work.demo.entity.PaySlipAuditTest;
import com.work.demo.repository.PaySlipAuditRepositoryTest;

public class PaySlipAuditServiceImplTest {
	@Resource
    private PaySlipAuditRepositoryTest paySlipAuditRepository;
     
    @Test
    public void payslipdetails_whenSave_thenGetOk() {
   	PaySlipAuditTest ref = new PaySlipAuditTest(1 , "John", "Smith", "30th July 2013", "Monthly", 9,
		60050.00, 5004.00 , 922.00 , 4082.00, 450.00,
		3632.00);
   	paySlipAuditRepository.save(ref);
         
    	PaySlipAuditTest ref2 = paySlipAuditRepository.findById(1).get();
        assertEquals("John", ref2.getFirstName());
    }
    
}
