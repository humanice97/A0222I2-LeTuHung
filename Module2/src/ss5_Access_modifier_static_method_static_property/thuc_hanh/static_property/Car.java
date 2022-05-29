package ss5_Access_modifier_static_method_static_property.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car (String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public static void main(String[] args) {
        Car car = new Car("Mazda2", "Skyactive 3");
        System.out.println(Car.numberOfCar);
        Car car1 = new Car("Mazda6", "Skyactive 6");
        System.out.println(Car.numberOfCar);
    }
}
