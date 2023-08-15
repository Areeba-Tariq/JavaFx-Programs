module com.example.keypressedevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keypressedevent to javafx.fxml;
    exports com.example.keypressedevent;
}