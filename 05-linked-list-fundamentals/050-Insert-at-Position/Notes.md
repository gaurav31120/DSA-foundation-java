# F050 — Insert at Position

## Concept

Insertion at a position means adding a new node at a specific index without losing the existing links.

This problem uses **0-based indexing**.

```text
Position 0 → beginning
Position 1 → after the first node
Position 2 → after the second node
```

---

## Example

Initial list:

```text id="q3o8yn"
10 -> 20 -> 30 -> 40 -> null
```

Insert `25` at position `2`.

Result:

```text id="f4r7mt"
10 -> 20 -> 25 -> 30 -> 40 -> null
```

---

## Position 0

Position `0` is a special case because the new node becomes the head.

```java id="7n0vqm"
newNode.next = head;
head = newNode;
```

Example:

```text id="w7j3px"
Before:
10 -> 20 -> 30 -> 40

Insert 5 at position 0

After:
5 -> 10 -> 20 -> 30 -> 40
```

---

## Other Positions

For position `2`, we need to reach the node at position `1`.

```text id="8d0k2w"
10 -> 20 -> 30 -> 40
     ↑
    curr
```

Then connect the new node:

```java id="g5n1xz"
newNode.next = curr.next;
curr.next = newNode;
```

Result:

```text id="7j3r9k"
10 -> 20 -> 25 -> 30 -> 40
```

---

## Why `newNode.next = curr.next` First?

Suppose:

```text id="k3w8qa"
curr -> 20 -> 30
```

If we directly do:

```java id="n7v4cs"
curr.next = newNode;
```

without saving the old connection, the link to `30` can be lost.

Instead:

```java id="q6p2rm"
newNode.next = curr.next;
curr.next = newNode;
```

This preserves the remaining list.

---

## Algorithm

1. Create the new node.
2. If position is `0`, connect it to the current head and update head.
3. Otherwise, traverse to the node before the target position.
4. Connect the new node to the next node.
5. Connect the previous node to the new node.
6. Return the head.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

In the worst case, we may traverse the list to reach the required position.

---

## Key Points

* Position `0` requires changing `head`.
* For other positions, stop at the previous node.
* Always preserve the existing `next` link.
* `newNode.next = curr.next` comes before `curr.next = newNode`.
* The list remains connected after insertion.
