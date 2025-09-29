/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    int max = candies[0];

    *returnSize = candiesSize;
    for(int i = 1; i < candiesSize; i++){
        max = candies[i] > max ? candies[i] : max; 
    }

    bool *result = malloc(sizeof(bool) * candiesSize);

    for(int i = 0; i < candiesSize; i++){
        result[i] = candies[i] + extraCandies >= max ? true : false;
    }

    return result;
}