package com.example.task66;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Oval extends Shape {

    public Oval(Color color, Double x, Double y, Double w, Double h)
    {
        super(color, x, y, w, h);
    }


    @Override

    double area () {

        return x*x/h + y*y/w;
    }

    @Override
    public String toString() {
        return "Овал";
    }

    @Override
    void draw(GraphicsContext gr, Color col) {
        gr.setFill(col);
        gr.fillOval(x, y, h, w);

    }

}