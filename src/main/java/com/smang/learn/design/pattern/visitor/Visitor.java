package com.smang.learn.design.pattern.visitor;

public interface Visitor {
    public double visit(Alcohol alcohol);
    public double visit(Tobacco tobacco);
    public double visit(Food food);
}
