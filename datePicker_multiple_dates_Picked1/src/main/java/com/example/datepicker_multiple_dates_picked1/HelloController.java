package com.example.datepicker_multiple_dates_picked1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    ObservableList<LocalDate> selectedDates= FXCollections.observableArrayList();
    @FXML
    private TextArea TextArea;

    @FXML
    private Button button;

    @FXML
    private DatePicker datePicker;

    @FXML
    void getDate(MouseEvent event) {

    }

    @FXML
    void showDate(MouseEvent event) {
        for(LocalDate date:selectedDates)
        {
            System.out.println(date);
        }
        //TextArea.setText(String.valueOf(datePicker.getValue()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        datePicker.setOnAction(event->{
            if(selectedDates.size()>1)
            {
                selectedDates.clear();
            }
            selectedDates.add(datePicker.getValue());
        });
        datePicker.setDayCellFactory(new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(DatePicker param) {
                return new DateCell(){
                    public void updateItem(LocalDate item,boolean empty){
                        super.updateItem(item,empty);
                        boolean alreadySelected=selectedDates.contains(item);
                        setDisable(alreadySelected);
                        setStyle(alreadySelected?"-fx-background-color: #C06C84;" : "");
                    }
                };
            }
        });
    }
}
