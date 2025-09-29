function merge(nums1, m, nums2, n){
  for(let i = m, j = 0; i < m + n; i++, j++){
    nums1[i] = nums2[j];
  }

  nums1.sort((a, b) => a - b)
  // if  < 0 -> a comes before b
  // > 0 -> a after b -> so  1 2 3 -> 1 - 2 < 0 -> 1 and 2
  // < 0 ? b after a -> 4 3 6 -> 4 - 3 > 0 -> 3 4 6
  // 0 -> equal 
  
}