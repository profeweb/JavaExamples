package ownersandprops;

public class Prop {

    // Propietats de la classe Prop
    private String propID;
    private String address;
    private String city;
    private float price;

    // Constructor de la classe Prop
    public Prop(String propID, String address, String city) {
        this.propID = propID;
        this.address = address;
        this.city = city;
        this.price = 0.0f;
    }

    // Getters

    public String getPropID() {
        return propID;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public float getPrice() {
        return price;
    }

    // Setters

    public void setPropID(String propID) {
        this.propID = propID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Altres

    public boolean isCheaperThan(Prop other){
        return this.getPrice() < other.getPrice();
    }

    public boolean sameCity(Prop other){
        return this.getCity().equals(other.getCity());
    }
}
