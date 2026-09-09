# F018 — Find Second Smallest Element

## Problem

Given an integer array, find the **second smallest distinct element** in the array.

You must solve the problem **without sorting the array**.

## Examples

### Example 1

```text
Input:  [10, 25, 7, 42, 18]

Output: 10
```

The smallest element is `7`, so the second smallest distinct element is `10`.

### Example 2

```text
Input:  [10, 20, 10, 30, 40]

Output: 20
```

Duplicate values should not be counted twice.

### Example 3

```text
Input:  [5, 5, 5, 5]

Output: No second smallest element
```

There is no second distinct value.

## Requirements

1. Use Java.
2. Find the second smallest **distinct** element.
3. Do not sort the array.
4. Handle duplicate values correctly.
5. Handle negative numbers.
6. Handle cases where a second distinct element does not exist.
7. Analyze the time and space complexity.

## Expected Approach

Try to solve this using **one traversal** of the array.

Think about maintaining:

```text
smallest
secondSmallest
```

For each element, decide:

* When should `smallest` change?
* When should `secondSmallest` change?
* How will you ignore duplicates?
* How will you handle negative numbers?

## Test Cases

```text
[10, 25, 7, 42, 18]       → 10
[10, 20, 10, 30, 40]      → 20
[5, 5, 5, 5]              → No second smallest element
[10, 5]                   → 10
[10]                      → No second smallest element
[-10, -5, -20, -3]        → -10
[20, 10, 10, 5]            → 10
```

## Deliverable

Submit your `SecondSmallestElement.java` solution.

**Do not create the reference solution yet.** I will review your code first.
