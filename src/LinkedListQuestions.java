public class LinkedListQuestions {
    static class Node {

        int val;
        Node next;

        Node () {};
        Node (int val) {
            this.val = val;
        }

        static void display (Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.val);
                if (curr.next != null) System.out.print(" -> ");
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {
        Node one = new Node(3);
        Node two = new Node(9);
        Node three = new Node(5);
        Node four = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        Node head = one;

        Node.display(head);

        System.out.println();

        Node ans = insertRec(17, 3, head);

        Node.display(ans);



    }
    static Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        else {
            if (node.next == null) return node;
            node.next = insertRec(val, index-1, node.next);
            return node;
        }

    }
}
