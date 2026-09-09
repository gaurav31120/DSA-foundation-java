# F017 — Find Second Largest Element

## Problem

Given an integer array, find the **second largest distinct element** in the array.

You must solve the problem **without sorting the array**.

## Examples

### Example 1

```text
Input:  [10, 25, 7, 42, 18]

Output: 25
```

The largest element is `42`, so the second largest distinct element is `25`.

### Example 2

```text
Input:  [10, 20, 20, 30, 40]

Output: 30
```

Duplicate values should not be counted twice.

### Example 3

```text
Input:  [5, 5, 5, 5]

Output: No second largest element
```

There is no second **distinct** value.

## Requirements

1. Use Java.
2. Find the second largest **distinct** element.
3. Do not sort the array.
4. Handle duplicate values correctly.
5. Handle the case where a second largest element does not exist.
6. Analyze the time and space complexity.

## Expected Approach

Try to solve this in **one traversal of the array**.

Think carefully about:

* How to track the largest element.
* How to track the second largest element.
* What should happen when you encounter a duplicate of the largest element.
* What should happen when the array contains fewer than two distinct values.

## Test Cases

```text
[10, 25, 7, 42, 18]       → 25
[10, 20, 20, 30, 40]      → 30
[5, 5, 5, 5]              → No second largest element
[10, 5]                   → 5
[10]                      → No second largest element
[-10, -5, -20, -3]        → -5
```

## Deliverable

Submit your `SecondLargestElement.java` solution.

Do **not** create the reference solution yet. I will review your code first.
