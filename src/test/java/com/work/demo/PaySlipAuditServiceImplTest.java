package com.work.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.work.demo.entity.PaySlipAuditTest;
import com.work.demo.repository.PaySlipAuditRepositoryTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaySlipAuditServiceImplTest{
	@Autowired
    private PaySlipAuditRepositoryTest paySlipAuditRepositoryTest;
	
	
    @Test
    public void payslipdetails_whenSave_thenGetOk() {
    	PaySlipAuditTest ref = new PaySlipAuditTest(1 , "John", "Smith", "30th July 2013", "Monthly", 9,
		60050.00, 5004.00 , 922.00 , 4082.00, 450.00,
		3632.00);
    	
    	paySlipAuditRepositoryTest.save(ref);   	 
    	PaySlipAuditTest ref2 = paySlipAuditRepositoryTest.findById(1).get();
        assertEquals("John", ref2.getFirstName());
    }
    
}
