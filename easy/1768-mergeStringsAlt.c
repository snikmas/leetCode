#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, /starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.

//3 ms
char * mergeAlternately(char * word1, char * word2){

  int len = (strlen(word1) + strlen(word2));
  char *newWord = malloc(sizeof(char) * len + 1);
  int w1 = 0, w2 = 0, n = 0;
  for (int i = 0; i < len; i++){
    if (word1[w1]) newWord[n++] = word1[w1++];
    if (word2[w2]) newWord[n++] = word2[w2++];
  }

  newWord[n++] = '\0';

  return newWord;

}

// 1ms
char * mergeAlternately(char * word1, char * word2){

  int len = (strlen(word1) + strlen(word2));
  char *newWord = malloc(sizeof(char) * len + 1);
  int k = 0, kNew = 0;
  while(k < strlen(word1) || k < strlen(word2)){
    if(k < strlen(word1)) newWord[kNew++] = word1[k];
    if(k < strlen(word2)) newWord[kNew++] = word2[k];
    k++;
  }

  newWord[kNew] = '\0';

  return newWord;

}