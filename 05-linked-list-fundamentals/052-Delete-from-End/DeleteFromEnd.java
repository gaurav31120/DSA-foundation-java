// Time Complexity: O(n)
// Space Complexity: O(1)

public class DeleteFromEnd {

    static Node deleteFromEnd(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteFromEnd(head);

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }
    }
}

class Node {

    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

// Output:
// 10 -> 20 -> 30