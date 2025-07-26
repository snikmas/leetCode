// 1. train how to implement hash-table
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

#define N 10
// hash ..maping? or hash function

// 1. initialize the table

void init_hash_table(){
  for(int i = 0; i < N; i++){
    hash_table[i] = NULL;
  }
}



int main(void){

  char *arrNames[] = {"Anny", "Peter", "Jake", "Michael", "Steffany", "Clay", "Stella", "Orianna"};

  for(int i = 0; i < sizeof(arrNames) / sizeof(arrNames[0]); i++){
    printf("name[%i] = %s\n", i, arrNames[i]);
  }



  return 0;
}