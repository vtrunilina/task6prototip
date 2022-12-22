package com.example.task66;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public ColorPicker colorPicer;
    public ListView listview;
    public TextField nameShape;
    Color colorchang =Color.BROWN;
    double []X = {100, 80, 90,30, 65};
    double []Y = {250, 120, 123, 125, 135};

    @FXML
    private Canvas canvas;
    private ObservableList<Shape> itemsList;


    public void changeColor()
    {
        colorchang = colorPicer.getValue();
    };

    public void buttonClear(ActionEvent actionEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, 320,240);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        Rectangle rect = new Rectangle(colorchang, 1.0, 1.0, 60.0, 60.0);
        Oval oval = new Oval(colorchang, 1.0, 1.0, 60.0, 60.0);
        Polyg poly = new Polyg( colorchang, 1.0, 60.0, 60.0, 60.0);
        itemsList = FXCollections.observableArrayList(rect, oval, poly);
        listview.setItems(itemsList);

    }

    public void onMouseClicked(MouseEvent mouseEvent){
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        listview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int index = listview.getSelectionModel().getSelectedIndex();
        Shape shape = (Shape) itemsList.get(index);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        shape.setX(x);
        shape.setY(y);
        shape.draw(gc, colorchang);

        // GraphicsContext gr = canvas.getGraphicsContext2D(); //получить контекст(холст) для рисования

        //  shape.draw(gr); //вызов метода рисования по холсту

    }
}