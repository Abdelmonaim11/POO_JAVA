module com.enset.tp5javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.enset.tp5javafx to javafx.fxml;
    exports com.enset.tp5javafx;
}