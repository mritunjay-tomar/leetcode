package LinkedList;

// https://leetcode.com/problems/odd-even-linked-list/

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd=null,even=null, returnOdd = null, returnEven = null;
        while(head != null) {
            if(head.val % 2 == 1) {
                if(odd == null) {
                    odd = new ListNode(head.val);
                    returnOdd = odd;
                } else {
                    odd.next = new ListNode(head.val);
                    odd = odd.next;
                }
            } else {
                if(even == null) {
                    even = new ListNode(head.val);
                    returnEven = even;
                } else {
                    even.next = new ListNode(head.val);
                    even = even.next;
                }
            }
            head = head.next;
        }
        odd.next = returnEven;

        return returnOdd;
    }

    public ListNode oddEvenList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd=null,even=null, returnOdd = null, returnEven = null;
        int counter = 1;
        while(head != null) {
            if(counter % 2 == 1) {
                if(odd == null) {
                    odd = new ListNode(head.val);
                    returnOdd = odd;
                } else {
                    odd.next = new ListNode(head.val);
                    odd = odd.next;
                }
            } else {
                if(even == null) {
                    even = new ListNode(head.val);
                    returnEven = even;
                } else {
                    even.next = new ListNode(head.val);
                    even = even.next;
                }
            }
            head = head.next;
            counter++;
        }
        odd.next = returnEven;

        return returnOdd;
    }

    public static void main(String[] args) {
        OddEvenLinkedList object = new OddEvenLinkedList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        head = object.oddEvenList2(head);
        head.print(head);

        head2 = object.oddEvenList2(head2);
        head2.print(head2);
    }
}
