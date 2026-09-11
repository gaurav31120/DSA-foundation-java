# F058 — Detect Cycle

## Problem

Determine whether a singly linked list contains a cycle.

A cycle exists when a node points back to an earlier node instead of eventually pointing to `null`.

Example:

```text
10 -> 20 -> 30 -> 40
          ↑         |
          |_________|
```

---

## Approach — Floyd's Cycle Detection

Use two pointers:

```text
slow → moves 1 node
fast → moves 2 nodes
```

Start both at `head`.

```java
Node slow = head;
Node fast = head;
```

Then:

```java
while (fast != null && fast.next != null) {

    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
        return true;
    }
}

return false;
```

---

## Why It Works

### No Cycle

```text
10 -> 20 -> 30 -> 40 -> null
```

`fast` eventually reaches `null`.

Therefore:

```text
false
```

### Cycle Exists

```text
10 -> 20 -> 30 -> 40 -> 50
          ↑              |
          └──────────────┘
```

Once both pointers enter the cycle, `fast` moves faster and eventually catches `slow`.

When:

```java
slow == fast
```

a cycle has been detected.

---

## Important Safety Condition

Always check:

```java
fast != null && fast.next != null
```

before executing:

```java
fast = fast.next.next;
```

Otherwise, a non-cyclic list can cause a `NullPointerException`.

---

## Example

For:

```text
10 -> 20 -> 30 -> 40 -> 50
              ↑         |
              └─────────┘
```

`fast` eventually catches `slow`.

Therefore:

```text
Cycle Detected: true
```

---

## Edge Cases

### Empty List

```text
head = null
```

Result:

```text
false
```

### Single Node Without Cycle

```text
10 -> null
```

Result:

```text
false
```

### Single Node With Cycle

```text
10
↑|
└┘
```

Result:

```text
true
```

---

## Complexity

**Time Complexity:** O(n)

The slow and fast pointers traverse the list using constant-speed movement.

**Space Complexity:** O(1)

Only two pointers are used.

---

## Interview Takeaway

Remember the classic pattern:

```text
slow → 1 step
fast → 2 steps
```

For cycle detection:

```java
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
        return true;
    }
}
```

This is called **Floyd's Cycle Detection Algorithm** or the **Tortoise and Hare Algorithm**.
