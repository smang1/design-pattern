package com.smang.learn.design.pattern.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public double visit(Alcohol alcohol) {
        System.out.println("Calculating Alcohol tax");
        return alcohol.getPrice() * 0.25;

    }

    public double visit(Tobacco tobacco) {
        System.out.println("Calculating Tobacco tax");
        return tobacco.getPrice() * 0.30;
    }

    public double visit(Food food) {
        System.out.println("Calculating food tax");
        return food.getPrice() * 0.01;
    }
}
