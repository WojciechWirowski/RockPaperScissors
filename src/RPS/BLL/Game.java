package RPS.BLL;

import RPS.BE.Move;

import java.util.ArrayList;
import java.util.Random;

public class Game {
ArrayList<Move> movesMemory;
private int rock = 1;
private int paper = 2;
private int scissors = 3;
private Random random;
private Move playerChoice;
private Move botChoice;
    public Game(){
        movesMemory = new ArrayList<>();
        random = new Random(3);
    }

    public String checkWhoWon(){
        if(playerChoice.getRps() == rock){
            if(botChoice.getRps() == rock){
                return youTied();
            }
            if(botChoice.getRps() == paper){
                return youLost();
            }
            if(botChoice.getRps() == scissors){
                return youWon();
            }
        }
        if(playerChoice.getRps() == paper){
            if(botChoice.getRps() == rock){
                return youWon();
            }
            if(botChoice.getRps() == paper){
                return youTied();
            }
            if(botChoice.getRps() == scissors){
                return youLost();
            }
        }
        if(playerChoice.getRps() == scissors){
            if(botChoice.getRps() == rock){
                return youLost();
            }
            if(botChoice.getRps() == paper){
                return youWon();
            }
            if(botChoice.getRps() == scissors){
                return youTied();
            }
        }
        return null;
    }

    private String youWon() {
        return "YOU WON!";
    }

    private String youTied() {
        return "YOU TIED!";
    }

    private String youLost() {
        return "YOU LOST!";
    }


    public void startGame(){
        //game starts
    }

    public void endGame(){
        //game stops
    }

    public void playerMove(int rps){
        playerChoice = new Move(movesMemory.size(), rps);
        movesMemory.add(playerChoice);

    }

    public void botMove(int rps){
        botChoice = new Move(1, rps);

    }

    public Move getBotChoice() {
        return botChoice;
    }

    public Move getPlayerChoice() {
        return playerChoice;
    }

    public int getRock() {
        return rock;
    }

    public int getPaper() {
        return paper;
    }

    public int getScissors() {
        return scissors;
    }

    public void saveMove(int rps){

        movesMemory.add(new Move(movesMemory.size(), rps));
    }
}
