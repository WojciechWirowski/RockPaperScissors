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

    public void checkWhoWon(){
        if(playerChoice.getRps() == rock){
            if(botChoice.getRps() == rock){
                youTied();
            }
            if(botChoice.getRps() == paper){
                youLost();
            }
            if(botChoice.getRps() == scissors){
                youWon();
            }
        }
        if(playerChoice.getRps() == paper){
            if(botChoice.getRps() == rock){
                youWon();
            }
            if(botChoice.getRps() == paper){
                youTied();
            }
            if(botChoice.getRps() == scissors){
                youLost();
            }
        }
        if(playerChoice.getRps() == scissors){
            if(botChoice.getRps() == rock){
                youLost();
            }
            if(botChoice.getRps() == paper){
                youWon();
            }
            if(botChoice.getRps() == scissors){
                youTied();
            }
        }


    }

    private void youWon() {
        System.out.println("You won!");
    }

    private void youTied() {
        System.out.println("You tied!");
    }

    private void youLost() {
        System.out.println("You lost!");
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

    public void saveMove(int rps){

        movesMemory.add(new Move(movesMemory.size(), rps));
    }
}
