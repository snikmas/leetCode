#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// do realloc the first array
// soncat?

void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
  int k;

  if(n == 0) return;

  for(int i = 0; i < nums1Size; i++){
    for(int j = 0; j < nums2Size){
      if(nums1[i] > nums2[j]){
        int temp = nums1[i];
        nums1[i] = nums[j];
        for(int k = i + 1; k < nums1Size - k || k != 0;){
          nums1[k] = temp;
          temp = nums1[k++];
        }
      }
    }
  }




  // if(n == 0)return;
  // int len1 = nums1Size;
  // int end_idx = len1-1;
  // while(n > 0 && m > 0){
  //     if(nums2[n-1] >= nums1[m-1]){
  //     nums1[end_idx] = nums2[n-1];
  //     n--;
  //     }else{
  //         nums1[end_idx] = nums1[m-1];
  //         m--;
  //     }
  //     end_idx--;
  // }
  // while (n > 0) {
  //     nums1[end_idx] = nums2[n-1];
  //     n--;
  //     end_idx--;
  // }
}


int main(void){

  int nums1[] = {1, 2, 3, 0, 0, 0};
  int nums2[] = {2, 5, 6};
  int m = 3, n = 3;
  printf("%s", merge(&nums1[0], 6, m, &nums2[0], 3, n));




  return 0;
}

