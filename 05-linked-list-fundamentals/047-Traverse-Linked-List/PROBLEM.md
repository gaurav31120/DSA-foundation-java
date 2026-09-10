# F047 — Traverse Linked List

## Problem

Given a singly linked list, traverse the list from the `head` node to the end and print the data stored in every node.

You must use a temporary pointer to move through the linked list.

Do not use Java's built-in `LinkedList`.

## Input

Create the following linked list:

```text
10 → 20 → 30 → 40 → null
```

## Expected Output

```text
10
20
30
40
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the linked list with four nodes.
3. Maintain a `head` reference to the first node.
4. Use a temporary variable such as `curr` for traversal.
5. Continue traversing while the current node is not `null`.
6. Print each node's `data`.
7. Do not modify or lose the `head` reference.
8. Do not use Java's built-in `LinkedList`.

## Suggested Structure

```java
class Node {

    int data;
    Node next;

    Node(int val) {
        // initialize node
    }
}

public class TraverseLinkedList {

    public static void main(String[] args) {

        // Create linked list

        // Traverse and print
    }
}
```

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

## Important Concept

If:

```text
head
 ↓
10 → 20 → 30 → 40 → null
```

use:

```java
Node curr = head;
```

Then repeatedly move:

```java
curr = curr.next;
```

Stop when:

```java
curr == null
```

### Task Path

```text
05-linked-list-fundamentals/047-Traverse-Linked-List/TraverseLinkedList.java
```
