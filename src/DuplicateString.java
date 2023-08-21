import java.util.*;

public class DuplicateString {
    public static void main(String[] args) {
        String[] names = {"mama", "papa", "mama", "aba"};
       // System.out.println("The duplicate string is: " + duplicateString(names));
        System.out.println("The array without duplicates: " + noDuplicateString(names));
    }

    private static LinkedHashSet<String> noDuplicateString(String[] names) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        for(String str : names){
            Collections.addAll(linkedSet, names);
        }
        return linkedSet;
    }

    private static String duplicateString(String[] names){
        HashMap<String,Integer> strMap = new HashMap<>();
        for(String str : names){
            strMap.put(str, strMap.getOrDefault(str, 0) + 1);
        }
        String maxKey = null;
        int maxValue = 0;
        for(Map.Entry<String,Integer> entry : strMap.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
