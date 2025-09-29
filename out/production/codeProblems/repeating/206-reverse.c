#include <stdio.h>
#include <stdlib.h>
#include <string.h>


//  * Definition for singly-linked list.//
struct ListNode {
  int val;
  struct ListNode *next;
};

struct ListNode* reverseList(struct ListNode* head) {
  struct *prev = NULL, *current = head, *next = NULL;

  while(current != NULL){
      next = current->next;
      current->next = prev;
      prev = current;
      current = next;
  }

  return current;
}
int main(void){
  struct ListNode *head = malloc(sizeof(struct ListNode) * 5);
  int arr[5] = {1, 4, 5, 2, 4};
  for(int i = 0; i < 5; i++){
    struct node->value = arr[i];
    node->next = malloc(sizeof(struct ListNode));
    node = node->next;
  }

  node->next = NULL;






  return 0;
}