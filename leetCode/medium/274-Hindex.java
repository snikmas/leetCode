class Solution {
    public int hIndex(int[] citations) {
        // 1. sort
        // 2. compare is curr numb >= candidates on the front; cuz candidates will be less and less - > the number will increase
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        for(int i = 0; i < n; i++){
            int candidate = n - i;
            if(citations[i] >= candidate){
                h = candidate;  
                break;
            }
        }
        
        return h;
    }
}