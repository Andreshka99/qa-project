package com.tinkoff.edu.app;

public class LoanRequest {
    /**
     * Class, Type -> objects, instances
     */
    private final LoanType type;
    private final int months;  // stateful + immutable
    private final int amount; // инкапсуляция состояния: геттеры + final = immutable

    public LoanRequest(LoanType type, int months, int amount) {
        this.type = type;
        this.months = months;
        this.amount = amount;
    }

    public int getMonths() {
        return months;
    }

    public LoanType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public String toString () {
        return  "RQ: {" + this.type + ' ' + this.getAmount() + " for " + this.getMonths() + "}";
    } // инкапсуляция поведения
}


