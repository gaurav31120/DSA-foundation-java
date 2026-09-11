# F057 — Find Middle

## Problem

Find the middle node of a singly linked list.

For an even number of nodes, return the **second middle node**.

Example:

```text
10 -> 20 -> 30 -> 40 -> 50
```

Middle:

```text
30
```

For an even-sized list:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60
```

Return:

```text
40
```

---

## Approach — Slow & Fast Pointers

Use two pointers:

```text
slow → moves 1 node at a time
fast → moves 2 nodes at a time
```

Start both at `head`.

```java
Node slow = head;
Node fast = head;
```

Move them together:

```java
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```

When `fast` reaches the end, `slow` is at the middle.

---

## Why It Works

For:

```text
10 -> 20 -> 30 -> 40 -> 50
```

Movement:

```text
Start:
slow = 10
fast = 10

Step 1:
slow = 20
fast = 30

Step 2:
slow = 30
fast = 50

Stop:
fast.next = null
```

Therefore:

```text
slow = 30
```

---

## Even Number of Nodes

For:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60
```

The two middle nodes are:

```text
30, 40
```

With both pointers starting at `head` and the condition:

```java
fast != null && fast.next != null
```

`slow` ends at:

```text
40
```

Therefore this implementation returns the **second middle node**.

---

## Edge Cases

### Empty List

```text
head = null
```

`slow` is `null`, so the method returns `null`.

### Single Node

```text
10 -> null
```

Returns:

```text
10
```

---

## Complexity

**Time Complexity:** O(n)

The fast pointer moves through the list at two nodes per iteration, so the list is traversed in linear time.

**Space Complexity:** O(1)

Only two pointers are used.

---

## Interview Takeaway

Remember:

```text
slow = 1 step
fast = 2 steps
```

When `fast` reaches the end:

```text
slow = middle
```

This **slow & fast pointer technique** is also useful for problems such as:

* Finding the middle
* Detecting cycles
* Finding the cycle entry
* Some linked-list palindrome problems
