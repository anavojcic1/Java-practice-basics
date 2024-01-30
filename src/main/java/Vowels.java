//Create a method to count how many vowels is present in a string documentation
public class Vowels {
    public static void main(String[] args) {
        String str = "documentation";
        System.out.println(str.replaceAll("[^aeiouAEIOU]","").length());
    }
}
