package RPS.GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuStage implements Initializable{




    @FXML
    private Button btnStartGame;
    @FXML
    private Label lblChooseVillain;


    public MenuStage(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lblChooseVillain.setText("CHOOSE A VILLAIN");


    }



    public void startGame(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage currentStage = (Stage) btnStartGame.getScene().getWindow();
        currentStage.close();


        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/RPS/GUI/gameStage.fxml"));
        primaryStage.setTitle("Rock Paper Scissors Menu");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();

    }
}
