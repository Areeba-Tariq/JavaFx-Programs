module com.example.mouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mouseevent to javafx.fxml;
    exports com.example.mouseevent;
}