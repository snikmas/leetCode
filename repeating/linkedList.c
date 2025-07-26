// linked lists in c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node {
  int data;
  struct Node *next;
};

int getNum(){
  int num;
  printf("Gimme your number:\n");
  scanf("%i");

  return num;
}

void insert(struct Node **head){
  
  int num;
  printf("Your number: ");
  scanf("%i", &num);
    
  struct Node *newNode = malloc(sizeof(struct Node));
  newNode->next = NULL;
  newNode->data = num;

  if(*head == NULL){
    *head = newNode;
  } else {
    struct Node *current = *head;
    while(current->next != NULL) 
    current = current->next;

  current->next = newNode;
}
}; // tail

void insertHead(struct Node *head, int num){

};
void insertIndex(struct Node *head, int num, int index){
  

};
void output(struct Node *head){

};
void deleteHeading(struct Node **head){
  
  if (*head == NULL) return;
  struct Node *head1 = *head;
  *head = (*head)->next;
  free(head1);
};

void deleteTailinf(struct Node **head){
  if(*head == NULL) return;
  struct Node *head1 = *head;
  while(head1->next->next != NULL){
    head1 = head1->next;
  }

  free(head1->next);
  head1->next = NULL;
};

void deleteByIndex(int index){

  struct Node *temp = head;
  if(index == 1) {
    head = head->next;
    free(temp);
    return;
  }
  for(int i = 0; i < index - 2; i++){
    temp = temp->next;
  }

  struct Node *temp1 = temp->next;
  temp->next = temp->next->next; // or temp->next = temp1->next
  free(temp1);
};

void searchByValue(struct Node *head, int value){

};

int main(void){

  struct Node *head = NULL;
  int n, num;

  int choice = 0;

  printf("Hi ma boyi! This is a Linked List program. hat would you like to do?\n"
    ">> 1 - insert a Number at the tail\n"
    ">> 2 -> insert a Number at the head\n"
    ">> 3 -> insert a Number at N position\n"
    ">> 4 -> output LinkedList\n"
    ">> 5 -> delete a Number from head\n"
    ">> 6 -> delete a Number from tail\n"
    ">> 7 -> delete a Number from N position\n"
    ">> 8 -> search for a NUmber by its value\n");

  int number;
  scanf("%i", &choice);
  
  switch(choice){
    case 1:
      insert(&head);
      break;
    case 2:
      number = getNum();
      insertHead(head, number);
    break;
    case 3:
      number = getNum();
      printf("index:\n>> ");
      int index = scanf("%i");
      insertIndex(head, number, index);
      break;
    case 4:
      output(head);
      break;
    case 5:
      deleteHeading(&head);
      break;
    case 6:
      deleteTailinf(&head);
      break;
    case 7:
      number = getNum();
      break;
    case 8:
      number = getNum();
      searchByValue(head, number);
      break;
    
  };




  return 0;
}
