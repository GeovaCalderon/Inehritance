public class Truck extends Vehicle{

    protected String semiTrailerSize;

    public Truck(String fuel, String color, String brand, int wheels, String semiTrailerSize) {
        super(fuel, color, brand, wheels);
        this.semiTrailerSize = semiTrailerSize;
    }
}
