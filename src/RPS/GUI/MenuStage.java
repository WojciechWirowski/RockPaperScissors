package RPS.GUI;

import RPS.BE.Bot;
import RPS.BE.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuStage extends GameStage implements Initializable{

    private Bot bot;
    private Player player;

    @FXML
    private AnchorPane menuPane;

    @FXML
    private CheckBox easyMode;

    @FXML
    private CheckBox normalMode;

    @FXML
    private CheckBox hardMode;

    @FXML
    private Button btnStartGame;

    @FXML
    private TextField tfPlayerName;


    public MenuStage(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void startGame(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage currentStage = (Stage) btnStartGame.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/RPS/GUI/gameStage.fxml"));
        primaryStage.setTitle("Rock Paper Scissors Menu");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();




        setDifficulty();
        staticlblPlayer.setText(tfPlayerName.getText());
        staticlblToShow.setText(staticlblPlayer.getText() + "   VS   " + staticlblEnemy.getText());

        currentStage.close();
    }

    public void handleEasyMode(){
        if(easyMode.isSelected()){
            normalMode.setSelected(false);
            hardMode.setSelected(false);
        }
    }

    public void handleNormalMode(){
        if(normalMode.isSelected()){
            easyMode.setSelected(false);
            hardMode.setSelected(false);
        }
    }


    public void handleHardMode(){
        if(hardMode.isSelected()){
            easyMode.setSelected(false);
            normalMode.setSelected(false);
        }
    }


    public void setDifficulty(){
        bot = new Bot(1);
        if(easyMode.isSelected()){
            bot.setDifficulty(1);
            staticlblEnemy.setText("Scarlet");
            staticimaVillain.setImage(new Image("RPS/IMG/Scarlet.png"));

        }else if(normalMode.isSelected()){
            bot.setDifficulty(2);
            staticlblEnemy.setText("Vector");
            staticimaVillain.setImage(new Image("RPS/IMG/Vector.png"));

        }else{
            bot.setDifficulty(3);
            staticlblEnemy.setText("Gru");
            staticimaVillain.setImage(new Image("RPS/IMG/Gru.png"));
        }

    }

}
