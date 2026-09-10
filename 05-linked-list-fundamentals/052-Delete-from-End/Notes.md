# F052 — Delete from End

## Concept

Deleting from the end of a singly linked list means removing the last node and making the second-last node the new last node.

### Initial List

```text id="4x8kq2"
10 -> 20 -> 30 -> 40 -> null
```

After deleting `40`:

```text id="6m2v9p"
10 -> 20 -> 30 -> null
```

---

## Core Logic

Because this is a singly linked list, we cannot move backward.

Therefore, we need to reach the **second-last node**.

```java id="7p3xmv"
Node curr = head;

while (curr.next.next != null) {
    curr = curr.next;
}
```

For:

```text id="q8n4ka"
10 -> 20 -> 30 -> 40 -> null
```

`curr` stops at:

```text id="z1m6rw"
30
```

because:

```text id="w3v7qx"
30 -> 40 -> null
```

Then:

```java id="t5k9pn"
curr.next = null;
```

removes the connection to `40`.

---

## Edge Cases

### Empty List

```text id="j6r2mx"
head == null
```

There is nothing to delete.

Return:

```java id="m8q4vz"
null;
```

### Single Node

```text id="k3p7xa"
10 -> null
```

After deleting the only node:

```text id="v9n2qw"
null
```

Therefore:

```java id="f4m8yc"
if (head == null || head.next == null) {
    return null;
}
```

---

## Algorithm

1. Check for an empty or single-node list.
2. Start `curr` at `head`.
3. Move `curr` until it reaches the second-last node.
4. Set `curr.next = null`.
5. Return `head`.

---

## Why `curr.next.next`?

We need `curr` to stop at the second-last node.

For:

```text id="b7x5mz"
10 -> 20 -> 30 -> 40 -> null
```

At node `30`:

```text id="d9k3qp"
curr.next       → 40
curr.next.next  → null
```

Therefore, the loop stops at `30`.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

The list must be traversed to reach the second-last node.

---

## Key Points

* Singly linked lists cannot move backward.
* We must find the second-last node.
* Set its `next` to `null`.
* `head` does not change for a list containing multiple nodes.
* Empty and single-node lists must be handled separately.
