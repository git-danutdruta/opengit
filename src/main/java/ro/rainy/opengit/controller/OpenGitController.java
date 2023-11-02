package ro.rainy.opengit.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OpenGitController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}