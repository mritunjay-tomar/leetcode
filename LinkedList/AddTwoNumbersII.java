package LinkedList;

// https://leetcode.com/problems/add-two-numbers-ii/

import java.math.BigInteger;
import java.util.Stack;

public class AddTwoNumbersII {

    private BigInteger getNumber(ListNode number) {
        BigInteger num = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        while(number != null) {
            num = num.multiply(ten).add(new BigInteger(String.valueOf(number.val)));
            number = number.next;
        }

        return num;
    }

    private ListNode reverseLinkedList(ListNode head) {
        if(head == null) return head;

        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode returnHead = null;

        do {
            if(returnHead == null) {
                returnHead = new ListNode(stack.pop());
                head = returnHead;
            } else {
                returnHead.next = new ListNode(stack.pop());
                returnHead = returnHead.next;
            }
        } while(!stack.isEmpty());
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.next == null && l2.next == null) {
            if(l1.val + l2.val < 10) return new ListNode(l1.val + l2.val);

            int sum = l1.val + l2.val;
            ListNode head = new ListNode(sum%10);
            sum = sum / 10;
            head.next = new ListNode(sum%10);
            return reverseLinkedList(head);
        }


        ListNode output = null, head = null;
        BigInteger num = getNumber(l1).add(getNumber(l2));

        while(!num.equals(new BigInteger("0"))) {
            int addnum = num.mod(new BigInteger("10")).intValue();
            if(output == null) {
                output = new ListNode(addnum);
                head = output;
            } else {
                output.next = new ListNode(addnum);
                output = output.next;
            }
            num = num.divide(new BigInteger("10"));
        }

        return reverseLinkedList(head);
    }

    public static void main(String[] args) {
        AddTwoNumbersII object = new AddTwoNumbersII();
        ListNode number1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode number2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = object.addTwoNumbers(number1, number2);
        result.print(result);

        number1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        number2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        result = object.addTwoNumbers(number1, number2);
        result.print(result);

        number1 = new ListNode(0);
        number2 = new ListNode(0);

        result = object.addTwoNumbers(number1, number2);
        result.print(result);

        number1 = new ListNode(5);
        number2 = new ListNode(5);

        result = object.addTwoNumbers(number1, number2);
        result.print(result);
    }
}
