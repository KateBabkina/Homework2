package ru.dataart.academy.java.figures;

public class Calculator {
    public double calculateSumOfAreas(Figure[] figures) {
        double sumOfAreas = 0;
        for (Figure figure : figures) {
            sumOfAreas += figure.calculateArea();
        }
        return sumOfAreas;
    }
}
