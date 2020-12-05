public class Vehicle {
    
    protected String fuel;
    protected String color;
    protected String brand;
    protected int wheels;

    public Vehicle(String fuel, String color, String brand, int wheels) {
        this.fuel = fuel;
        this.color = color;
        this.brand = brand;
        this.wheels = wheels;
    }

    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void turnLeft(){

    }

    public void turnRight(){

    }

    public void accelerate(){

    }

    public void breaks(){

    }

}
