package abstraction;

public abstract class Vehicale {
    private String name;
    private int speed;

    public abstract String move();
    
    public abstract String brake();


    public String getName() {
        return name;
    }
    public String setName(String name) {
       return this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int speed) {
       return this.speed = speed;
    }

    // getter & Setter 



    // Constructor of vehical 
}
