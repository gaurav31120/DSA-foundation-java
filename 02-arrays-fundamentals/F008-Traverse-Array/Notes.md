# F008 — Traverse an Array

## Concept

Array traversal means visiting every element of an array, usually from the first index to the last index.

## Approach

Use a `for` loop starting from index `0` and continue while the index is less than `arr.length`.

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

## Key Points

* Array indexing starts from `0`.
* The last valid index is `arr.length - 1`.
* `arr.length` gives the number of elements.
* The loop condition should be `i < arr.length`.

## Complexity

* Time: `O(n)`
* Auxiliary Space: `O(1)`

## Common Mistake

Using:

```java
i <= arr.length
```

would cause an `ArrayIndexOutOfBoundsException`.

## Remember

To traverse an array:

**Start at `0` → go while `i < arr.length` → access `arr[i]`.**
