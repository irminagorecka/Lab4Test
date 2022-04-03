package com.example.lab4test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

public Button btnMain;
int clickCounter=0;

    public void onBtnAction(ActionEvent actionEvent){
        System.out.println("Kliknięcie nr" + ++clickCounter);
        if (clickCounter==1)
            btnMain.setText("I jeszcze raz");

    }


    public void ChangeText(ActionEvent actionEvent) {
        int clickCounter1=0;
        System.out.println("Kliknięcie nr" + ++clickCounter1);
    }
}