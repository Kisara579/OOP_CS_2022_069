package LW_03.Q3;

public class Bicycle {
//    private  String owner;
    private Owner owner;

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Bicycle() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

