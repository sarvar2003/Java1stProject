public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("A6", "Audi", 2020, 50000.0, "Black", 10);
        System.out.println(car.toString());

        car.sell(3);
        System.out.println(car.getQuantity());

        car.setColor("White");
        car.setPrice(55000.0);
        System.out.println(car.toString());
    }
}
