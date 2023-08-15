module com.example.firstjavafxprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstjavafxprogram to javafx.fxml;
    exports com.example.firstjavafxprogram;
}