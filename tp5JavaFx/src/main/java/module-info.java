module com.enset.tp5javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    opens com.enset.entities to javafx.base;


    exports com.enset.tp5javafx;
    opens com.enset.tp5javafx to javafx.base, javafx.fxml;
    exports com.enset.controller;
    opens com.enset.controller to javafx.base, javafx.fxml;
}