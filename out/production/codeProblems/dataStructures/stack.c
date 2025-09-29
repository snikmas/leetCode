#include <stack> //stack from standard tempate library <stl>
#include <stdlib.h>
#include <stdio.h>
#define MAX_SIZE 101
int A[MAX_SIZE];
int top = -1; // - empty stack

// for arrays: just to top = -1; push -> arr[++top] = x  1 - 12 - 123; pop.. top--; 1 2 3 4 -> 1 2 3;

typedef struct Node{
  struct Node *next;
  int data;
} Node;

Node *HEAD = NULL;

Node *createNode(int x){
  Node *newNode = malloc(sizeof(Node));
  newNode->data = x;
  newNode->next = NULL;
  return newNode;
}

void put(int x){
  Node *newN = createNode(x);
  if(HEAD == NULL){
    HEAD = newN;
  } else{
    newN->next = HEAD;
    HEAD = newN;
  }

}

void Pop(){
  Node *delete = HEAD;
  HEAD = HEAD->next;
  free(delete);
}

char popArr(char *stringi){
  int length = strlen(stringi);
  char popChar = stringi[length - 1];
  stringi[length - 1] = '\0';
  return popChar;
}

void reverse(char *c, int lengthC){
  char arr[lengthC];
  for(int i = 0; i < lengthC){
    arr[lengthC] = c.pop();
  }
}

void anotherReverse(char *C, int n){
  stack<char> S;
  //loop for push
  for(int ii = 0; i < n; i++){
    S.push(C[i]);
  }
  // loop for pop
  for(int i = 0; i < n; i++){
    C[i] = S.top();
    S.pop();
  }

  // using arrays:
  // tc: O(n) sc: O(n), constant time
  // without add space: 
  // 2 pointers: 1 and last -> and swap until first == last

  // with linked lists: iterative sol: tc: O(n); sc: o(1); recursive: tc oN  sc On
}

int main(void){

  
  
  



  return 0;
}