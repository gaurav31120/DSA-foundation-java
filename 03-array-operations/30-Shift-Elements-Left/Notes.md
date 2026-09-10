# F030 — Shift Elements Left

## Approach

Shift all elements one position toward the left by creating a new array of size `n - 1`.

1. Handle the empty array.
2. Create a new array with one fewer element.
3. Start from the second element of the original array.
4. Copy each element into the previous position in the result.
5. Return the result.

## Key Idea

```java id="r7v2q8"
result[i] = arr[i + 1];
```

The element at index `i + 1` moves to index `i`.

## Example

```text id="5zj1kq"
Original: [10, 20, 30, 40, 50]

Result:   [20, 30, 40, 50]
```

## Edge Cases

* Empty array → empty array.
* One element → empty array.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Left shifting removes the first element and moves every remaining element one position toward index `0`.
