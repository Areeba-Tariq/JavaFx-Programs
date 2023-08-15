package com.example.choicebox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> ListOfAnimals;
        //ListOfAnimals list=new ListOfAnimals("Dog","Cat","kangroo")
    @FXML
    private Text Text;

    @FXML
    void DisplayText(MouseEvent event) {
        String animal=ListOfAnimals.getSelectionModel().getSelectedItem();
        Text.setText(animal);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ListOfAnimals.getItems().addAll("DOg","Cat","Mouse");
    }
}
