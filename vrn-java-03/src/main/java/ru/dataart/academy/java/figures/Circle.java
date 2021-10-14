package ru.dataart.academy.java.figures;

public class Circle extends Figure {

    public Circle(double radius) {
        variables = new double[1];
        variables[0] = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * variables[0] * variables[0];
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * variables[0];
    }
}
