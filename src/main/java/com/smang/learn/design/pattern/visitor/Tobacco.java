package com.smang.learn.design.pattern.visitor;

public class Tobacco implements Visitable {
    private double price;

    public Tobacco(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
