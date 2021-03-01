package RPS.GUI;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstStage implements Initializable{
    public Label lbl1;
    public Label lbl2;
        public FirstStage(){

            }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setText("Welcome to our game!");
        lbl2.setText("Press anywhere to open main menu...");
    }


    public void enterGame(MouseEvent mouseEvent) {
    }

}
