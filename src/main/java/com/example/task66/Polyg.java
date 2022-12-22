package com.example.task66;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Polyg extends Shape {
    public Polyg(Color color, Double x, Double y, Double w, Double h)
    {
        super(color, x, y, w, h);
    }
    @Override
    double area() {
        return 1/2*h*w;
    }

    @Override
    public String toString() {
        return "Угол";
    }

    @Override
    void draw(GraphicsContext gr, Color col) {
        gr.setStroke(col);
        gr.setLineWidth(10);
        gr.strokePolygon(new double[]{25, 250},
                new double[]{25,25},2
        );
        gr.strokePolygon(new double[]{30, 30},
                new double[]{25,250},2
        );
    }



}