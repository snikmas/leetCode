// 1st try

struct ListNode *deleteMiddle(struct ListNode *head){
  if(head->next == NULL) return NULL;

  struct ListNode *cur, *prev, *next;

  int num = 0;
  for(cur = head; cur != NULL; cur = cur->next){
    num++;
  }

  num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
  cur = head;
  for(int i = 0; i < num; i++){
    prev = cur;
    cur = cur->next;
  }

  prev->next = cur->next;
  cur->next = 0

  return head;
}