package com.nhny.quizapp;

import com.nhny.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement (ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("QUIZ APP");
        stage.show();
    }
    
    public void handlePractice (ActionEvent event) {
        MyAlert.getInstance().showMsg ("Comming soon...");
    }
    
    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg ("Comming soon...");
    }
    
    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg ("Comming soon...");
    }
    
    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg ("Comming soon...");
    }
   
}
