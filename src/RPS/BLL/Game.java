package RPS.BLL;

import RPS.BE.Bot;

import java.util.ArrayList;
import java.util.Random;

public class Game {
ArrayList<Integer> movesMemory;
private int rock = 1;
private int paper = 2;
private int scissors = 3;
private Random random;
private int playerChoice;
private int botChoice;
private int easyDifficulty = 1;
private int normalDifficulty = 2;
private int hardDifficulty = 3;
public Bot bot;
    public Game(){
        movesMemory = new ArrayList<>();
        random = new Random(3);
        bot = new Bot(1);
    }

    public String checkWhoWon(){
        if(playerChoice == rock){
            if(botChoice == rock){
                return youTied();
            }
            if(botChoice == paper){
                return youLost();
            }
            if(botChoice == scissors){
                return youWon();
            }
        }
        if(playerChoice == paper){
            if(botChoice == rock){
                return youWon();
            }
            if(botChoice == paper){
                return youTied();
            }
            if(botChoice == scissors){
                return youLost();
            }
        }
        if(playerChoice == scissors){
            if(botChoice == rock){
                return youLost();
            }
            if(botChoice == paper){
                return youWon();
            }
            if(botChoice == scissors){
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
        playerChoice = rps;
        movesMemory.add(playerChoice);
        System.out.println(movesMemory.toString());

    }

    public void botMove(){
        botChoice = bot.botMove();

    }

    public int getBotChoice() {
        return botChoice;
    }

    public int getPlayerChoice() {
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

    public int getEasyDifficulty() {
        return easyDifficulty;
    }

    public int getNormalDifficulty() {
        return normalDifficulty;
    }

    public int getHardDifficulty() {
        return hardDifficulty;
    }

    public void saveMove(int rps){

        movesMemory.add(rps);
    }

}
