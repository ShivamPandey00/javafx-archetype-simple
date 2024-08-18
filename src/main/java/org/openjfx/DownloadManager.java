package org.openjfx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DownloadManager {

    @FXML
    private TextField urlTextfield;

    @FXML
    void downloadButtonClicked(ActionEvent event) {
        String url = urlTextfield.getText().trim();

        System.out.println(url);

    }

}
