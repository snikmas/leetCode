class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      
      Arrays.sort(arr);
      int[] v = new int[arr.length];
      int idx = 0;

      for(int i = 0; i < arr.length; i++){
        int cnt = 1;

        while(i + 1 < arr.length && arr[i] == arr[i + 1]){
            cnt++; i++;
        }
        v[idx++] = cnt;
      }

      Arrays.sort(v, 0, idx);
      for(int i = 1; i < idx; i++){
        if(v[i] == v[i - 1]) return false;
      }
      return true;
  
    }
}
