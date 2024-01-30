//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class ReversedString {
    public static void main(String[] args) {
        String string = "Hello world";
        String reversedString = "";
//        StringBuilder s1 = new StringBuilder(s);
//        s1.reverse();
//        System.out.println(s1.toString());
//    }
        //using for loop
        for (int i = string.length() -1 ; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}

