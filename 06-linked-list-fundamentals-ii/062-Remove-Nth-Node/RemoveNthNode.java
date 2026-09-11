
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveNthNode {

    static Node remove(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Move fast n nodes ahead.
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the last node.
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end.
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = 2;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head = remove(head, n);

        Node curr = head;

        System.out.print("Updated Linked List: ");

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
// Updated Linked List: 10 -> 20 -> 30 -> 50

// public class RemoveNthNode {

//     static Node remove(Node head, int n) {

//         if (n == 0) {
//             return head;
//         }
//         Node curr = head;
//         int length = 0;
        

//         while (curr != null) {
//             length++;
//             curr = curr.next;
//         }
//         if(n == length) {
//             return head.next;
//         }
//         int index = length - n - 1;

//         curr = head;


//         while (curr != null && index > 0) {
//             curr = curr.next;
//             index--;
//         }

//         curr.next = curr.next.next;

//         return head;

//     }

//     public static void main(String[] args) {

//         int n = 2;

//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);

//         head = remove(head, n);

//         Node curr = head;

//         while (curr != null) {
//             System.out.print(curr.data);

//             if (curr.next != null) {
//                 System.out.print(" -> ");
//             }

//             curr = curr.next;
//         }
//     }
// }

// class Node {

//     int data;
//     Node next;

//     Node(int val) {
//         this.data = val;
//         this.next = null;
//     }

// }
