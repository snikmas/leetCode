function maxArea(heights) {
    let max = 0;
    let leftPointer = 0;
    let rightPointer = heights.length - 1;

    while (leftPointer < rightPointer) {
        const leftHeight = heights[leftPointer];
        const rightHeight = heights[rightPointer]
        if (leftHeight <= rightHeight) {
            max = Math.max(leftHeight * (rightPointer - leftPointer), max);
            leftPointer++;
        } else {
            max = Math.max(rightHeight * (rightPointer - leftPointer), max);
            rightPointer--;
        }
    }
    return max;
}