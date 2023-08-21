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

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }
        char maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Character, Integer> chMap : charMap.entrySet()) {
            if (maxValue < chMap.getValue()) {
                maxValue = chMap.getValue();
                maxKey = chMap.getKey();
            }
        }
        return maxKey;
    }
}
