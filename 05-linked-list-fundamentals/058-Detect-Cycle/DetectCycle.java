/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class DetectCycle {

    // Detects a cycle using Floyd's Slow and Fast Pointer technique.
    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);

        // Create a cycle: 80 -> 40
        head.next.next.next.next.next.next.next.next = head.next.next.next;

        boolean isCycle = hasCycle(head);

        System.out.println("Cycle Detected: " + isCycle);
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
Cycle Detected: true
*/