# F027 — Delete from End

## Approach

To delete the last element from a Java array:

1. Check whether the array is empty.
2. Create a new array of size `n - 1`.
3. Copy elements from the original array except the last element.
4. Return the new array.

## Example

```text
Original: [10, 20, 30, 40]

Delete last element

Result: [10, 20, 30]
```

## Key Idea

The last element is excluded by looping only until `n - 1`:

```java
for (int i = 0; i < n - 1; i++) {
    result[i] = arr[i];
}
```

## Edge Cases

* Empty array → return an empty array.
* One element → return an empty array.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Because Java arrays have fixed size, deletion requires creating a smaller array and copying the elements that should remain.
