# F050 — Insert at Position

## Problem

Given a singly linked list, insert a new node at a specified **position**.

Use **0-based indexing**:

* Position `0` means insert at the beginning.
* Position `1` means insert after the first node.
* Position `2` means insert after the second node.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> 40 -> null
```

Insert:

```text
25
```

at position:

```text
2
```

## Expected Result

```text
10 -> 20 -> 25 -> 30 -> 40 -> null
```

## Expected Output

```text
10 -> 20 -> 25 -> 30 -> 40
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the initial list:

   ```text
   10 -> 20 -> 30 -> 40
   ```
3. Store the insertion value `25`.
4. Store the position `2`.
5. Traverse to the node immediately **before** the insertion position.
6. Create the new node.
7. Connect the new node correctly without losing the remaining list.
8. Print the resulting linked list using `->`.
9. Do not use Java's built-in `LinkedList`.

## Important Concept

For position `2`:

```text
10 -> 20 -> 30 -> 40
```

We need to stop at `20`, because `25` must be inserted after it.

Then:

```java
newNode.next = curr.next;
curr.next = newNode;
```

Result:

```text
10 -> 20 -> 25 -> 30 -> 40 -> null
```

## Edge Case

If the position is `0`, the new node must become the new head.

Conceptually:

```java
newNode.next = head;
head = newNode;
```

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

The list may need to be traversed to reach the required position.

### Task Path

```text
05-linked-list-fundamentals/050-Insert-at-Position/InsertAtPosition.java
```
