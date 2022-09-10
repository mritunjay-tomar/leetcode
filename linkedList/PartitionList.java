package linkedList;

// https://leetcode.com/problems/partition-list/

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode temp1 = null, temp2 = null;
        ListNode returnList = null, anotherReturnList = null;

        while(head != null) {
            if(head.val < x) {
                if(temp1 == null) {
                    temp1 = new ListNode(head.val);
                    returnList = temp1;
                } else {
                    temp1.next = new ListNode(head.val);
                    temp1 = temp1.next;
                }
            } else {
                if(temp2 == null) {
                    temp2 = new ListNode(head.val);
                    anotherReturnList = temp2;
                } else {
                    temp2.next = new ListNode(head.val);
                    temp2 = temp2.next;
                }
            }
            head = head.next;
        }
        if(temp1 != null) temp1.next = anotherReturnList;
        else return anotherReturnList;

        return returnList;
    }

    public static void main(String[] args) {
        PartitionList object = new PartitionList();
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode head2 = new ListNode(2, new ListNode(1));
        ListNode head3 = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode head4 = new ListNode(1);

        head = object.partition(head, 3);
        head.print(head);
        head2 = object.partition(head2, 2);
        head2.print(head2);
        head3 = object.partition(head3, 0);
        head3.print(head3);


        head3 = object.partition(null, 0);
        head4 = object.partition(head4, 0);
        head4.print(head4);
    }
}
