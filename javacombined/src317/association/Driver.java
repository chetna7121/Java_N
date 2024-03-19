package javacombined.src317.association;


//Association
public class Driver extends Car {
    String driverName;

    //reuse
    public Driver(String carName, int carId, String driverName) {
        super(carName, carId);
        this.driverName = driverName;
    }
}
