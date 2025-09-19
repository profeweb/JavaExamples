package ownersandprops;

public class Boat extends Prop {

    // Propietats de la classe Boat
    private float length;
    private boolean navigable;

    // Constructor

    public Boat(String propID, String address, String city, float length) {
        super(propID, address, city);
        this.length = length;
        this.navigable = true;
    }

    // Getters

    public float getLength() {
        return length;
    }

    public boolean isNavigable() {
        return navigable;
    }


    // Setters


    public void setLength(float length) {
        this.length = length;
    }

    public void setNavigable(boolean navigable) {
        this.navigable = navigable;
    }
}
