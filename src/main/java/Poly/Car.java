/*
Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */
package Poly;

public abstract class Car {
    private double carPrice;
    private String color;

    public double getCarPrice() {
        return carPrice;
    }

    public double calculateSalePrice(){
        return carPrice;
    }

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

}
