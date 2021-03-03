package RPS.GUI;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;
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


    public void enterGame(MouseEvent mouseEvent) throws IOException {

        Stage currentStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        currentStage.close();


        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/RPS/GUI/menuStage.fxml"));
        primaryStage.setTitle("Rock Paper Scissors Menu");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }

}
