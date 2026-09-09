# F025 — Insert at Index

## Approach

To insert an element at a specific index in a fixed-size Java array:

1. Create a new array of size `n + 1`.
2. Copy elements before the insertion index to the same positions.
3. Place the new element at the specified index.
4. Copy the remaining elements one position to the right.

## Example

```text
Original: [10, 20, 30, 40]
Index: 2
Element: 25

Result: [10, 20, 25, 30, 40]
```

## Key Idea

Elements before the index stay at the same position.

Elements from the index onward move one position right.

```text
result[i] = arr[i]          // before index
result[index] = element
result[i + 1] = arr[i]      // from index onward
```

## Edge Cases

* Index `0` → insertion at beginning.
* Index `arr.length` → insertion at end.
* Empty array with index `0` → array containing only the new element.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Insertion into a Java array requires a new array because the original array has fixed size.
