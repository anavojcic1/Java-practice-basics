//Write a program to swap 2 String without a temporary variable?

public class SwapNums {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cde";
        System.out.println("Before swapping, a is "+ a + " b is "+ b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swapping a is "+ a + " and b is "+ b);

    }
}
