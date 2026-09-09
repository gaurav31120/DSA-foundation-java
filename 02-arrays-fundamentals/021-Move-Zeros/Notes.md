# F021 — Move Zeros

## Concept

The goal is to move all zeros to the end of an array while keeping the **relative order of all non-zero elements** unchanged.

Example:

```text
Before: 0 1 0 3 12
After:  1 3 12 0 0
```

## Approach

Use a pointer `j` to represent the next position where a non-zero element should be placed.

Traverse the array using `i`.

Whenever a non-zero element is found:

```java
arr[j] = arr[i];
j++;
```

This moves all non-zero elements toward the beginning while preserving their order.

After the traversal, all positions from `j` to the end are filled with zero.

```java
while (j < arr.length) {
    arr[j] = 0;
    j++;
}
```

## Example

For:

```text
0 1 0 3 12
```

Non-zero elements are processed in order:

```text
1 → position 0
3 → position 1
12 → position 2
```

Then the remaining positions are filled:

```text
0 → position 3
0 → position 4
```

Final result:

```text
1 3 12 0 0
```

## Why Not Swap with the End?

Simply swapping every zero with the last element can change the relative order of non-zero elements.

The problem requires the original order to be preserved, so the **compaction approach** is safer.

## Complexity

**Time Complexity:** O(n)

The array is traversed to move non-zero elements and once more to fill zeros. Both operations are linear, so the overall complexity remains O(n).

**Space Complexity:** O(1)

Only the pointer `j` is used as extra space.

## Key Takeaway

When elements must be moved while preserving their relative order, a **write pointer** can be used to compact the desired elements toward the beginning.
