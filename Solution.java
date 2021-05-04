public class Solution {

    public static ListNode middleNode(ListNode head) {


//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        cur=head;
        for(int i=0;i<count/2;i++){
            cur=cur.next;
        }
        return cur;

    }
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode cur=head;
        ListNode prev=head;
        if(head.val==val){
            return head.next;
        }
        while(cur!=null&&cur.val!=val){
            prev=cur;
            cur=cur.next;
        }
        if(cur!=null){
            prev.next=cur.next;
        }
        return head;

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;

    }


    public static ListNode insertNode(ListNode head,int val){
        ListNode node = new ListNode(val);
        if(head==null){
            return node;
        }
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        return head;
    }


    public static ListNode insertNode1(ListNode head,int val){
        ListNode node=new ListNode(val);
        if(head==null){
            return node;
        }
        node.next=head;
        head=node;
        return head;

    }

    public static void printNode(ListNode head){
        ListNode cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);
        head=insertNode(head,5);
        head=insertNode(head,6);
        head=insertNode(head,7);


        removeElements(head,6);


        printNode(head);
//        System.out.println();
//        System.out.println(middleNode(head).val);


    }
}
