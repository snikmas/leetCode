/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let leftPtr = 0;
    for(let rightPtr = 0; rightPtr < nums.length; rightPtr++){
        if(nums[rightPtr] !== val){
            nums[leftPtr] = nums[rightPtr];
            leftPtr++;
        }
    }
    return leftPtr

};

// in real world, using this way we can clean the array (after this operatoin just use slice(0, leftPtr) and we've done)