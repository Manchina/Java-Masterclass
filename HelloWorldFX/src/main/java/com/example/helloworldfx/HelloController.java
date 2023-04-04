package com.example.helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Nokkamanaganey nokki dhengav. Entha pedha yerri pukuvo nuvvu. Velli cheppinodi modda nokku ipudu.");
    }
}