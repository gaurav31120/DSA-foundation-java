# F023 — Insert at Beginning

## Approach

Java arrays have a fixed size, so we cannot directly increase the size of the original array.

Create a new array of size `n + 1`.

1. Place the new element at index `0`.
2. Traverse the original array.
3. Copy each element to the next index in the new array.
4. Return the new array.

## Example

```text
Original: [10, 20, 30, 40]
Target: 5

Result: [5, 10, 20, 30, 40]
```

## Key Idea

When inserting at the beginning:

```text
result[0] = target
result[i + 1] = arr[i]
```

Every existing element moves one position to the right.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Arrays have fixed size in Java. When an insertion requires additional capacity, a new array must be created.
