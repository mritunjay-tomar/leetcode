package LinkedList;

// https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodePairs {
    public ListNode swapNodes(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode tempHead = head;
        while(head != null) {
            if(head.next == null) break;
            ListNode first = head;
            ListNode second = head.next;

            int temp = first.val;
            first.val = second.val;
            second.val = temp;

            head = head.next;
            head = head.next;
        }

        print(tempHead);
        return tempHead;
    }

    public void print(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapNodePairs object = new SwapNodePairs();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head3 = new ListNode();
        ListNode head4 = new ListNode(1);
        head = object.swapNodes(head);
        head2 = object.swapNodes(head2);
        head3 = object.swapNodes(head3);
        head4 = object.swapNodes(head4);
    }
}
