# F027 — Delete from End

## Problem

Given an integer array, delete the element from the **end** of the array.

Since Java arrays have a fixed size, create a new array with one fewer position and copy all elements except the last element.

## Input

```text
Array: [10, 20, 30, 40]
```

## Expected Output

```text
[10, 20, 30]
```

## Requirements

* Delete the last element of the array.
* Preserve the order of all remaining elements.
* Create a new array of size `n - 1`.
* Handle an array with only one element.
* Handle an empty array appropriately.
* Do not use `ArrayList` or other collection classes.

## Examples

### Example 1

```text
Input:  [10, 20, 30, 40]
Output: [10, 20, 30]
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
static int[] deleteFromEnd(int[] arr)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/027-Delete-from-End/DeleteFromEnd.java
```

First solve it yourself and send me your code for review.
