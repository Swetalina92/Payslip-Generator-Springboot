package com.work.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.work.demo.entity.PaySlipAudit;

@Transactional
@Repository
public interface PaySlipAuditRepository extends CrudRepository<PaySlipAudit, Integer> {

}
