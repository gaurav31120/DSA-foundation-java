# F049 — Insert at End

## Problem

Given a singly linked list, insert a new node at the **end** of the linked list.

The new node must become the last node, and its `next` must be `null`.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> null
```

Insert:

```text
40
```

at the end.

## Expected Result

```text
10 -> 20 -> 30 -> 40 -> null
```

## Expected Output

```text
10 -> 20 -> 30 -> 40
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the initial list:

   ```text
   10 -> 20 -> 30 -> null
   ```
3. Create a new node containing `40`.
4. Traverse the list to find the last node.
5. Connect the last node to the new node.
6. Ensure the new node's `next` is `null`.
7. Print the resulting linked list using `->`.
8. Do not use Java's built-in `LinkedList`.

## Important Concept

To insert at the end, first reach the last node:

```java
while (curr.next != null) {
    curr = curr.next;
}
```

Then connect the new node:

```java
curr.next = newNode;
```

The resulting list:

```text
10 -> 20 -> 30 -> 40 -> null
```

## Complexity Target

For a list containing `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

The traversal is required to reach the last node.

### Task Path

```text
05-linked-list-fundamentals/049-Insert-at-End/InsertAtEnd.java
```
