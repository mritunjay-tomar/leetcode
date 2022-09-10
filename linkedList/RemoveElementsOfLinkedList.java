package linkedList;

// https://leetcode.com/problems/remove-linked-list-elements/

public class RemoveElementsOfLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        if(head.val == val && head.next == null) return null;
        if(head.val == val) head = head.next;

        ListNode temp;
        if (head.val != val) {
            temp = new ListNode(head.val, null);
            head = head.next;
        } else {
            temp = new ListNode(-1, null);
        }

        ListNode returnNode = temp;

        while(head != null) {
            if(head.val != val) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }

        if(returnNode.val == -1) return returnNode.next;
        return returnNode;
    }

    public void print(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        RemoveElementsOfLinkedList object = new RemoveElementsOfLinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        head = object.removeElements(head, 5);
        head.print(head);

        object.removeElements(null, 5);
        ListNode head2 = object.removeElements(new ListNode(1), 2);
        head2.print(head2);

        ListNode head3 = new ListNode(5, new ListNode(5, new ListNode(5, new ListNode(5, new ListNode(5, new ListNode(5))))));
        object.removeElements(head3, 5);
    }
}
