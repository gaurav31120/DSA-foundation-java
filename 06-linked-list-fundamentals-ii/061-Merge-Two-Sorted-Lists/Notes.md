# F061 — Merge Two Sorted Lists

## Problem

Merge two sorted singly linked lists into one sorted linked list.

Example:

```text
List 1:
10 -> 30 -> 50

List 2:
20 -> 40 -> 60
```

Result:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60
```

---

## Approach — Dummy Node + Tail

Use:

```java
Node dummy = new Node(0);
Node tail = dummy;
```

The `dummy` node simplifies the handling of the first node.

`tail` always points to the last node in the merged list.

---

## Algorithm

1. Create a dummy node.
2. Set `tail = dummy`.
3. Keep two pointers:

   * `first` for List 1
   * `second` for List 2
4. Compare the current values.
5. Attach the smaller node to `tail.next`.
6. Move the selected pointer forward.
7. Move `tail` forward.
8. Continue while both lists contain nodes.
9. Attach whichever list still has remaining nodes.
10. Return `dummy.next`.

---

## Example

```text
List 1:
10 -> 30 -> 50

List 2:
20 -> 40 -> 60
```

Compare:

```text
10 < 20
```

Attach `10`:

```text
10
```

Compare:

```text
30 > 20
```

Attach `20`:

```text
10 -> 20
```

Continue:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60
```

---

## Why Use a Dummy Node?

Without a dummy node, we need special logic to determine the first node of the merged list.

With a dummy:

```text
dummy -> 10 -> 20 -> 30 -> ...
          ↑
        result
```

The actual merged list begins at:

```java
dummy.next
```

The dummy node is only a temporary helper.

---

## Important Pointer Pattern

```java
tail.next = first;
first = first.next;
tail = tail.next;
```

Or:

```java
tail.next = second;
second = second.next;
tail = tail.next;
```

The existing nodes are reused.

No new nodes are created for the merged result.

---

## Edge Cases

### Both Empty

```text
null
```

Result:

```text
null
```

### First List Empty

```text
null

10 -> 20 -> 30
```

Result:

```text
10 -> 20 -> 30
```

### Second List Empty

```text
10 -> 20 -> 30

null
```

Result:

```text
10 -> 20 -> 30
```

### Equal Values

```text
10 -> 20 -> 30

10 -> 20 -> 40
```

Result:

```text
10 -> 10 -> 20 -> 20 -> 30 -> 40
```

---

## Complexity

**Time Complexity:** O(n + m)

Every node from both lists is processed at most once.

**Space Complexity:** O(1)

Only a constant number of pointers are used.

---

## Interview Takeaway

The core pattern is:

```text
Compare → Attach smaller → Move pointer → Move tail
```

Remember:

> **The merged list does not require new nodes. Reuse the nodes from the two input lists.**
