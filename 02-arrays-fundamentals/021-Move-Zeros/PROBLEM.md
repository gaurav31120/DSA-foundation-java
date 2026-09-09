# F021 — Move Zeros

## Problem

Given an integer array, move all `0`s to the **end of the array** while maintaining the **relative order of all non-zero elements**.

The operation should be performed **in-place** without creating another array.

## Examples

### Example 1

```text
Input:  [0, 1, 0, 3, 12]

Output: [1, 3, 12, 0, 0]
```

### Example 2

```text
Input:  [1, 2, 3]

Output: [1, 2, 3]
```

### Example 3

```text
Input:  [0, 0, 0]

Output: [0, 0, 0]
```

### Example 4

```text
Input:  [4, 0, 5, 0, 2]

Output: [4, 5, 2, 0, 0]
```

## Requirements

1. Use Java.
2. Move all zeros to the end.
3. Preserve the relative order of non-zero elements.
4. Modify the original array in-place.
5. Do not create another array.
6. Do not use built-in sorting.
7. Handle arrays containing no zeros or all zeros.
8. Analyze time and space complexity.

## Test Cases

```text
[0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]

[1, 2, 3]          → [1, 2, 3]

[0, 0, 0]          → [0, 0, 0]

[4, 0, 5, 0, 2]    → [4, 5, 2, 0, 0]

[0, 7]             → [7, 0]
```

## Expected Thinking

Think about how you can keep track of the **next position where a non-zero element should go**.

You will likely need:

* One variable representing a position/index.
* One traversal through the array.
* Swapping or repositioning non-zero elements.

Try to achieve:

```text
Time: O(n)
Space: O(1)
```

## Deliverable

Submit your `MoveZeros.java` solution.

**Do not create the reference solution yet. I will review your code first.**
