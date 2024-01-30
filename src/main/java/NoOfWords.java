/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class NoOfWords {
    public static void main(String[] args) {
        String str = "Hello, world";
        int count = CountWords(str);
        System.out.println(count);
    }
    public static int CountWords(String str){
        str =str.trim();

        if(str.isEmpty()){
            return 0;
        }
        // split the string into words using spaces or punctuation as separators
        String[] words = str.split("[\\s\\p{Punct}]+");

        return words.length;
    }
}
