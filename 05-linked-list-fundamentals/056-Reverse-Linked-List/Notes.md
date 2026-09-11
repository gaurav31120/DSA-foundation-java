# F056 — Reverse Linked List

## Problem

Reverse a singly linked list by changing the existing `next` references.

Example:

```text
Before:
10 -> 20 -> 30 -> 40 -> 50

After:
50 -> 40 -> 30 -> 20 -> 10
```

---

## Core Idea

Use three pointers:

```text
prev
curr
next
```

### Pointer Roles

* `prev` → points to the already reversed portion.
* `curr` → points to the node currently being processed.
* `next` → temporarily stores the remaining list so it is not lost.

---

## Algorithm

```text
1. Set prev = null.
2. Set curr = head.
3. While curr is not null:
   a. Save curr.next in next.
   b. Reverse curr.next to point to prev.
   c. Move prev to curr.
   d. Move curr to next.
4. Return prev as the new head.
```

---

## Important Pattern

```java
Node prev = null;
Node curr = head;

while (curr != null) {
    Node next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}

return prev;
```

---

## Why `next` Is Necessary

When we reverse:

```java
curr.next = prev;
```

the original `curr.next` reference is lost.

Therefore, we first save it:

```java
Node next = curr.next;
```

Otherwise, we would lose access to the remaining nodes.

---

## Pointer Movement

For:

```text
10 -> 20 -> 30 -> null
```

Initially:

```text
prev = null
curr = 10
```

After processing `10`:

```text
null <- 10

prev = 10
curr = 20
```

After processing `20`:

```text
null <- 10 <- 20

prev = 20
curr = 30
```

After processing `30`:

```text
null <- 10 <- 20 <- 30

prev = 30
curr = null
```

Therefore:

```text
30 -> 20 -> 10 -> null
```

`prev` is the new head.

---

## Edge Cases

### Empty List

```text
head = null
```

Result:

```text
null
```

### Single Node

```text
10 -> null
```

Result:

```text
10 -> null
```

### Two Nodes

```text
10 -> 20 -> null
```

Result:

```text
20 -> 10 -> null
```

---

## Complexity

**Time Complexity:** O(n)

Every node is processed exactly once.

**Space Complexity:** O(1)

Only a few pointer variables are used. No additional linked list is created.

---

## Interview Takeaway

The most important linked-list reversal pattern to remember is:

```java
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
```

The critical rule is:

> **Save `next` before changing `curr.next`.**

Also remember:

> **After the loop, `prev` is the new head.**
