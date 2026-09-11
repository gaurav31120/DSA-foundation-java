# F057 — Find Middle

## Problem Statement

Given a singly linked list, find the **middle node** of the linked list.

If the linked list contains an **odd number of nodes**, return the single middle node.

If the linked list contains an **even number of nodes**, return the **second middle node**.

The solution should return the actual `Node`, not just its value.

---

## Example 1 — Odd Number of Nodes

### Input

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

### Middle Node

```text
30
```

### Expected Output

```text
Middle Node: 30
```

---

## Example 2 — Even Number of Nodes

### Input

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
```

There are two middle nodes:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60
              ↑     ↑
            first  second
```

The problem requires returning the **second middle node**.

### Expected Output

```text
Middle Node: 40
```

---

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`

2. Create the linked list manually.

3. Implement the following method:

```java
static Node findMiddle(Node head)
```

4. Return the **middle `Node`**.

5. For an even-sized list, return the **second middle node**.

6. Print the middle node's data using a readable statement:

```text
Middle Node: 30
```

7. Do not convert the linked list into an array.

8. Do not use Java's built-in `LinkedList`.

9. The solution should use **O(1) extra space**.

---

## Expected Approach

Use the **Slow and Fast Pointer** technique.

* `slow` moves one node at a time.
* `fast` moves two nodes at a time.

When `fast` reaches the end of the list, `slow` will point to the middle node.

For an even-sized list, the loop condition should ensure that `slow` reaches the **second middle node**.

---

## Edge Cases

### Empty List

```text
null
```

Expected result:

```text
null
```

### Single Node

```text
10 -> null
```

Expected middle:

```text
10
```

### Two Nodes

```text
10 -> 20 -> null
```

Expected middle:

```text
20
```

---

## Constraints

* Use a singly linked list.
* Do not create another linked list.
* Do not use an array to find the middle.
* Do not use Java's built-in `LinkedList`.
* Return the actual `Node`.

---

## Complexity Target

**Time Complexity:** O(n)

**Space Complexity:** O(1)

---

## Expected Program Output

For:

```text
10 -> 20 -> 30 -> 20 -> 40
```

Output:

```text
Middle Node: 30
```
