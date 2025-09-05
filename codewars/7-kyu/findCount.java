public import java.util.HashMap;
public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    // Do your magic :
    // 1. hashmap: if in the map -> value += 1; otherwise add
    int max = 0;
    HashMap<Integer, Integer> result = new HashMap<>(); 
    
    for (int i = 0; i < collection.length; i++) {
            int count = result.getOrDefault(collection[i], 0) + 1;
            result.put(collection[i], count);
            if (count > max) {
                max = count;
            }
        }

        return max;
  } findCount {
  
}
