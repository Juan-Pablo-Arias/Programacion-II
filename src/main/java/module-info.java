module com.arias.programacionii_proyecto1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens com.arias.programacionii_proyecto1 to javafx.fxml;
    exports com.arias.programacionii_proyecto1;
}