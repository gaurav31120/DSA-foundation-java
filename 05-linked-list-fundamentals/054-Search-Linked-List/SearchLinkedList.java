// Time Complexity: O(n)
// Space Complexity: O(1)

public class SearchLinkedList {

    static boolean search(Node head, int target) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == target) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    public static void main(String[] args) {

        int target = 20;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        boolean found = search(head, target);

        System.out.println(found);
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
// true