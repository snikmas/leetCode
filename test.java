class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    private ListNode head;
    private ListNode tail;
    private int size = 0;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        if(index == 0) return head.next.val;
        if(index == size - 1) return tail.val;

        ListNode curNode = head;
        for(int i = 0; i < index; i++){
            if(curNode == null) return -1;
            curNode = curNode.next;
        }
        return curNode.val;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        
        
    }

    public void insertTail(int val) {
        List newNode = new ListNode(val);
        tail = newNode;
    }

    public boolean remove(int index) {
        if(index > size) return false;
        if(index == size) {
            tail = null; // ? or tail.next
            size--;
            return true;
        }
        ListNode curNode = head;
        for(int i = 0; i < index - 1; i++){
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        List<Integer> arr = new ArrayList<>();
        ListNode cur = head;
        for(int i = 0; i < size; i++){
            arr.add(head.value);
            head = head.next;
        }

        return arr;

    }
}