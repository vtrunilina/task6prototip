package com.example.task66;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {


    public Rectangle(Color color, Double x, Double y, Double w, Double h )
    {
        super(color, x, y, w, h);
    }

    @Override

    double area () {

        return h * w;
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }

    @Override
    void draw(GraphicsContext gr, Color col) {
        gr.setFill(col);
        gr.fillRect(x, y, h, w);

    }

}
