# F059 — Remove Duplicates

## Problem Statement

Given a singly linked list, remove all duplicate values from the linked list.

Each value should appear **only once** in the final linked list.

The **first occurrence** of each value should be kept, and all subsequent occurrences should be removed.

The linked list must be modified by changing the existing `next` references.

Do not create a new linked list.

---

## Example 1

### Input

```text
10 -> 20 -> 30 -> 20 -> 40 -> 10 -> null
```

### Output

```text
10 -> 20 -> 30 -> 40 -> null
```

The second `20` and second `10` are removed.

---

## Example 2

### Input

```text
5 -> 10 -> 5 -> 20 -> 10 -> 30 -> null
```

### Output

```text
5 -> 10 -> 20 -> 30 -> null
```

---

## Example 3 — No Duplicates

### Input

```text
10 -> 20 -> 30 -> 40 -> null
```

### Output

```text
10 -> 20 -> 30 -> 40 -> null
```

The list remains unchanged.

---

## Requirements

1. Create a `Node` class containing:
   - `int data`
   - `Node next`

2. Create the linked list manually.

3. Implement:

```java
static Node removeDuplicates(Node head)
```

4. Remove every duplicate value.

5. Keep the **first occurrence** of each value.

6. Modify the existing linked list by changing `next` references.

7. Do not create a separate linked list.

8. Do not use Java's built-in `LinkedList`.

9. Print the final linked list using arrow notation.

10. Handle:
    - Empty list
    - Single-node list
    - List containing duplicates
    - List containing no duplicates
    - All nodes containing the same value

---

## Important Clarification

The linked list is **not necessarily sorted**.

For example:

```text
10 -> 20 -> 30 -> 20 -> 40 -> 10 -> null
```

must become:

```text
10 -> 20 -> 30 -> 40 -> null
```

Duplicate values may appear at any position in the list.

---

## Edge Cases

### Empty List

**Input:**

```text
null
```

**Expected Result:**

```text
null
```

### Single Node

**Input:**

```text
10 -> null
```

**Expected Result:**

```text
10 -> null
```

### All Nodes Have the Same Value

**Input:**

```text
10 -> 10 -> 10 -> 10 -> null
```

**Expected Result:**

```text
10 -> null
```

### Duplicates at Different Positions

**Input:**

```text
10 -> 20 -> 30 -> 10 -> 40 -> 20 -> null
```

**Expected Result:**

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## Expected Program Output

For the input:

```text
10 -> 20 -> 30 -> 20 -> 40 -> 10
```

the program should print:

```text
10 -> 20 -> 30 -> 40
```

---

## Complexity Target

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

---

## Hint

Use two pointers:

```text
current
runner
```

For every `current` node:

1. Start `runner` from `current`.
2. Check the nodes after `current`.
3. If `runner.next.data` is equal to `current.data`, remove that duplicate node.
4. Otherwise, move `runner` forward.
5. Move `current` to the next node.

The deletion operation is similar to **F053 — Delete by Value**.

Do **not** use a `HashSet` because this problem targets **O(1) extra space**.