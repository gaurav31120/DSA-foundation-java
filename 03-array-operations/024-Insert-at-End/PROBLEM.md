# F024 — Insert at End

## Problem

Given an integer array and a new element, insert the new element at the **end** of the array.

Since Java arrays have a fixed size, create a new array with one extra position and copy the existing elements into it.

Place the new element at the last index.

## Input

```text
Array: [10, 20, 30, 40]
New element: 50
```

## Expected Output

```text
[10, 20, 30, 40, 50]
```

## Requirements

* Insert the new element at the end of the array.
* Preserve the original order of all existing elements.
* Create a new array because Java arrays have fixed size.
* Handle an empty input array.
* Do not use `ArrayList` or other collection classes.

## Example

### Input

```text
arr = [10, 20, 30, 40]
value = 50
```

### Output

```text
[10, 20, 30, 40, 50]
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
static int[] insertAtEnd(int[] arr, int value)
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
03-array-operations/024-Insert-at-End/InsertAtEnd.java
```

First solve it yourself and send me your code for review.
