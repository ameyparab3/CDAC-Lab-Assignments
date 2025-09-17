class Vehicle{
    String brand; double speed;
}

class Car extends Vehicle{
    String modelType;
    Car(String brand, double speed, String modelType){
        this.brand=brand;
        this.speed=speed;
        this.modelType=modelType;
    }
}

class Bike extends Vehicle{
    String modelType;
    Bike(String brand, double speed, String modelType){
        this.brand=brand;
        this.speed=speed;
        this.modelType=modelType;
    }
}
class VehicleTypes {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 180, "Civic");
        Bike b1 = new Bike("Yamaha", 120, "R15");
        System.out.println("Car -> "+c1.brand+" "+c1.modelType+", Speed = "+c1.speed);
        System.out.println("Bike -> "+b1.brand+" "+b1.modelType+", Speed = "+b1.speed);
    }
}
