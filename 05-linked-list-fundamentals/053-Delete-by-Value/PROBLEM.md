# F053 — Delete by Value

## Problem

Given a singly linked list and a value, delete the **first node containing that value**.

If the value is not present in the linked list, leave the list unchanged.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> 20 -> 40 -> null
```

Delete the value:

```text
20
```

Only the **first occurrence** of `20` should be deleted.

## Expected Result

```text
10 -> 30 -> 20 -> 40 -> null
```

## Expected Output

```text
10 -> 30 -> 20 -> 40
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the initial list:

   ```text
   10 -> 20 -> 30 -> 20 -> 40
   ```
3. Store the value to delete as `20`.
4. Delete only the **first occurrence** of that value.
5. If the value is at the head, update `head`.
6. If the value is not found, keep the list unchanged.
7. Print the resulting list using `->`.
8. Do not use Java's built-in `LinkedList`.

## Important Concept

There are two cases.

### Case 1 — Value is at Head

For:

```text
20 -> 30 -> 40 -> null
```

delete `20`:

```java
head = head.next;
```

Result:

```text
30 -> 40 -> null
```

### Case 2 — Value is After Head

Use a temporary pointer to find the node **before** the node that should be deleted.

For:

```text
10 -> 20 -> 30 -> 20 -> 40 -> null
```

when `curr` points to `10`:

```text
curr.next -> 20
```

If that node contains the target value, bypass it:

```java
curr.next = curr.next.next;
```

Result:

```text
10 -> 30 -> 20 -> 40 -> null
```

## Important Rule

Delete **only the first occurrence**.

Given:

```text
10 -> 20 -> 30 -> 20 -> 40
```

the second `20` must remain.

## Edge Cases

Handle:

* Empty list
* Value found at head
* Value found in the middle
* Value found at the end
* Value not found
* Multiple occurrences — delete only the first

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

In the worst case, the entire list may need to be traversed.

### Task Path

```text
05-linked-list-fundamentals/053-Delete-by-Value/DeleteByValue.java
```
