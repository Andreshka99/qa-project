package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import com.tinkoff.edu.app.LoanType;
import com.tinkoff.edu.app.StaticVariableLoanCalcRepository;

public class LoanCalcTest {
    /**
     * TODO Loan calc tests
     */
    public static void main (String... args) {
        LoanRequest request = new LoanRequest(LoanType.IP, 10, 1_000);
        System.out.println("Порядковый номер константы равен: " + LoanType.IP.ordinal());
        LoanCalcController loanCalcController = new LoanCalcController(new StaticVariableLoanCalcRepository()); // можно теперь прогонять разные тестовые сценарии, включая моки
        int requestId = loanCalcController.createRequest(request); //factual
        System.out.println("Request: " + request);
        System.out.println(requestId + " must be 1");
    }
}
