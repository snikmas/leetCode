#include <stdio.h>

// 0 1 0 3 12
// 0 
// temp = 1
// nums[1] () = 0
// 1 0 0 3 12
//  
void moveZeroes(int *nums, int numsSize){
 int nonZero = 0;
 for(int i = 0; i < numsSize; i++){
  if(nums[i] != 0){
    int temp = nums[i]; 
    nums[i] = nums[nonZero];
    nums[nonZero] = temp;
    zonzero++;
  }
 }

}


int main(void){

  int nums[5];
  int numsSize = 5;

  moveZeroes(nums[0], numsSize);



  return 0;
}