# F046 — Create Linked List

## Concept

A singly linked list is a collection of nodes where each node contains:

* `data` — stores the value
* `next` — stores the reference to the next node

The first node is accessed using the `head` reference.

The last node always has:

```java
next = null;
```

---

## Node Structure

```java
class Node {

    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
```

Each node stores both the value and the reference to the next node.

---

## Creating the Linked List

```java
Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
```

The structure becomes:

```text
head
 ↓
10 → 20 → 30 → null
```

---

## Traversal

Use a temporary pointer:

```java
Node curr = head;

while (curr != null) {
    System.out.println(curr.data);
    curr = curr.next;
}
```

The pointer moves from one node to the next using:

```java
curr = curr.next;
```

---

## Key Points

* `head` points to the first node.
* `next` connects one node to another.
* The final node points to `null`.
* Traversal starts from `head`.
* Do not lose the `head` reference.
* Java's built-in `LinkedList` is not used.

---

## Complexity

For `n` nodes:

* Creating nodes: **O(n)**
* Traversing the list: **O(n)**
* Extra space: **O(n)**

---

## Visual Representation

```text
head
 ↓
┌──────┬──────┐
│  10  │  ●───┼──→
└──────┴──────┘
             ↓
        ┌──────┬──────┐
        │  20  │  ●───┼──→
        └──────┴──────┘
                     ↓
                ┌──────┬──────┐
                │  30  │ null │
                └──────┴──────┘
```
