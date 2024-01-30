//The Truck class has a field as weight
//and has its own implementation of calculateSalePrice() method in which
//returned price is calculated as following: if weight>2000 then returned price
//car should include 10% discount, otherwise 20% discount.
package Poly;

public class Truck extends Car{
    private double weight;

    public Truck(double carPrice, String color, double weight){
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if(weight > 2000){
            return (getCarPrice() - (getCarPrice() * 10) / 100);
        } else {
            return (getCarPrice() - (getCarPrice() * 20) / 100);
        }
    }
}
