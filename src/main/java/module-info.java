module com.example.lab4test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4test to javafx.fxml;
    exports com.example.lab4test;
}