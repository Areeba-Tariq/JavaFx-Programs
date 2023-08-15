package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    void printHelloworld(MouseEvent event) {
    System.out.println("hello world");
    }

}
