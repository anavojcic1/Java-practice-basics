//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.
public class isPalindrome {
    public static void main(String[] args) {
    String str = "madam";
        System.out.println(str.equalsIgnoreCase(reverse(str)));
    }

    public static String reverse(String str){
        String newStr = "";
        for(int i = str.length()-1; i >=0; i--){
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
}
