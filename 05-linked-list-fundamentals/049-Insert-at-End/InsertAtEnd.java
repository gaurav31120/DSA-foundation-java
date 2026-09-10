// Time Complexity: O(n)
// Space Complexity: O(1)

public class InsertAtEnd {

    static Node insertAtEnd(Node head, int x) {

        Node newNode = new Node(x);

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        int x = 50;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertAtEnd(head, x);

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
// 10 -> 20 -> 30 -> 40 -> 50