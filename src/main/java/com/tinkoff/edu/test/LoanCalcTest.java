package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanRequest;

import static com.tinkoff.edu.app.LoanCalcController.createRequest;

public class LoanCalcTest {
    /**
     * TODO Loan calc tests
     */
    public static void main (String... args) {
        LoanRequest loanRequest = new LoanRequest(10, 1000);
        int requestId = createRequest(loanRequest); //factual
        System.out.println(loanRequest.getAmount());
        System.out.println(requestId + " must be 1");
    }
}
