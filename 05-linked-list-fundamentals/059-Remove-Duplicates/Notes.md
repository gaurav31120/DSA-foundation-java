# F059 — Remove Duplicates

## Problem

Remove duplicate values from a singly linked list while keeping the **first occurrence** of every value.

Example:

```text
10 -> 20 -> 30 -> 20 -> 30 -> 40 -> 50
```

Result:

```text
10 -> 20 -> 30 -> 40 -> 50
```

---

## Approach — Current + Runner

Use two pointers:

```text
current
runner
```

### `current`

Represents the value whose duplicates we want to remove.

### `runner`

Scans all nodes after `current` and removes matching values.

---

## Algorithm

1. If the list is empty, return `null`.
2. Set `current = head`.
3. For each `current` node:

   * Set `runner = current`.
   * Check every node after `current`.
   * If `runner.next` contains the same value:

     ```java
     runner.next = runner.next.next;
     ```
   * Otherwise move `runner` forward.
4. Move `current` to the next node.
5. Return `head`.

---

## Important Deletion Pattern

Suppose:

```text
10 -> 20 -> 30 -> 20 -> 40
```

When `runner.next` is the duplicate `20`:

```text
runner
  ↓
30 -> 20 -> 40
      ↑
   duplicate
```

Perform:

```java
runner.next = runner.next.next;
```

Result:

```text
30 -> 40
```

The duplicate node is skipped.

---

## Important Rule

After deleting a duplicate, **do not move `runner` immediately**.

Why?

Because there could be consecutive duplicates:

```text
10 -> 20 -> 20 -> 20 -> 30
```

After removing the first duplicate:

```text
10 -> 20 -> 20 -> 30
```

`runner.next` is still another `20`, so it must be checked again.

---

## Example Walkthrough

Input:

```text
10 -> 20 -> 30 -> 20 -> 30 -> 40
```

### `current = 10`

Remove later `10` values.

Result:

```text
10 -> 20 -> 30 -> 20 -> 30 -> 40
```

### `current = 20`

Find later `20` and remove it:

```text
10 -> 20 -> 30 -> 30 -> 40
```

### `current = 30`

Find later `30` and remove it:

```text
10 -> 20 -> 30 -> 40
```

### `current = 40`

No duplicates.

Final:

```text
10 -> 20 -> 30 -> 40
```

---

## Edge Cases

### Empty List

```text
null
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

### No Duplicates

```text
10 -> 20 -> 30 -> null
```

Result remains unchanged.

### All Duplicates

```text
10 -> 10 -> 10 -> 10 -> null
```

Result:

```text
10 -> null
```

---

## Complexity

**Time Complexity:** O(n²)

For each node, the remaining part of the list may be scanned.

**Space Complexity:** O(1)

Only pointer variables are used.

---

## Interview Takeaway

For removing duplicates without extra space:

```text
current → choose a value
runner  → remove its duplicates
```

Core deletion:

```java
if (runner.next.data == current.data) {
    runner.next = runner.next.next;
} else {
    runner = runner.next;
}
```

The important detail is:

> **After deleting a node, don't advance the runner.**
