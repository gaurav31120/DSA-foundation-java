# F030 — Shift Elements Left

## Problem

Given an integer array, shift all elements **one position to the left**.

The first element is removed, and the remaining elements move one position toward the beginning of the array.

For this problem, create a new array containing the shifted elements.

## Input

```text
Array: [10, 20, 30, 40, 50]
```

## Expected Output

```text
[20, 30, 40, 50]
```

## Requirements

* Shift every element one position to the left.
* The first element should be removed.
* Preserve the order of the remaining elements.
* Create a new array of size `n - 1`.
* Handle an empty array.
* Handle an array with one element.
* Do not use `ArrayList` or other collection classes.

## Examples

### Example 1

```text
Input:  [10, 20, 30, 40, 50]
Output: [20, 30, 40, 50]
```

### Example 2

```text
Input:  [10]
Output: []
```

### Example 3

```text
Input:  []
Output: []
```

## Method Signature

You may use:

```java
static int[] shiftLeft(int[] arr)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/030-Shift-Elements-Left/ShiftElementsLeft.java
```

First solve it yourself and send me your code for review.
