module com.example.loadingfiles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loadingfiles to javafx.fxml;
    exports com.example.loadingfiles;
}