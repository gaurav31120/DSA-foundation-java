# F051 — Delete from Beginning

## Concept

Deleting from the beginning means removing the first node and making the second node the new `head`.

### Initial List

```text id="6vq3mz"
10 -> 20 -> 30 -> 40 -> null
```

After deleting `10`:

```text id="z4q8rp"
20 -> 30 -> 40 -> null
```

---

## Core Logic

For a non-empty list with more than one node:

```java id="k8x1cz"
head = head.next;
```

Before:

```text id="4jv8na"
head
 ↓
10 -> 20 -> 30 -> 40 -> null
```

After:

```text id="q7m2vx"
head
 ↓
20 -> 30 -> 40 -> null
```

The old `10` node is no longer reachable from `head`.

---

## Edge Cases

### Empty List

```text id="5wq9yr"
head == null
```

There is nothing to delete, so return `null`.

### Single Node

```text id="a8f3kp"
10 -> null
```

After deletion:

```text id="c2n6vz"
null
```

Therefore:

```java id="9m4xqt"
if (head == null || head.next == null) {
    return null;
}
```

---

## Algorithm

1. Check whether the list is empty or contains only one node.
2. If so, return `null`.
3. Move `head` to `head.next`.
4. Return the updated head.

---

## Complexity

Deletion from the beginning does not require traversal.

* Time Complexity: **O(1)**
* Extra Space Complexity: **O(1)**

---

## Key Points

* The second node becomes the new head.
* No nodes need to be shifted.
* The old first node becomes unreachable.
* Always consider empty and single-node lists.
* Deletion from the beginning is an **O(1)** operation.
