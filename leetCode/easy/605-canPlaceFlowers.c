bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    
  int space = 0;
  

  for(int i = 0; i < flowerbedSize; i++){
      if(flowerbed[i] == 0){
          int emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
          int emptyRight = (i == flowerbedSize - 1) || (flowerbed[i + 1] == 0);

      if(emptyLeft && emptyRight){
          flowerbed[i] = 1;
          space++;
      }
      }
  }

  return space >= n;
}