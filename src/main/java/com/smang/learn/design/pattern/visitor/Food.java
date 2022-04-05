package com.smang.learn.design.pattern.visitor;

public class Food implements Visitable {
    private double price;

    public Food(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
