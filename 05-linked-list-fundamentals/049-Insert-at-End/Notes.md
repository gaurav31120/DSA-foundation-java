# F049 — Insert at End

## Concept

Inserting at the end of a singly linked list means adding a new node after the current last node.

### Initial List

```text
10 -> 20 -> 30 -> 40 -> null
```

Insert `50`.

### Result

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

---

## Core Logic

First create the new node:

```java
Node newNode = new Node(x);
```

Start from the head:

```java
Node curr = head;
```

Move until the last node:

```java
while (curr.next != null) {
    curr = curr.next;
}
```

Connect the new node:

```java
curr.next = newNode;
```

---

## Why `curr.next != null`?

We want `curr` to point to the **last node**, not `null`.

For:

```text
10 -> 20 -> 30 -> 40 -> null
```

when:

```text
curr -> 40
```

we have:

```java
curr.next == null
```

So we stop and attach the new node:

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

---

## Important Point

The original `head` does not change when inserting into a non-empty list.

Therefore, we return the same `head`.

```java
return head;
```

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

We may need to traverse all `n` nodes to reach the last node.

---

## Key Points

* Create the new node.
* Start traversal from `head`.
* Stop at the node whose `next` is `null`.
* Connect that node to the new node.
* The new node's `next` remains `null`.
* The head remains unchanged.
