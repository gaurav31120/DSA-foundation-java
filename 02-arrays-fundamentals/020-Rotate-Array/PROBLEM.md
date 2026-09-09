# F020 — Rotate Array

## Problem

Given an integer array, **rotate the array to the right by one position**.

The last element should move to the first position, and every other element should shift one position to the right.

## Examples

### Example 1

```text
Input:  [1, 2, 3, 4, 5]

Output: [5, 1, 2, 3, 4]
```

### Example 2

```text
Input:  [10, 20, 30]

Output: [30, 10, 20]
```

### Example 3

```text
Input:  [7]

Output: [7]
```

## Requirements

1. Use Java.
2. Rotate the array **to the right by exactly one position**.
3. Modify the array in place if possible.
4. Do not use built-in array rotation methods.
5. Handle arrays containing duplicate values.
6. Handle an empty array safely.
7. Analyze the time and space complexity.

## Test Cases

```text
[1, 2, 3, 4, 5] → [5, 1, 2, 3, 4]

[10, 20, 30]    → [30, 10, 20]

[1, 1, 2, 2]     → [2, 1, 1, 2]

[7]              → [7]

[]               → []
```

## Expected Thinking

Before coding, think about:

* Which element needs to be saved first?
* Where should the last element go?
* In which direction should you shift the remaining elements?
* Can this be done without creating another array?

## Deliverable

Submit your `RotateArray.java` solution.

**Do not create the reference solution yet. I will review your code first.**
