public class ReverseSection {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        first.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode curr = first;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();

        reorderList(first);
        curr = first;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
    }

    public static void reorderList(ListNode head) {
        // find the middle node
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse from middle node to end
        ListNode prev = null;
        ListNode post = null;
        while (slow != null) {
            post = slow.next;
            slow.next = prev;
            prev = slow;
            slow = post;
        }

        ListNode curr = head;
        boolean first = true;
        while (curr != prev) {
            if (first) {
                curr.next = prev;
                curr = curr.next;
                first = false;
            }
            else {
                prev.next = curr;
                prev = prev.next;
                first = true;
            }

        }



    }
}
