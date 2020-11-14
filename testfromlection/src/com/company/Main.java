package com.company;

public class Main {

    public static void main(String[] args) {
        Base b = new Base();
        Base d = new Derived();

        ((Derived)d).minus();

    }
}

class Base {
    public void sum() {
        System.out.println("Base sum");
    }
}

class Derived extends Base {
    public void sum() {
        System.out.println("Derived sum");
    }
    public void minus() {
        System.out.println("Derived minus");
    }
}