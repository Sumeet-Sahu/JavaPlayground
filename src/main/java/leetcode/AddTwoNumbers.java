package leetcode;

public class AddTwoNumbers {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(9)));

        ListNode output = addTwoNumbers(l1, l2);

        System.out.print(output);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode output = null;

        ListNode last = null;

        int carry = 0;
        do {
            ListNode node;
            int sum;
            if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            carry = sum / 10;

            node = new ListNode(sum % 10);


            if (output == null) {
                output = node;
            } else {
                last.next = node;
            }
            last = node;
        } while (l1 != null || l2 != null);

        if (carry != 0) {
            last.next = new ListNode(carry);
        }

        return output;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val) + (next == null ? "" : " -> " + next);
    }
}
