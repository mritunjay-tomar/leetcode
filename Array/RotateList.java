package Array;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp;
        ListNode newHead = null;
        for(int i=0;i<k;i++) {
            temp = newHead;
            while(head.next != null) {
                if(newHead == null) {
                    newHead = head.next;
                    head = head.next;
                } else {
                    newHead = newHead.next;
                    newHead = head.next;
                    head = head.next;
                }
            }
            newHead.next = temp;
        }
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
        RotateList object = new RotateList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(5)))));
        head = object.rotateRight(head, 2);
        object.print(head);
    }
}
