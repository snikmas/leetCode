// root - insert(root, data)
// or insert(&root, data), insert (**root)

#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
  struct Node *leftPtr;
  struct Node *rightPtr;
  int data;
} Node;

Node *root = NULL;

struct Node *getNewNode(int data){
  Node *newNode = malloc(sizeof(Node));
  if(!newNode) return NULL;
  newNode->data = data  ;
  newNode->leftPtr = NULL; 
  newNode->rightPtr = NULL; 
  return newNode;
}


void insert(int data){
  
  printf("DO you wanna use recursive method(1) or loop(2)?\n");

  char c;
  scanf("%i", &c);
  if(c == 1) insertRec(data, &root);
  else insertLoop(data);
}

void insertRec(int data, Node **node){
  Node *newNode = getNewNode(data);
  if(node == NULL){
    node = newNode; 
  } else if(node->data > data) {
    insertRec(data, node->leftPtr);
  } else if(node->data < data){
    insertRec(data, node->rightPtr);
  } else if(node->data == data) return; // no input
}
void insertLoop(int data){
  Node *newNode = getNewNode(data);

  if(root == NULL){
    root = newNode;
  } else{
    Node *temp = root;
    Node *parent = NULL;
    while(temp != NULL){
      parent = temp;
      if(temp->data < data){
        temp = temp->rightPtr;
      } else if(temp->data > data){
        temp = temp->leftPtr;
      } else {
        free(newNode;)
      }; // means that this data exists;
    }

  }
  if (data < parent->data) parent->leftPtr = newNode;
  else parent->rightPtr = newNode;

}



int main(void){

  printf("\tBinary Tree\nMenu:\n")
  printf("1 - see the tree");
  printf("2 - insert your data");
  printf("3 - remove your data");
  printf("-1 - exit");

  printf("Input your data (-1 for exit):\n");
  int input = 0;
  int data;
  while(input != -1){
    scanf("%i", &input);
    switch(input){
      case 1:
        view();
        break;
      case 2:
        printf("Input your data:\n");
        scanf("%i", &data);
        insert(data);
        break;
      case 3:
        printf("Input your data to delete:\n");
        scanf("%i", &data);
        delete(data);
        break;
      case -1:
        printf("Exit...");
        return 0;
    }

    printf("\nCompleted\nWhat's next?\n");
  }
  return 0;
}