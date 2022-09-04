package LinkedList;

// https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodePairs {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode();
        while(head.next != null) {
            if(newHead == null) {
                newHead = head.next;
                newHead.next = head;
            } else {
                newHead =  head;
                newHead.next =  head.next;
                newHead = newHead.next.next;
            }
            head = head.next.next;
        }
        newHead.next = head.next;
        head = head.next;

        return newHead;
    }

    public void print(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        SwapNodePairs object = new SwapNodePairs();
        object.swapPairs(head);
        object.print(head);
        object.swapPairs(head2);
        object.print(head2);
    }
}
