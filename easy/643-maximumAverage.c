
double findMaxAverage(int* nums, int numsSize, int k) {

  double sum = 0, max_sum = 0;
  int i = 0;
  for(; i < k; i++){
      sum += nums[i]; // calculating the sum for first k values (initial window)
  }
  max_sum = sum;

  // slide the window
  int j = 0;
  while(i < numsSize){
      sum -= nums[j++];
      sum += nums[i++];
      max_sum = max_sum > sum ? max_sum : sum;
  }
  return max_sum / k;
}