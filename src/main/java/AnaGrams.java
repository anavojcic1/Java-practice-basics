/* Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
"listen" and "silent"*/

import java.util.Arrays;

public class AnaGrams{
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        System.out.println(Arrays.toString(s1Arr));
        System.out.println(Arrays.toString(s2Arr));

        if(Arrays.equals(s1Arr, s2Arr)){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}
