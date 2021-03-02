package RPS.BE;

public class Move {

    private int id;
    private String rps;

    public Move(int id, String rps){

        this.id = id;
        this.rps = rps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRps() {
        return rps;
    }

    public void setRps(String rps) {
        this.rps = rps;
    }
}
