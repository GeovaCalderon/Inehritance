public class Motorcycle extends Vehicle{

    protected String bikeType;

    public Motorcycle(String fuel, String color, String brand, int wheels, String bikeType) {
        super(fuel, color, brand, wheels);
        this.bikeType = bikeType;
    }
}
