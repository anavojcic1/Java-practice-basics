package Abstraction;

public class MarksTester {
    public static void main(String[] args) {
    Marks [] a = {new StudentA(6.6, 7, 8),
            new StudentB(7.4, 7.1, 8.6, 9.0)
    };
        for (Marks el : a) {
            if (el instanceof StudentA) {
                System.out.println("The average of marks of Student A is " + el.getPercentage());
            } else if (el instanceof StudentB) {
                System.out.println("The average of marks of Student B is " + el.getPercentage());
            }
        }
    }
}
