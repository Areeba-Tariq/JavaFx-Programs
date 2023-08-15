package com.example.colorpicker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Button button;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    void getColorAndFill(MouseEvent event) {
        Color col=colorPicker.getValue();
        button.setTextFill(col);
    }

}
