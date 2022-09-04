package LinkedList;

import java.math.BigInteger;

// https://leetcode.com/problems/add-two-numbers/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}

public class AddTwoNumbers {
    public ListNode getReturnList(BigInteger number) {
        BigInteger ten = new BigInteger("10");
        BigInteger zero = new BigInteger("0");

        BigInteger first = number.mod(ten);
        number = number.divide(ten);
        ListNode node = new ListNode(first.intValue());
        ListNode tempNode = node;
        while(number.compareTo(zero) != 0) {
            first = number.mod(ten);
            node.next = new ListNode(first.intValue());
            number = number.divide(ten);
            node = node.next;
        }
        return tempNode;
    }

    public BigInteger getNumber(ListNode l) {
        StringBuilder number = new StringBuilder();
        while(l.next != null) {
            number.append(l.val);
            l = l.next;
        }
        number.append(l.val);

        return new BigInteger(number.reverse().toString());
    }

    public ListNode addTwoNumbers() {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(5, new ListNode(7)));
        BigInteger number1 = getNumber(node1);
        BigInteger number2 = getNumber(node2);
        return getReturnList(number1.add(number2));
    }

    public static void main(String[] args) {
        AddTwoNumbers object = new AddTwoNumbers();
        ListNode node = object.addTwoNumbers();
        while(node.next != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.print(node.val + " ");
    }
}
