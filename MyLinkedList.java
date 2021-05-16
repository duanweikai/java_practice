import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
class MyLinkedList {

    /** Initialize your data structure here. */
    int size;
    ListNode head;  // sentinel node as pseudo-head
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode cur=new ListNode(-1);
        for(int i=0;i<index+1;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        ListNode cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
        node.next=null;


    }
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode node=new ListNode(val);
        ListNode cur=head;
        ++size;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;

    }
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode cur=head;
        --size;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;

    }
}
