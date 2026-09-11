# F054 — Search Linked List

## Concept

Searching a linked list means checking each node until the target value is found or the end of the list is reached.

Example:

```text id="x7k2mq"
10 -> 20 -> 30 -> 40 -> 50 -> null
```

Search for `30`.

Result:

```text id="j5v8rp"
true
```

---

## Core Logic

Start from the head:

```java id="p8n4yx"
Node curr = head;
```

Check every node:

```java id="z3m7qa"
while (curr != null) {

    if (curr.data == target) {
        return true;
    }

    curr = curr.next;
}
```

If the loop finishes, the target was not found:

```java id="k6w2vc"
return false;
```

---

## Example — Target Found

List:

```text id="h9q3mt"
10 -> 20 -> 30 -> 40 -> 50
```

Target:

```text id="c4x8nv"
30
```

Traversal:

```text id="r2m7pz"
10 → not found
20 → not found
30 → found
```

The method immediately returns:

```text id="g8v1kx"
true
```

---

## Example — Target Not Found

List:

```text id="n5q2wc"
10 -> 20 -> 30 -> 40 -> 50
```

Target:

```text id="v7m4za"
100
```

Every node is checked.

The pointer eventually becomes:

```text id="a3k9rp"
curr == null
```

Therefore:

```text id="b6x1mq"
false
```

is returned.

---

## Edge Cases

### Empty List

```text id="q8p3vn"
head == null
```

The loop does not execute, so the method returns `false`.

### Target at Head

The first node matches, so return `true` immediately.

### Target at End

All preceding nodes are checked before returning `true`.

### Target Not Present

The entire list is traversed and `false` is returned.

---

## Algorithm

1. Set `curr = head`.
2. Check whether `curr.data` equals the target.
3. If yes, return `true`.
4. Otherwise move to `curr.next`.
5. Continue until `curr == null`.
6. Return `false` if the target was not found.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

In the worst case, every node must be checked.

---

## Key Points

* Linked-list search is a linear search.
* Start from `head`.
* Move using `curr = curr.next`.
* Return immediately when the target is found.
* If `curr` becomes `null`, the target is not present.
* No extra data structure is required.
    