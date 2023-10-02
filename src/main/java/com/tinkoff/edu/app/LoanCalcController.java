package com.tinkoff.edu.app;

public class LoanCalcController {
    private LoanCalcRepository repo;
    private LoanCalcService loanCalcService; //Creator

    public LoanCalcController(LoanCalcRepository repo) {
        loanCalcService = new LoanCalcService(repo);
    }

    /**
     * TODO Validates and logs request
     */
    public  int createRequest(LoanRequest request) { //formal
        int localVar;
        // param validation
        // log request
        return loanCalcService.createRequest(request);
    }
}
