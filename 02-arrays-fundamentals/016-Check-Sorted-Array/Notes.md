# F016 — Check if Array is Sorted

## Concept

An array is sorted in **non-decreasing order** if every element is less than or equal to the next element.

For example:

```text
10 20 20 30 40
```

is sorted because:

```text
10 <= 20
20 <= 20
20 <= 30
30 <= 40
```

## Approach

Compare every element with the element immediately after it.

```java
if (arr[i] > arr[i + 1]) {
    return false;
}
```

If any element is greater than the next element, the array is not sorted.

If no such pair is found, the array is sorted.

## Why `>` Instead of `>=`?

We use:

```java
arr[i] > arr[i + 1]
```

because equal adjacent elements are allowed.

Example:

```text
10 20 20 30
```

is still sorted.

## Complexity

**Time Complexity:** O(n)

In the worst case, every adjacent pair is checked.

**Space Complexity:** O(1)

Only a constant amount of extra space is used.

## Key Takeaway

For checking whether an array is sorted, compare **adjacent elements** from left to right.

The moment:

```text
arr[i] > arr[i + 1]
```

is found, return `false`.
