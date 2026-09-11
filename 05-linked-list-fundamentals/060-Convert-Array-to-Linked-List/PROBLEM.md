# F060 — Convert Array to Linked List

## Problem Statement

Given an integer array, convert the array into a **singly linked list**.

Each array element should become a node in the linked list, maintaining the **same order** as the original array.

The method should return the `head` of the newly created linked list.

---

## Example

### Input

```text
[10, 20, 30, 40, 50]
```

### Expected Linked List

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

### Expected Output

```text
Array: 10 20 30 40 50
Linked List: 10 -> 20 -> 30 -> 40 -> 50
```

---

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`

2. Create an integer array manually.

3. Implement:

```java
static Node convertToLinkedList(int[] arr)
```

4. Create one linked-list node for each array element.

5. Preserve the original array order.

6. Return the head of the linked list.

7. Print the resulting linked list using arrow notation:

```text
10 -> 20 -> 30 -> 40 -> 50
```

8. Do not use Java's built-in `LinkedList`.

9. Handle an empty array.

---

## Example 2

### Input

```text
[5, 15, 25]
```

### Expected Linked List

```text
5 -> 15 -> 25 -> null
```

---

## Edge Cases

### Empty Array

```text
[]
```

Expected result:

```text
null
```

### Single Element

```text
[10]
```

Expected linked list:

```text
10 -> null
```

### Negative Values

```text
[-10, -20, -30]
```

Expected linked list:

```text
-10 -> -20 -> -30 -> null
```

---

## Expected Approach

Traverse the array from left to right.

For each element:

1. Create a new `Node`.
2. If it is the first element, make it the `head`.
3. Otherwise, connect it to the previous node using `next`.

Think about maintaining:

```text
head
tail
```

where:

* `head` points to the first node.
* `tail` points to the last node created.

For every new node:

```text
tail.next = newNode
tail = newNode
```

---

## Complexity Target

**Time Complexity:** O(n)

**Space Complexity:** O(n)

The linked list contains `n` newly created nodes.

---

## Expected Program Output

For:

```text
[10, 20, 30, 40, 50]
```

```text
Array: 10 20 30 40 50
Linked List: 10 -> 20 -> 30 -> 40 -> 50
```
