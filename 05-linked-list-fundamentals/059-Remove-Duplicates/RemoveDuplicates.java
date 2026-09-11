/*
Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class RemoveDuplicates {

    // Removes duplicate values while keeping the first occurrence.
    static Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {

            Node runner = current;

            while (runner.next != null) {

                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }

        return head;
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
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(50);

        System.out.print("Original List: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(head);
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

/*
Output:
Original List: 10 -> 20 -> 30 -> 20 -> 30 -> 40 -> 50
After Removing Duplicates: 10 -> 20 -> 30 -> 40 -> 50
*/