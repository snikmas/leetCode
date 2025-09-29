#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

// my way, 3ms. is not the best
// char* reverseVowels(char* s) {
//   char vowels[] = "aeiou";
//   char myVowels[strlen(s)] = {};
//   int k = 0;

//   for(int i = 0; s[i] != '\0'; i++){
//     if(strchr(vowels, tolower(s[i]))){
//       myVowels[k++] = s[i];
//     }
//   }

//   // OKK VOWELS are godo

//   char *newS = malloc(sizeof(char) * (strlen(s) + 1));
//   k--;

//   for(int i = 0; s[i] != '\0'; i++){
  
//     newS[i] = strchr(vowels, tolower(s[i])) ? myVowels[k--] : s[i];

//   }

//   newS[strlen(s)] = '\0';


//   return newS;
// }

char* reverseVowels(char* s) {
  char vowels[] = "aeiou";
  
  int start = 0;
  int end = strlen(s) - 1;

  while(start < end){
    while(start < end && !strchr(vowels, tolower(s[start]))){
      start++;
    } 

    while(start < end && !strchr(vowels, tolower(s[end]))){  
      end--;
    } 

    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;

    start++;
    end--;
  }

  return s;
}


int main(void){

  char *s = "leetcode";
  printf("%s\n", reverseVowels(s));


  return 0;
}