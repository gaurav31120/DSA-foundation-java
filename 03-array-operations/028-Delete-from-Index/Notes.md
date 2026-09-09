# F028 — Delete from Index

## Approach

To delete an element at a specific index:

1. Check whether the array is empty.
2. Create a new array of size `n - 1`.
3. Copy elements before the deletion index to the same positions.
4. Skip the element at the deletion index.
5. Copy the remaining elements one position to the left.
6. Return the new array.

## Example

```text id="p3z0l5"
Original: [10, 20, 30, 40, 50]
Index: 2

Delete 30

Result: [10, 20, 40, 50]
```

## Key Idea

Before the index:

```java id="w7w3l0"
result[i] = arr[i];
```

After the index:

```java id="g1br8m"
result[i] = arr[i + 1];
```

The element at `index` is skipped.

## Edge Cases

* Delete index `0` → removes the first element.
* Delete index `n - 1` → removes the last element.
* One-element array → returns an empty array.
* Empty array → returns an empty array.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Deleting from a fixed-size Java array requires creating a smaller array and shifting/copying the elements that should remain.
