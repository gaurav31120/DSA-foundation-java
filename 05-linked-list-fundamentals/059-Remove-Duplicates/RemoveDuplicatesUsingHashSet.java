import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingHashSet {

    static Node duplicate(Node head) {

        Set<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (set.contains(curr.data)) {
                // set.add(curr.data);
                prev.next = curr.next;
                curr = curr.next;
            } else {
                set.add(curr.data);

                prev = curr;
                curr = curr.next;
            }
        }

        return head;

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(50);

        Node curr = duplicate(head);

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
