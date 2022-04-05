package com.smang.learn.design.pattern.visitor;

public class Alcohol implements Visitable {
    private double price;

    public Alcohol(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
