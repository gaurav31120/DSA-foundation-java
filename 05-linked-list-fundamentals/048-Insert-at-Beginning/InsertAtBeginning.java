// Time Complexity: O(n)
// Space Complexity: O(1)

public class InsertAtBeginning {

    static Node insertAtBeginning(Node head, int x) {

        Node newNode = new Node(x);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static void main(String[] args) {

        int x = 5;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertAtBeginning(head, x);

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
// 5 -> 10 -> 20 -> 30 -> 40