package com.loanintegrity.academy.datafeed;

import org.springframework.beans.factory.annotation.Autowired;

public class TempPrint {

    @Autowired
    private LoanData loanData;



    public String print () {

        return  loanData.getCustomerName();

    }




}
