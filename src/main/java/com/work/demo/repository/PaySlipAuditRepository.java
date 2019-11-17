package com.work.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.work.demo.entity.PaySlipAudit;

@Transactional
@Repository
public interface PaySlipAuditRepository extends CrudRepository<PaySlipAudit, Integer> {

}
