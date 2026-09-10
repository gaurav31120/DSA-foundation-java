# F048 — Insert at Beginning

## Problem

Given a singly linked list, insert a new node at the **beginning** of the linked list.

The new node must become the new `head` of the list.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 → 20 → 30 → null
```

Insert:

```text
5
```

at the beginning.

## Expected Result

```text
5 → 10 → 20 → 30 → null
```

## Expected Output

```text
5 10 20 30
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the initial list:

   ```text
   10 → 20 → 30
   ```
3. Maintain a `head` reference.
4. Create a new node containing `5`.
5. Insert the new node at the beginning.
6. Update `head` so it points to the new node.
7. Traverse and print the resulting list.
8. Do not use Java's built-in `LinkedList`.

## Important Concept

To insert a node at the beginning:

```java
newNode.next = head;
head = newNode;
```

Before:

```text
head
 ↓
10 → 20 → 30 → null
```

After:

```text
head
 ↓
5 → 10 → 20 → 30 → null
```

## Complexity Target

For insertion at the beginning:

* Time Complexity: **O(1)**
* Extra Space Complexity: **O(1)**

Traversal for printing takes **O(n)**.

### Task Path

```text
05-linked-list-fundamentals/048-Insert-at-Beginning/InsertAtBeginning.java
```
