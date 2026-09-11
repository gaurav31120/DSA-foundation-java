# F055 — Find Length

## Concept

The length of a linked list is the total number of nodes present in the list.

Example:

```text id="2m8xqv"
10 -> 20 -> 30 -> 40 -> 50 -> null
```

The list contains **5 nodes**.

---

## Core Logic

Initialize a counter:

```java id="7q3mxa"
int count = 0;
```

Start from the head:

```java id="k5v8np"
Node curr = head;
```

Traverse the entire list:

```java id="c9r2wd"
while (curr != null) {
    count++;
    curr = curr.next;
}
```

Every time we visit a node, increment `count`.

---

## Example

For:

```text id="m4x7pz"
10 -> 20 -> 30 -> 40 -> 50 -> null
```

Traversal works like this:

```text id="v8n3qa"
10 → count = 1
20 → count = 2
30 → count = 3
40 → count = 4
50 → count = 5
null → stop
```

Final length:

```text id="r6k2xm"
5
```

---

## Empty List

If:

```text id="z4p8vc"
head == null
```

the loop does not execute.

Therefore:

```text id="n7m3qx"
count = 0
```

So the length of an empty linked list is `0`.

---

## Algorithm

1. Initialize `count = 0`.
2. Set `curr = head`.
3. While `curr` is not `null`:

   * Increment `count`.
   * Move `curr` to the next node.
4. Return `count`.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

Every node is visited exactly once, and only a counter and temporary pointer are used.

---

## Key Points

* Length means the total number of nodes.
* Start traversal from `head`.
* Increment the counter for every node.
* Stop when `curr == null`.
* An empty list has length `0`.
* No additional data structure is required.
