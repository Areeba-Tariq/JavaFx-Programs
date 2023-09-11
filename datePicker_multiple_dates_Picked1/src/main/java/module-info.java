module com.example.datepicker_multiple_dates_picked1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datepicker_multiple_dates_picked1 to javafx.fxml;
    exports com.example.datepicker_multiple_dates_picked1;
}