# F047 — Traverse Linked List

## Concept

Traversal means visiting every node of a linked list from the first node to the last node.

A temporary pointer is used so that the original `head` reference remains unchanged.

---

## Basic Traversal

```java
Node curr = head;

while (curr != null) {
    System.out.println(curr.data);
    curr = curr.next;
}
```

The pointer moves through the list using:

```java
curr = curr.next;
```

Traversal stops when `curr` becomes `null`.

---

## Example

Given:

```text
head
 ↓
10 → 20 → 30 → 40 → null
```

The traversal visits:

```text
10
20
30
40
```

---

## Why Use `curr`?

We should not move `head` directly:

```java
head = head.next;
```

because `head` is the reference to the beginning of the list.

Instead:

```java
Node curr = head;
```

allows us to traverse without losing the original `head`.

---

## Traversal Steps

For:

```text
10 → 20 → 30 → 40 → null
```

### Step 1

```text
curr → 10
```

Print `10`.

### Step 2

```text
curr → 20
```

Print `20`.

### Step 3

```text
curr → 30
```

Print `30`.

### Step 4

```text
curr → 40
```

Print `40`.

### Step 5

```text
curr → null
```

Stop.

---

## Key Points

* Start from `head`.
* Use a temporary pointer such as `curr`.
* Process the current node.
* Move using `curr = curr.next`.
* Stop when `curr == null`.
* Keep `head` unchanged.

---

## Complexity

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

Only one temporary pointer is used for traversal.
