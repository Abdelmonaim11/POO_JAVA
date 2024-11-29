module com.enset.tp5_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.enset.tp5_javafx to javafx.fxml;
    exports com.enset.tp5_javafx;
}