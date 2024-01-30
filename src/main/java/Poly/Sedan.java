//The Sedan class has field as length and also does it is own implementation
//of calculateSalePrice(): if length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount
package Poly;

public class Sedan extends Car{
    private double length;
    public Sedan(double carPrice, String color, double length){
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if(length > 20){
            return (getCarPrice() - (getCarPrice() * 5) / 100);
        } else {
            return (getCarPrice() - (getCarPrice() * 10) /100);
        }
    }
}
