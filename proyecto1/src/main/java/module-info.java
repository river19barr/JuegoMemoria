module com.mycompany.proyecto1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyecto1 to javafx.fxml;
    exports com.mycompany.proyecto1;
}
