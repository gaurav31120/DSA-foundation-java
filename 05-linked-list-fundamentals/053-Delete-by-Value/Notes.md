# F053 — Delete by Value

## Concept

Delete the **first node** containing a given value from a singly linked list.

Example:

```text
10 -> 20 -> 30 -> 20 -> 40 -> null
```

Delete `20`.

Result:

```text
10 -> 30 -> 20 -> 40 -> null
```

Only the first `20` is deleted.

---

## Case 1 — Value at Head

If:

```text
20 -> 30 -> 40 -> null
```

and the value is `20`, update the head:

```java
head = head.next;
```

Result:

```text
30 -> 40 -> null
```

---

## Case 2 — Value After Head

We need to find the node **before** the node that should be deleted.

For:

```text
10 -> 20 -> 30 -> 40
```

when `curr` points to `10`:

```text
curr.next -> 20
```

If `curr.next.data` equals the target value:

```java
curr.next = curr.next.next;
```

Result:

```text
10 -> 30 -> 40
```

---

## Finding the Node

```java
while (curr.next != null && curr.next.data != value) {
    curr = curr.next;
}
```

The loop stops when:

1. The target value is found in `curr.next`, or
2. The end of the list is reached.

---

## Value Not Found

After the loop:

```java
if (curr.next == null) {
    return head;
}
```

This means the target value does not exist in the list.

The original list remains unchanged.

---

## Why `curr.next = curr.next.next`?

Suppose:

```text
10 -> 20 -> 30 -> 40
     ↑
   delete
```

`curr` points to `10`.

We bypass `20`:

```text
curr.next = curr.next.next;
```

Result:

```text
10 -> 30 -> 40
```

The remaining nodes stay connected.

---

## First Occurrence Only

Given:

```text
10 -> 20 -> 30 -> 20 -> 40
```

Deleting `20` gives:

```text
10 -> 30 -> 20 -> 40
```

The second `20` remains because the algorithm stops after deleting the first occurrence.

---

## Edge Cases

### Empty List

```text
head == null
```

Return `null`.

### Value at Head

Move `head` to `head.next`.

### Value in Middle

Bypass the target node.

### Value at End

The previous node's `next` becomes `null`.

### Value Not Found

Leave the list unchanged.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

In the worst case, the entire list may need to be traversed.

---

## Key Points

* Delete only the first occurrence.
* Handle the head separately.
* Search using `curr.next`.
* Preserve the remaining list with `curr.next.next`.
* Check for `null` before accessing `curr.next.data`.
* No extra data structure is required.
