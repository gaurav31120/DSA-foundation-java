# F028 — Delete from Index

## Problem

Given an integer array and an index, delete the element at that index.

Since Java arrays have a fixed size, create a new array with one fewer position and copy all elements except the element at the given index.

## Input

```text
Array: [10, 20, 30, 40, 50]
Index: 2
```

## Expected Output

```text
[10, 20, 40, 50]
```

## Requirements

* Delete the element at the specified index.
* Preserve the order of all remaining elements.
* Create a new array of size `n - 1`.
* Handle deletion from the beginning.
* Handle deletion from the end.
* Handle an array with one element.
* Handle an empty array appropriately.
* Assume the index is valid: `0 <= index < arr.length`.
* Do not use `ArrayList` or other collection classes.

## Examples

### Example 1

```text
Input:  [10, 20, 30, 40, 50]
Index:  2
Output: [10, 20, 40, 50]
```

### Example 2

```text
Input:  [10, 20, 30]
Index:  0
Output: [20, 30]
```

### Example 3

```text
Input:  [10, 20, 30]
Index:  2
Output: [10, 20]
```

## Method Signature

You may use:

```java
static int[] deleteAtIndex(int[] arr, int index)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/028-Delete-from-Index/DeleteFromIndex.java
```

First solve it yourself and send me your code for review.
