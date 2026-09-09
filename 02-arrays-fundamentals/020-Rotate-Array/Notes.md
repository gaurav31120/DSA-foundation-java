# F020 — Rotate Array

## Concept

Right rotation by one position means the **last element moves to index 0**, while every other element moves one position to the right.

Example:

```text
Before: 1 2 3 4 5
After:  5 1 2 3 4
```

## Approach

First save the last element:

```java
int last = arr[arr.length - 1];
```

Then shift elements from **right to left**:

```java
for (int i = arr.length - 1; i > 0; i--) {
    arr[i] = arr[i - 1];
}
```

Finally, place the saved element at index `0`:

```java
arr[0] = last;
```

## Why Iterate Backwards?

If we shift from left to right, values would be overwritten.

For example:

```text
1 2 3 4 5
```

Correct movement:

```text
4 → 5
3 → 4
2 → 3
1 → 2
```

Therefore, we process from the last index toward the first.

## Edge Case

An empty array has no last element, so check it before accessing `arr[arr.length - 1]`.

```java
if (arr.length == 0) {
    return arr;
}
```

A single-element array remains unchanged.

## Complexity

**Time Complexity:** O(n)

Every element may need to be shifted once.

**Space Complexity:** O(1)

Only one temporary variable is used.

## Key Takeaway

For a right rotation by one:

1. Save the last element.
2. Shift elements right, starting from the end.
3. Put the saved element at index `0`.

The direction of traversal is the most important part.
