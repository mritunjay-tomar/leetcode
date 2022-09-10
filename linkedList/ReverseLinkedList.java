package linkedList;

// https://leetcode.com/problems/reverse-linked-list/

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head=head.next;
        }

        ListNode newHead = new ListNode(stack.pop(), null);
        ListNode temp = newHead;
        do {
            newHead.next = new ListNode(stack.pop());
            newHead = newHead.next;
        } while(!stack.isEmpty());

        return temp;
    }

    public static void main(String[] args) {
        ReverseLinkedList object = new ReverseLinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = object.reverseList(head);
        head.print(head);
    }
}
