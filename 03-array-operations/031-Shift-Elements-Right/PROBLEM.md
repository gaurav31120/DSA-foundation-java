# F031 — Shift Elements Right

## Problem

Given an integer array, shift all elements **one position to the right**.

The last element is dropped, and the first position of the resulting array is filled with `0`.

For this problem, perform the shift **in a new array of the same size**.

## Input

```text
Array: [10, 20, 30, 40, 50]
```

## Expected Output

```text
[0, 10, 20, 30, 40]
```

## Requirements

* Create a new array with the **same size** as the original array.
* Shift every element one position to the right.
* The first position must contain `0`.
* The last element of the original array is dropped.
* Preserve the order of all shifted elements.
* Handle an empty array.
* Do not use `ArrayList` or other collection classes.

## Examples

### Example 1

```text
Input:  [10, 20, 30, 40, 50]
Output: [0, 10, 20, 30, 40]
```

### Example 2

```text
Input:  [10, 20, 30]
Output: [0, 10, 20]
```

### Example 3

```text
Input:  [10]
Output: [0]
```

### Example 4

```text
Input:  []
Output: []
```

## Method Signature

You may use:

```java
static int[] shiftRight(int[] arr)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/031-Shift-Elements-Right/ShiftElementsRight.java
```

First solve it yourself and send me your code for review.
