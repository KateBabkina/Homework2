package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Calculator calculator = new Calculator();
        System.out.println("The sum for array of figures: " + calculator.calculateSumOfAreas(new Figure[]{
                new Rectangle(2, 1),
                new Circle(10),
                new Rectangle(3.4, 8.51),
                new Circle(2.3)
        }));
    }
}