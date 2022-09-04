package LinkedList;

public class RotateList {

    public ListNode rotateLeft(ListNode head, int k) {
        if (k == 0) return head;

        ListNode first = head;
        ListNode newNode = head.next;

        while(head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(first.val);
        k -= 1;

        return rotateLeft(newNode, k);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) return head;
        ListNode temp = head;
        ListNode previous = head;
        while(head.next != null) {
            previous = head;
            head = head.next;
        }
        ListNode last = head;
        previous.next = null;

        last.next = temp;
        k -= 1;
        return rotateRight(last, k);
    }

    public void print(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        RotateList object = new RotateList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = object.rotateRight(head, 2);
        object.print(head);

        ListNode head1 = new ListNode(1, new ListNode(2));
        head1 = object.rotateRight(head1, 1);
        object.print(head1);
    }
}
