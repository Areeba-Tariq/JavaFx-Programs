package com.example.mouseevent;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text Text;

    @FXML
    void Visibility(MouseEvent event) {
        Text.setVisible(false);
    }

}
