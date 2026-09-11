// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindLength {

    static int findLength(Node head) {

        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int length = findLength(head);

        System.out.println("Total length of Linked List: " + length);
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
// Total length of Linked List: 5