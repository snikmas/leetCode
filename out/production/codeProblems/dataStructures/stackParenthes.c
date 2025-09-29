#include <stdio.h>
#include <string.h>
#include <stdlib.h>



void push(char *arr, char ch, int *top){
  arr[++(*top)] = ch;
};

char pop(char *arr, int *top){
  return arr[(*top)--];
}



int check(char *arr){
    int n = strlen(arr);
    char stack[n];
    int top = -1;

    for(int i = 0; i < n; i++){
        char ch = arr[i];
        if(ch == '{' || ch == '(' || ch == '['){
            push(stack, ch, &top);
        } else {
            if(top == -1) return -1; // stack empty, unmatched closing
            char open = pop(stack, &top);
            if( (ch == '}' && open != '{') ||
                (ch == ')' && open != '(') ||
                (ch == ']' && open != '[') ) {
                return -1;
            }
        }
    }

    return top == -1 ? 1 : -1; // stack empty → balanced
}




int main(void){

  int MAX = 20
  char input1[MAX] = "[[{()}]";
  char input2[MAX] = "[{[()}]";
  char input3[MAX] = "}][]";

  printf("%i\n", check(input1));
  printf("%i\n", check(input2));
  printf("%i\n", check(input3));




  return 0;
}