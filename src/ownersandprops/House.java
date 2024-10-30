package ownersandprops;

public class House extends Prop {

    // Propietats de la classe House
    private int numRooms;
    private boolean swimmingPool;


    // Constructor de la classe House

    public House(String propID, String address, String city, int numRooms) {
        super(propID, address, city);
        this.numRooms = numRooms;
    }

    // Getters

    public int getNumRooms() {
        return numRooms;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }


    // Setters


    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
