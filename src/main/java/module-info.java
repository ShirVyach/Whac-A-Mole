module com.example.whacamole {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.whacamole to javafx.fxml;
    exports com.example.whacamole;
}