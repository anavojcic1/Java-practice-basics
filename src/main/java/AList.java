/*You have a list of strings and you want to keep only those that start with an
“A” and you want to return them in lower case*/

import java.util.ArrayList;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("airplane");
        aList.add("Balloon");
        aList.add("Aviation");
        aList.add("Anna");
        aList.add("anecdote");

        List<String> modifiedList = StartsWithA(aList);
        System.out.println("Original list: " + aList);
        System.out.println("Modified List: " + modifiedList);
    }
    public static List<String> StartsWithA(List<String> strings){
        List<String>  newList = new ArrayList<>();
        for(String s:strings){
            if(s.startsWith("A")){
                newList.add(s.toLowerCase());
            }
        }
        return newList;
    }
}
