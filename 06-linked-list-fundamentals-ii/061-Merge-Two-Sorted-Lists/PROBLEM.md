# F061 — Merge Two Sorted Lists

## Problem Statement

Given two **sorted singly linked lists**, merge them into a single sorted linked list.

The resulting linked list must contain all nodes from both input lists in **ascending order**.

The existing nodes must be reused by changing their `next` references.

Do not create a separate linked list containing new nodes.

---

## Example 1

### List 1

```text
10 -> 30 -> 50 -> null
```

### List 2

```text
20 -> 40 -> 60 -> null
```

### Expected Merged List

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
```

### Expected Output

```text
List 1: 10 -> 30 -> 50
List 2: 20 -> 40 -> 60
Merged List: 10 -> 20 -> 30 -> 40 -> 50 -> 60
```

---

## Example 2

### List 1

```text
5 -> 15 -> 25 -> null
```

### List 2

```text
10 -> 20 -> 30 -> null
```

### Expected Merged List

```text
5 -> 10 -> 15 -> 20 -> 25 -> 30 -> null
```

---

## Example 3 — Different Lengths

### List 1

```text
10 -> 20 -> 30 -> 40 -> null
```

### List 2

```text
15 -> 25 -> null
```

### Expected Merged List

```text
10 -> 15 -> 20 -> 25 -> 30 -> 40 -> null
```

---

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`

2. Create two sorted singly linked lists manually.

3. Implement:

```java
static Node merge(Node head1, Node head2)
```

4. Both input lists are sorted in ascending order.

5. Merge the two lists into one sorted linked list.

6. Reuse the existing nodes by changing their `next` references.

7. Do **not** create new nodes for the merged list.

8. Do not use an array.

9. Do not use Java's built-in `LinkedList`.

10. Return the head of the merged list.

11. Print the result using arrow notation.

---

## Edge Cases

### Both Lists Empty

```text
List 1: null
List 2: null
```

Expected result:

```text
null
```

### First List Empty

```text
List 1: null
List 2: 10 -> 20 -> 30
```

Expected:

```text
10 -> 20 -> 30
```

### Second List Empty

```text
List 1: 10 -> 20 -> 30
List 2: null
```

Expected:

```text
10 -> 20 -> 30
```

### Equal Values

```text
List 1: 10 -> 20 -> 30
List 2: 10 -> 20 -> 40
```

Expected:

```text
10 -> 10 -> 20 -> 20 -> 30 -> 40
```

---

## Expected Approach

Use two pointers:

```text
curr1 → current node in List 1
curr2 → current node in List 2
```

Compare their values.

If:

```java
curr1.data <= curr2.data
```

attach `curr1` to the merged list and move `curr1`.

Otherwise, attach `curr2` and move `curr2`.

Continue until one list becomes `null`.

Then attach the remaining portion of the other list.

---

## Hint

A **dummy node + tail pointer** can make the implementation easier.

Think:

```java
Node dummy = new Node(0);
Node tail = dummy;
```

Then:

```text
tail → last node in merged list
```

When selecting a node:

```java
tail.next = curr1;
tail = tail.next;
```

or:

```java
tail.next = curr2;
tail = tail.next;
```

At the end:

```java
return dummy.next;
```

### Important

The dummy node is only a helper.

It should **not** be part of the returned linked list.

---

## Complexity Target

**Time Complexity:** O(n + m)

Where:

* `n` = number of nodes in List 1
* `m` = number of nodes in List 2

**Space Complexity:** O(1) extra space.

---

## Expected Program Output

```text
List 1: 10 -> 30 -> 50
List 2: 20 -> 40 -> 60
Merged List: 10 -> 20 -> 30 -> 40 -> 50 -> 60
```
