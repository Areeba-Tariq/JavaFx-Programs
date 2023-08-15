package com.example.keypressedevent;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text Text;

    @FXML
    void showText(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER)
            Text.setText("Enter");
        if(event.getCode()== KeyCode.SPACE)
            Text.setText("Space");
    }

}
