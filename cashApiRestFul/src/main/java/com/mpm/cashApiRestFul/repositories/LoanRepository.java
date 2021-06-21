package com.mpm.cashApiRestFul.repositories;

import com.mpm.cashApiRestFul.models.LoanModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository<LoanModel,Long>{
    
}
