# F022 — Merge Two Arrays

## Problem

Given two integer arrays, merge them into a **single array** containing all elements from both arrays.

The elements from the first array should appear first, followed by the elements from the second array.

## Examples

### Example 1

```text
Input:
arr1 = [1, 2, 3]
arr2 = [4, 5, 6]

Output:
[1, 2, 3, 4, 5, 6]
```

### Example 2

```text
Input:
arr1 = [10, 20]
arr2 = [30, 40, 50]

Output:
[10, 20, 30, 40, 50]
```

### Example 3

```text
Input:
arr1 = []
arr2 = [1, 2, 3]

Output:
[1, 2, 3]
```

### Example 4

```text
Input:
arr1 = [5, 5]
arr2 = [5, 10]

Output:
[5, 5, 5, 10]
```

## Requirements

1. Use Java.
2. Create a new array containing all elements of both input arrays.
3. Preserve the order of elements.
4. Do not sort the arrays.
5. Handle arrays of different lengths.
6. Handle empty arrays.
7. Do not remove duplicates.
8. Analyze the time and space complexity.

## Expected Thinking

If:

```text
arr1.length = 3
arr2.length = 4
```

what should the length of the result array be?

Think about how you can copy:

```text
arr1 → beginning of result
arr2 → remaining positions of result
```

You can solve this using basic loops and array indexing.

## Test Cases

```text
[1, 2, 3] + [4, 5, 6]       → [1, 2, 3, 4, 5, 6]

[10, 20] + [30, 40, 50]     → [10, 20, 30, 40, 50]

[] + [1, 2, 3]              → [1, 2, 3]

[1, 2, 3] + []              → [1, 2, 3]

[5, 5] + [5, 10]            → [5, 5, 5, 10]
```

## Deliverable

Submit your `MergeTwoArrays.java` solution.

**Do not create the reference solution yet. I will review your code first.**
