#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// we shoudl return the same s or we can create a new array?

// the 2nd approach:
// 1. array of pointers
// 2. loop through s, create a pointer to the first symbol and if there are a space, add \0 to a word and put this pointer to the array

char** reverseWords(char* s) {
    
  char **ptrArray = malloc(sizeof(char *) * strlen(s));
  int n = 0;

  char *ptr1 = s;
  int wordStart = 0; // tracks where current word started
  for(int i = 0; s[i] != '\0'; i++){
    printf("string: %s; str[%i] = %c\n", s, i, s[i]);

    if(s[i] == ' ' || s[i] == '\0'){ // if there is a space of the end of the word
      // Store pointer to start of this word
      ptrArray[n++] = s + wordStart;
    }

    if (i > 0 && s[i - 1] == ' ') {
      wordStart = i;
    }



  }

  printf("%s", ptrArray);

  return ptrArray;

}

int main(void){

  char *s = "the sky is blue";

  reverseWords(s);



  return 0;
}