# F025 — Insert at Index

## Problem

Given an integer array, an index, and a new element, insert the element at the specified index.

Since Java arrays have a fixed size, create a new array with one extra position and shift the required elements to the right.

## Input

```text
Array: [10, 20, 30, 40]
Index: 2
Element: 25
```

## Expected Output

```text
[10, 20, 25, 30, 40]
```

## Requirements

* Insert the element at the given index.
* Preserve the order of the existing elements.
* Shift elements from the insertion index one position to the right.
* Create a new array of size `n + 1`.
* Handle insertion at index `0`.
* Handle insertion at index `n` (end).
* Assume the index is valid: `0 <= index <= arr.length`.
* Do not use `ArrayList` or other collection classes.

## Example

### Input

```text
arr = [10, 20, 30, 40]
index = 2
element = 25
```

### Output

```text
[10, 20, 25, 30, 40]
```

## Method Signature

You may use:

```java
static int[] insertAtIndex(int[] arr, int index, int element)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/025-Insert-at-Index/InsertAtIndex.java
```

Try it yourself first and send me your code for review.
