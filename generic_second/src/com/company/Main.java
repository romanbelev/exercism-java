package com.company;

public class Main {

    public static void main(String[] args) {
	    Account accountOne = new Account ("John Mori", 80123132, 600);
	    Account accountTwo = new Account ("Eddy, Wolf", 80123123, 3000);

	    Transaction<Account> transaction = new Transaction<Account>(accountOne, accountTwo, 500);
	    transaction.execute();
    }
}

interface Accountable {
    int getId();
    int getSum();
    void print();
    void setSum(int sum);
    String getName();
}
class Account implements Accountable {
    private int id;
    private int sum;
    private String name;

    Account(String name, int id, int sum) {
        this.id = id;
        this.sum = sum;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void print() {
        System.out.println("This is class account");
    }
}

class Transaction<T extends Account> {
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.println("Transaction success");
            System.out.printf("Account %s: %d \nAccount %s: %d", from.getName(), from.getSum(), to.getName(), to.getSum());
        } else {
            System.out.println("Error not enough balance");
        }
    }

}
