package linkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode node) { this.val = val; this.next = node; }

    public void print(ListNode head) {
        if(head == null) {
            System.out.println("Head is empty");
            return;
        }
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
