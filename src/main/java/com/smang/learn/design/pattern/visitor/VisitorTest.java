package com.smang.learn.design.pattern.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Food food = new Food(10);
        Tobacco tobacco = new Tobacco(100);
        //taxVisitor.visit(food);
        double foodTax = food.accept(taxVisitor);
        System.out.println("foodTax: " + foodTax );
        double tobaccoTax = tobacco.accept(taxVisitor);
        System.out.println("tobaccoTax:" + tobaccoTax);
    }
}
