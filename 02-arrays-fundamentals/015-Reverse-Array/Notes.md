# F015 — Reverse an Array

## Concept

Reverse an array **in-place** using two pointers.

## Approach — Two Pointers

Use two pointers:

* `left` → first element
* `right` → last element

Swap the elements and move both pointers toward the center.

```java
int left = 0;
int right = arr.length - 1;
```

Continue while:

```java
left < right
```

## Key Idea

```text
[10, 20, 30, 40, 50]
 ↑              ↑
left           right

Swap → move inward
```

The process continues until the pointers meet or cross.

## Complexity

* **Time:** `O(n)`
* **Space:** `O(1)`

## Why O(1) Space?

The array is modified directly. Only a temporary variable is used for swapping.

## Common Mistake

Using another array for the reversed result increases auxiliary space to `O(n)`.

## Key Takeaway

When reversing an array **in-place**, think:

**Two pointers → Swap → Move inward**
