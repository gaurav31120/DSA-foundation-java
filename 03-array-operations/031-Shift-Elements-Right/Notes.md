# F031 — Shift Elements Right

## Approach

To shift all elements one position to the right:

1. Create a new array of the same size.
2. Put `0` at the first position.
3. Copy each original element to the next index.
4. The last element is dropped.

## Key Idea

If an element is at `arr[i]`, after shifting right it moves to:

```java
result[i + 1] = arr[i];
```

## Example

```text
Original: [10, 20, 30, 40, 50]

Result:   [0, 10, 20, 30, 40]
```

The original `50` is dropped because there is no position after the last index.

## Edge Cases

* Empty array → empty array.
* One element → `[0]`.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

A right shift moves each element one index forward. The first position is filled with `0`, and the last original element is discarded.
