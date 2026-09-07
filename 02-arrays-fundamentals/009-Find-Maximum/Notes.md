# F009 — Find Maximum Element

## Concept

Find the largest element in an integer array by traversing the array once.

## Approach

1. Assume the first element is the maximum.
2. Start traversing from index `1`.
3. Compare each element with `max`.
4. If the current element is greater, update `max`.
5. After traversal, `max` contains the largest element.

## Code Pattern

```java
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

## Important Point

Initialize `max` with `arr[0]` instead of `0`.

Using `0` would give an incorrect result for an array containing only negative numbers.

Example:

```text
[-10, -5, -20]
```

Correct answer: `-5`

## Complexity

* **Time:** `O(n)`
* **Space:** `O(1)`

## Edge Cases

* Single-element array
* All elements negative
* All elements equal
* Maximum element at the first position
* Maximum element at the last position

## Key Takeaway

For finding the maximum in an unsorted array, a single traversal is optimal:

**Initialize → Compare → Update**
