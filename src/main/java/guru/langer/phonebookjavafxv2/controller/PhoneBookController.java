package guru.langer.phonebookjavafxv2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PhoneBookController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}