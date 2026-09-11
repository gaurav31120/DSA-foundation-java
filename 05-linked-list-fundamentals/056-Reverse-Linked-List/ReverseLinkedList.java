public class ReverseLinkedList {

    // Reverses the existing links and returns the new head.
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // Save next node
            curr.next = prev;      // Reverse the link
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Prints the linked list using arrow notation.
    static void printList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(40);

        head = reverse(head);

        printList(head);
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

/*
Output:
40 -> 20 -> 30 -> 20 -> 10
*/