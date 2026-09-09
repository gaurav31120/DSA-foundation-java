# F026 — Delete from Beginning

## Problem

Given an integer array, delete the element from the **beginning** of the array.

Since Java arrays have a fixed size, create a new array with one fewer position and copy all elements except the first element.

## Input

```text
Array: [10, 20, 30, 40]
```

## Expected Output

```text
[20, 30, 40]
```

## Requirements

* Delete the element at index `0`.
* Preserve the order of all remaining elements.
* Create a new array of size `n - 1`.
* Handle an array with only one element.
* Handle an empty array appropriately.
* Do not use `ArrayList` or other collection classes.

## Example

### Input

```text
arr = [10, 20, 30, 40]
```

### Output

```text
[20, 30, 40]
```

## Another Example

### Input

```text
arr = [10]
```

### Output

```text
[]
```

## Method Signature

You may use:

```java
static int[] deleteFromBeginning(int[] arr)
```

## Complexity Target

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/026-Delete-from-Beginning/DeleteFromBeginning.java
```

First solve it yourself and send me your code for review.
