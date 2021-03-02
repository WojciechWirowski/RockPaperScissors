package RPS.BLL;

import RPS.BE.Move;

import java.util.ArrayList;

public class Game {
ArrayList<Move> movesMemory;
    public Game(){

    }

    public void startGame(){
        //game starts
    }

    public void endGame(){
        //game stops
    }

    public void saveMove(String rps){
        movesMemory = new ArrayList<>();
        movesMemory.add(new Move(movesMemory.size(), rps));
    }
}
