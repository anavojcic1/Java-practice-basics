package Poly;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(5000, "red", 22);
        System.out.println("New price of the sedan is " + sedan.calculateSalePrice());
        Truck truck = new Truck(39000, "black", 2030);
        System.out.println("New price of the truck is " + truck.calculateSalePrice());
    }
}
