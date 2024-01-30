//find out how many alpha characters are present in the string

public class AlphaChars {
    public static void main(String[] args) {
        String str = "Java is so%&* much fun789";
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());
    }
}
