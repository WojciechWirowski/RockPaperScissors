package RPS.GUI;

import RPS.BE.Bot;
import RPS.BLL.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GameStage implements Initializable {



    private Bot bot;
    private Game game;
    private MenuStage menu;

    @FXML
    private AnchorPane gamePane;

    @FXML
    private ImageView imaMovePlayer;

    @FXML
    private ImageView imaMoveVillain;

    @FXML
    private ImageView imaPlayer;

    @FXML
    private ImageView imaVillain;

    public static ImageView staticimaVillain;

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnRock;

    @FXML
    private Button btnPaper;

    @FXML
    private Button btnScissors;

    @FXML
    private Label lblVS;

    @FXML
    private Label lblEnemy;

    public static Label staticlblEnemy;

    @FXML
    private Label lblPlayer;

    public static Label staticlblPlayer;

    @FXML
    private Text textResult;

    @FXML
    private Label lblToShow;

    public static Label staticlblToShow;


    public GameStage(){


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        game = new Game();

        staticlblPlayer = lblPlayer;
        staticlblEnemy = lblEnemy;
        staticimaVillain = imaVillain;
        staticlblToShow = lblToShow;



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


    public void villainMovesImages(){

        if(game.getBotChoice() == game.getRock()){
            imaMoveVillain.setImage( new Image("RPS/IMG/Rock.png"));
        }else if(game.getBotChoice() == game.getPaper()){
            imaMoveVillain.setImage( new Image("RPS/IMG/Paper.png"));
        }else {
            imaMoveVillain.setImage( new Image("RPS/IMG/Scissors.png"));
        }
    }

    public void printResult(){

        textResult.setText(game.checkWhoWon());
    }



    public void moveRock(ActionEvent actionEvent) {
        Random random = new Random();
        game.playerMove(1);
        game.botMove(random.nextInt(3)+1);
        imaMovePlayer.setImage(new Image("RPS/IMG/Rock.png"));
        villainMovesImages();
        printResult();
        game.checkWhoWon();
    }

    public void movePaper(ActionEvent actionEvent) {
        Random random = new Random();
        game.playerMove(2);
        game.botMove(random.nextInt(3)+1);
        imaMovePlayer.setImage(new Image("RPS/IMG/Paper.png"));
        villainMovesImages();
        printResult();
        game.checkWhoWon();
    }

    public void moveScissors(ActionEvent actionEvent) {
        Random random = new Random();
        game.playerMove(3);
        game.botMove(random.nextInt(3)+1);
        imaMovePlayer.setImage(new Image("RPS/IMG/Scissors.png"));
        villainMovesImages();
        printResult();
        game.checkWhoWon();
    }
}
