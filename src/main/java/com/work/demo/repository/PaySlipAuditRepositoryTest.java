package com.work.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.work.demo.entity.PaySlipAuditTest;

@Transactional
@Repository
public interface PaySlipAuditRepositoryTest extends CrudRepository<PaySlipAuditTest, Integer> {

}
