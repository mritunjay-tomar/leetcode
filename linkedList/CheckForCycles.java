package linkedList;

// https://leetcode.com/problems/linked-list-cycle/

public class CheckForCycles {
    public boolean hasCycle(ListNode head) {
        ListNode slowRunner = head, fastRunner = head;
        while(slowRunner.next!=null && fastRunner.next.next!=null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if(slowRunner == fastRunner) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
