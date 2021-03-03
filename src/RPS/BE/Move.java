package RPS.BE;

public class Move {

    private int id;
    private int rps;

    public Move(int id, int rps){

        this.id = id;
        this.rps = rps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRps() {
        return rps;
    }

    public void setRps(int rps) {
        this.rps = rps;
    }
}
