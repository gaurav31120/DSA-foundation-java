// Time Complexity: O(1)
// Space Complexity: O(1)

public class DeleteFromBeginning {

    static Node deleteFromBeginning(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        head = head.next;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteFromBeginning(head);

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
// 20 -> 30 -> 40