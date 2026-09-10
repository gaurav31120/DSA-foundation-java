// Time Complexity: O(n)
// Space Complexity: O(1)

public class DeleteByValue {

    static Node deleteByValue(Node head, int value) {

        if (head == null) {
            return null;
        }

        if (head.data == value) {
            head = head.next;
            return head;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        if (curr.next == null) {
            return head;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {

        int value = 20;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(40);

        head = deleteByValue(head, value);

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
// 10 -> 30 -> 20 -> 40