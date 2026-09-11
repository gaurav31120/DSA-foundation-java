/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ConvertArrayToLinkedList {

    // Converts an integer array into a singly linked list.
    static Node convertToLinkedList(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node curr = head;

        int i = 1;

        while (i < arr.length) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
            i++;
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

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        Node head = convertToLinkedList(arr);

        System.out.print("Linked List: ");
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
Array: 1 2 3 4 5
Linked List: 1 -> 2 -> 3 -> 4 -> 5
*/