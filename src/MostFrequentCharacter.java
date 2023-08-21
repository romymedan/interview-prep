import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "wwww11111122222rrrrrrrrrr";
        System.out.println("The most frequent character is: " + mostFrequentCharacter(str));
    }

    private static Character mostFrequentCharacter(String str) {
        if(str.isEmpty()){
            return null;
        }

        var charMap = new HashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }
        char maxKey = 0;
        int maxValue = 0;
        for (var chMap : charMap.entrySet()) {
            if (chMap.getValue() > maxValue) {
                maxValue = chMap.getValue();
                maxKey = chMap.getKey();
            }
        }
        return maxKey;
    }
}
