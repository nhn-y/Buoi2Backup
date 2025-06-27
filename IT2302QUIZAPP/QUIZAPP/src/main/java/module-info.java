module com.nhny.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.nhny.quizapp to javafx.fxml;
    exports com.nhny.quizapp;
}
