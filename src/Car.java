public class Car extends Vehicle{

    protected String carType;

    public Car(String fuel, String color, String brand, int wheels, String carType) {
        super(fuel, color, brand, wheels);
        this.carType = carType;
    }
}
