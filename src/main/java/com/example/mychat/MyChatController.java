package com.example.mychat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MyChatController {
    @FXML
    TextArea chatArea;
    @FXML
    TextField inputArea;
    public void sendMessage (ActionEvent actionEvent){
        chatArea.appendText(inputArea.getText() + "\n");
        inputArea.clear();

    }

}