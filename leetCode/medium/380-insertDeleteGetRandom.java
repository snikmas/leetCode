import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> valToIndex; // maps val -> index;
    private List<Integer> values;
    private Random random;

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
        
    }
    
    public boolean insert(int val) {
        if(valToIndex.containsKey(val)) return false;
        values.add(val);
        valToIndex.put(val, values.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valToIndex.containsKey(val)){
            return false;
        }
        int idx = valToIndex.get(val);
        int lastVal = values.get(values.size() - 1);

        // swap val with the last el
        values.set(idx, lastVal);
        valToIndex.put(lastVal, idx);

        // remove
        values.remove(values.size() - 1);
        valToIndex.remove(val);
        return true;

    }
    
    public int getRandom() {
        int randIndex = random.nextInt(values.size());
        return values.get(randIndex);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */