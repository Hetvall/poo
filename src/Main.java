public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "TXL", 2025 );
        Car mySecondCar = new Car("BMW", "Q3", 2025 );

        mySecondCar.accelerate();
        myCar.accelerate();
        myCar.brake();
    }
}