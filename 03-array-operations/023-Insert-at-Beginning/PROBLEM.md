# F023 — Insert at Beginning

## Problem

Given an integer array and a new element, insert the new element at the **beginning** of the array.

Since Java arrays have a fixed size, create a new array with one extra position and shift the existing elements one position to the right.

Return the new array after insertion.

## Input

```text
Array: [10, 20, 30, 40]
New element: 5
```

## Expected Output

```text
[5, 10, 20, 30, 40]
```

## Requirements

* Insert the new element at index `0`.
* Preserve the original order of all existing elements.
* Create a new array because Java arrays have fixed size.
* Handle an empty input array.
* Do not use `ArrayList` or other collection classes.

## Example

### Input

```text
arr = [10, 20, 30, 40]
value = 5
```

### Output

```text
[5, 10, 20, 30, 40]
```

## Another Example

### Input

```text
arr = []
value = 10
```

### Output

```text
[10]
```

## Method Signature

You may use:

```java
static int[] insertAtBeginning(int[] arr, int value)
```

## Complexity Target

Try to achieve:

```text
Time: O(n)
Space: O(n)
```

## Your Task

Implement the solution in:

```text
03-array-operations/023-Insert-at-Beginning/InsertAtBeginning.java
```

Do not look for the reference solution yet.

First try it yourself and send me your code.
