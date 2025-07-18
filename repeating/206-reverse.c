// 07-09-2025
#include <stdio.h>
#include <stdlib.h>

// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// was: 1->2->3->4->5
// now: 5->4->3->2->1

// we get a linked list
// need 3 variables: prev : cur : next;
// if head == NULL or head->next == NULL -> return head
// 1. 3 - next
// 2. 2 - current->next = prev
// 3. prev = cur
// 4.0: cur = next
// 4.1: next = next->next;
// 4.2 cur->next = prev
// prev = curr

 
struct ListNode {
  int val;
  struct ListNode *next;
};

struct ListNode* reverseList(struct ListNode* head) {

  if (head == NULL || head->next == NULL) return head;
  
  struct ListNode *prev = NULL, *next = NULL, *cur = head;

  while(cur != NULL){
    next = cur->next;
    cur->next = prev;
    prev = cur;
    cur = next;
  }

  // here we are on 5:

  return prev; // next is a head
}


int main(void){





  return 0;
}