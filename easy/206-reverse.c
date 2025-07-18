#include <stdio.h>
#include <stdlib.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

 struct ListNode* reverseList(struct ListNode* head) {

  struct ListNode *curr = head;
  struct ListNode *next = NULL;
  struct ListNode *prev = NULL;
  while(curr != NULL){

    next = curr->next;
    curr->next = prev;
    prev = cur;
    curr = next;
    curr->next = prev;
    
  }

  return prev;
}

int main(void){

  struct ListNode *head = NULL;
  struct ListNode current;
  
  reverseList(arr1[0]);
  reverseList(arr2[0]);
  reverseList(arr3[0]);

  for(int i = 0; i < 5; i++){
    printf("arr1: %i\n", arr1[i]);
    printf("arr2: %i\n", arr2[i]);
    printf("arr3: %i\n", arr3[i]);
  }


  return 0;
}