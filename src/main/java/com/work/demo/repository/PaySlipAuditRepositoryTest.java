package com.work.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.work.demo.entity.PaySlipAuditTest;

@Transactional
@Repository
public interface PaySlipAuditRepositoryTest extends CrudRepository<PaySlipAuditTest, Integer> {

}
