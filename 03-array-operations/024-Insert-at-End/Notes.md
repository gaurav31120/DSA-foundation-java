# F024 — Insert at End

## Approach

Java arrays have a fixed size, so a new array of size `n + 1` is required.

1. Create a new array with one extra position.
2. Copy all elements from the original array.
3. Store the new element at index `n`.
4. Return the new array.

## Example

```text
Original: [10, 20, 30, 40]
Element: 50

Result: [10, 20, 30, 40, 50]
```

## Key Idea

The last index of the new array is:

```text
n
```

Therefore:

```java
result[n] = element;
```

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Important Learning

Java arrays have fixed size. Inserting an element requires creating a larger array and copying the existing elements.
