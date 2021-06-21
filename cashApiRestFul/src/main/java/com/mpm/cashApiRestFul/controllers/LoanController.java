package com.mpm.cashApiRestFul.controllers;

import java.util.ArrayList;

import com.mpm.cashApiRestFul.models.LoanModel;
import com.mpm.cashApiRestFul.services.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    LoanService loanService;

    @GetMapping()
    public ArrayList<LoanModel> getLoans(){
        return this.loanService.getLoans();
    }
    @PostMapping()
    public LoanModel addLoan(@RequestBody LoanModel loan){
        return this.loanService.addLoan(loan);

    }
    
}
