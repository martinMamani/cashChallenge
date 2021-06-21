package com.mpm.cashApiRestFul.services;

import java.util.ArrayList;

import com.mpm.cashApiRestFul.models.LoanModel;
import com.mpm.cashApiRestFul.repositories.LoanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public ArrayList<LoanModel> getLoans(){
      return (ArrayList<LoanModel>) this.loanRepository.findAll();
    }

    public LoanModel addLoan(LoanModel loan){
        return this.loanRepository.save(loan);
    }

    
}
