
/*
Time Complexity: O(n + m)
Space Complexity: O(1)
*/


public class MergeTwoSortedLists {

    static Node merge(Node headFirst, Node headSecond) {

        Node first = headFirst;
        Node second = headSecond;
        Node curr = null;
        Node head = null;

        if(first == null && second == null) {
            return null;
        }
        if(first == null) {
            return second;
        }
         if(second == null) {
            return  first;
        }

        if (first.data < second.data) {
            head = headFirst;
            curr = headFirst;
            first = first.next;
        } else {
            head = headSecond;
            curr = headSecond;
            second = second.next;
        }

        while (first != null && second != null) {
            if (first.data < second.data) {
                curr.next = first;
                curr = first;
                first = first.next;
            } else {
                curr.next = second;
                curr = second;
                second = second.next;
            }
        }

        while (first != null) {

            curr.next = first;
            curr = first;
            first = first.next;

        }
        while (second != null) {

            curr.next = second;
            curr = second;
            second = second.next;

        }

        return head;

    }

    public static void main(String[] args) {

        Node headFirst = new Node(10);
        headFirst.next = new Node(30);
        headFirst.next.next = new Node(50);

        Node headSecond = new Node(20);
        headSecond.next = new Node(40);
        headSecond.next.next = new Node(60);

        Node curr = merge(headFirst, headSecond);

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

/*
Output:
List 1: 10 -> 30 -> 50
List 2: 20 -> 40 -> 60
Merged List: 10 -> 20 -> 30 -> 40 -> 50 -> 60
*/