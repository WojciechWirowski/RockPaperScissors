package RPS.GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class GameStage implements Initializable {

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
    private ImageView imgEnemy;

    @FXML
    private Label lblPlayerName;

    @FXML
    private Label lblVS;

    @FXML
    private Label lblEnemy;

    @FXML
    private Button btnSetName;

    @FXML
    void changeName(ActionEvent event) {


    }

    public GameStage(){


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }



}
