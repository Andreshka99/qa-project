package com.tinkoff.edu.app;


public class LoanCalcService {
    /**
     * A a = new B();
     * a.m();
     */
//    private LoanCalcRepository repo = new StaticVariableLoanCalcRepository(); // Паттерн Creator
//    private LoanCalcRepository repo = RepositoryFactory.create(); // [GoF]- книга "Gang of Four", в которой описывается паттерн Factory Method

    private LoanCalcRepository repo; // Field DI; пример делегирования, без наследования используем нужный код

    /**
     * Constructor DI (dependency injection)
     * @param repo
     */
    public LoanCalcService(LoanCalcRepository repo) {
        this.repo = repo;
    }

    /**
     * TODO Loan calculation
     */
    public int createRequest(LoanRequest request) {
        return repo.save(request);
    }
}
