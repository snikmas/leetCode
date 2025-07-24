#include <stdio.h>
#include <stdlib.h>

struct Node {
  int value;
  struct Node *next;
};

struct Node *insertData(struct Node *current, int num){
  struct Node *temp = (struct Node*) malloc(sizeof(struct Node));
  temp->value = num;
  temp->next = NULL;
  if(current != NULL) temp->next = current;
  current = temp;
  return temp;
}

void output(struct Node *current){
  while(current != NULL){
    printf("num: %i", current->value);
    current = current->next;
  }
}

int main(void){

  struct Node *head = NULL;
  int n, num;

  printf("how many numbers do you want, ma little boy?\n>> ");
  scanf("%i", &n);

  printf("Go ahead:\n");
  for(int i = 0; i < n; i++){
    scanf("%i", &num);
    head = insertData(head, num);
  }

  output(head);

  return 0;
}