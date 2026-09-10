# F046 — Create Linked List

## Problem

Create a **singly linked list** from scratch using Java.

Each node should contain:

* An integer value.
* A reference to the next node.

Create at least three nodes and connect them together to form a linked list.

## Example

Create these values:

```text
10 → 20 → 30 → null
```

## Requirements

* Create a `Node` class.
* The `Node` class must contain:

  * `int data`
  * `Node next`
* Create three nodes.
* Connect the nodes in the correct order.
* Maintain a `head` reference to the first node.
* The last node's `next` must be `null`.
* Do not use Java's built-in `LinkedList`.

## Expected Structure

```text
head
 ↓
[10 | •] → [20 | •] → [30 | null]
```

## Expected Output

```text
10
20
30
```

## Suggested Structure

You may use:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        // initialize node
    }
}
```

Then create the linked list in `main()`.

## Complexity Target

* Creating each node → O(1)
* Connecting nodes → O(1)
* Total for creating `n` nodes → O(n)
* Extra space → O(n)

## Your Task

Implement the solution in:

```text
05-linked-list-fundamentals/046-Create-Linked-List/CreateLinkedList.java
```

Build the linked list manually first.

Do not use `java.util.LinkedList`.

First solve it yourself and send me your code for review.
