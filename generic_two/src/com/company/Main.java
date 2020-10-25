package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(10);
        DepositAccount<Integer, String> depositAccount = new DepositAccount<Integer, String>(10, "Fast");

        Account daccount = (Account)depositAccount;
        System.out.println(daccount.getId());
    }
}

class Account<T> {
    private T id;

    Account(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}

class DepositAccount<T, S> extends Account<T> {

    public S name;

    DepositAccount(T id, S name) {
        super(id);
        this.name = name;
    }

    public S getName() {
        return name;
    }
}
