package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    public Rectangle(double side0, double side1) {
        variables = new double[2];
        variables[0] = side0;
        variables[1] = side1;
    }

    @Override
    protected double calculateArea() {
        return variables[0] * variables[1];
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * (variables[0] + variables[1]);
    }
}
