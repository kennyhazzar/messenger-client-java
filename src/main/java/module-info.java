module com.example.messengerclientjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerclientjava to javafx.fxml;
    exports com.example.messengerclientjava;
}