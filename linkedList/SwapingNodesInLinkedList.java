package linkedList;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

public class SwapingNodesInLinkedList {
    private int getCount(ListNode head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode kthNode=null, kthNode2=null, returnHead = head;
        int count = getCount(head);

        if(k > count) return head;

        for(int i=0;i<=count-k;i++) {
            if(i == k-1) {
                kthNode=head;
                System.out.println("first " + kthNode.val);
            }
            if(i==count-k) {
                kthNode2=head;
                System.out.println("second " + kthNode2.val);
            }
            head = head.next;
        }

        if(kthNode != null && kthNode2 != null) {
            int temp = kthNode.val;
            kthNode.val = kthNode2.val;
            kthNode2.val = temp;
        }

        return returnHead;
    }

    public static void main(String[] args) {
        SwapingNodesInLinkedList object = new SwapingNodesInLinkedList();
        ListNode head;
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = object.swapNodes(head, 2);
        head.print(head);

        head = new ListNode(7, new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
        head = object.swapNodes(head, 5);
        head.print(head);

        head = new ListNode(1, new ListNode(2));
        head = object.swapNodes(head, 1);
        head.print(head);

        head = new ListNode(100, new ListNode(20));
        head = object.swapNodes(head, 2);
        head.print(head);
    }
}
