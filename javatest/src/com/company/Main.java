package com.company;

public class Main {
<<<<<<< HEAD

    public static void main(String[] args) {
        int s[] = {20, 10};
        String ss[] = {"20", "10"};

        Ar a = new Ar();
        a.printArray(s);
    }
}


class Ar {
    public void printArray( Object x ){
        if( x instanceof int[] ){
            System.out.println("Array of Int");
            int[] n = (int[]) x ;
            for( int i = 0 ; i < n.length ; i++ ) {
                System.out.println("integers = " + n[i]);
            }
        }

        if( x instanceof String[] ){
            System.out.println("Array of Strings");
        }
    }
}
=======
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                .withPrice(100)
                .withTitle("Burger")
                .build();

        System.out.println(burger.getTitle());
    }
}

class Burger {
    private final String title;
    private final String typeOfMeat;
    private final double weight;
    private final double price;

    public Burger(String title, String typeOfMeat, double weight, double price) {
        this.title = title;
        this.typeOfMeat = typeOfMeat;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String title;
        private double weight;
        private String typeOfMeat;
        private double price;

        public void Builder() {

        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder withTypeOfMeat(String typeOfMeat) {
            this.typeOfMeat = typeOfMeat;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Burger build() {
            Burger burger = new Burger(title, typeOfMeat, weight, price);
            return burger;
        }

    }
}

/*
class TexMexCook extends Burger {
    public void rateFlavor(String[] ing) throws SourException {

    }
}

// Exception class
class BadTasteException extends Exception {
    public BadTasteException(String message) {
        super(message);
    }
}

class BitterException extends BadTasteException {
    public BitterException(String message) {
        super(message);
    }
}

class SourException extends BadTasteException {
    public SourException(String message) {
        super(message);
    }
}
*/



>>>>>>> master
