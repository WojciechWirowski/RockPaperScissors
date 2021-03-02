package RPS.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameStage implements Initializable {

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnDifficulty;

    @FXML
    private TextField tfPlayerName;

    @FXML
    private Button btnRock;

    @FXML
    private Button btnPaper;

    @FXML
    private Button btnScissors;

    @FXML
    private ImageView imageView;

    @FXML
    private Label lblPlayerName;

    @FXML
    private Label lblVS;

    @FXML
    private Label lblEnemy;

    @FXML
    private Button btnSetName;

    public GameStage(){


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


    public void backToMenu(ActionEvent actionEvent) throws IOException {
        Stage currentStage = (Stage) btnMenu.getScene().getWindow();
        currentStage.close();


        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/RPS/GUI/menuStage.fxml"));
        primaryStage.setTitle("Rock Paper Scissors Menu");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }


}
