package RPS.BE;

import java.util.ArrayList;
import java.util.Random;

public class Bot {

    private int difficulty;
    ArrayList<Integer> movesList;
    Random random;

    public Bot(int difficulty){
        this.difficulty = difficulty;
        random = new Random();
    }
        
    
    public int botMove(){
        if(difficulty==1){
            easyMove(movesList);
            return easyMove(movesList);
        }
        if(difficulty==2){
            mediumMove(movesList);
            return mediumMove(movesList);
        }
        else{
            hardMove(movesList);
            return hardMove(movesList);
        }
    }



    private int easyMove(ArrayList<Integer> movesList) {
        return random.nextInt(3);//here You need to put algorithm
    }

    private int mediumMove(ArrayList<Integer> movesList) {
        return random.nextInt(3);//here You need to put algorithm
    }

    private int hardMove(ArrayList<Integer> movesList){
        return random.nextInt(3);//here You need to put algorithm
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
