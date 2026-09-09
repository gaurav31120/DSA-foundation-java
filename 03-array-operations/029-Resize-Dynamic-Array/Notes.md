# F029 — Resize Dynamic Array

## Approach

Java arrays have a fixed size, so resizing requires creating a new array.

1. Create a new array with the required capacity.
2. Find how many existing elements can fit.
3. Copy those elements into the new array.
4. Return the new array.

## Key Idea

```java
int elementsToCopy = Math.min(arr.length, capacity);
```

This ensures that we never try to copy more elements than either array can hold.

## Example — Increase Capacity

```text
Original: [10, 20, 30]
Capacity: 5

Result: [10, 20, 30, 0, 0]
```

The extra positions automatically contain `0` because Java initializes integer arrays with zero.

## Example — Decrease Capacity

```text
Original: [10, 20, 30, 40, 50]
Capacity: 3

Result: [10, 20, 30]
```

Only the elements that fit are copied.

## Edge Cases

* Capacity `0` → empty array.
* Capacity greater than length → extra positions contain `0`.
* Capacity smaller than length → extra elements are discarded.
* Capacity equal to length → array contents remain unchanged.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

A Java array cannot be resized directly. A new array must be created and the required elements must be copied into it.
