
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//How can you remove all duplicates from ArrayList?
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> originalArr = new ArrayList<>();
        originalArr.add("cake");
        originalArr.add("balloon");
        originalArr.add("ball");
        originalArr.add("laptop");
        originalArr.add("balloon");
        originalArr.add("tree");
        originalArr.add("cake");

        List<String> newList = RemovedDuplicates(originalArr);
        System.out.println("New list without duplicates: " + newList);
    }
    public static List<String> RemovedDuplicates(List<String> list){
        HashSet <String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

}
