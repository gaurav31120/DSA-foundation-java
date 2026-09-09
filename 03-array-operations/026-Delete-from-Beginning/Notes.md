# F026 — Delete from Beginning

## Approach

Java arrays have a fixed size, so deleting an element requires creating a new smaller array.

To delete the first element:

1. Check whether the array is empty.
2. Create a new array of size `n - 1`.
3. Copy elements starting from index `1` into the new array.
4. Return the new array.

## Example

```text
Original: [10, 20, 30, 40]

Delete first element

Result: [20, 30, 40]
```

## Key Idea

The original element at index `i + 1` becomes the element at index `i` in the result.

```java
result[i] = arr[i + 1];
```

## Edge Cases

* Empty array → return an empty array.
* One element → return an empty array.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Java arrays have fixed size. To delete an element, create a new array with one fewer position and copy the required elements.
