package com.tinkoff.edu.app;

public class IPNotFriendlyService extends LoanCalcService {
    public IPNotFriendlyService(LoanCalcRepository repo) {
        super(repo); // вызов конструктора класса родителя
    }

    @Override
    public int createRequest(LoanRequest request) {
       if (request.getType().equals(LoanType.IP)) return  -1; // работает как if
       return super.createRequest(request); // работает как else
    }
}
