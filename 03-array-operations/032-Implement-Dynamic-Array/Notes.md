# F032 — Implement Dynamic Array

## Approach

A dynamic array uses a regular Java array internally but automatically increases its capacity when the array becomes full.

The implementation maintains two important values:

* `data` → internal array
* `size` → number of actual elements

The capacity is:

```java
data.length
```

## Add Operation

When adding an element:

1. Check whether the array is full.
2. If full, create a new array with double the capacity.
3. Copy existing elements.
4. Store the new element at index `size`.
5. Increase `size`.

## Resizing

Initial capacity:

```text
2
```

After adding the third element:

```text
2 → 4
```

Example:

```text
Before resize:
[10, 20]
size = 2
capacity = 2

After resize:
[10, 20, 0, 0]
size = 2
capacity = 4
```

Then `30` is added.

## Size vs Capacity

These are different:

```text
size     = number of actual elements
capacity = total available positions
```

Example:

```text
data = [10, 20, 30, 0]
size = 3
capacity = 4
```

## Get Operation

`get(index)` should only allow:

```text
0 <= index < size
```

An invalid index throws `IndexOutOfBoundsException`.

## Complexity

### Add

* Amortized Time: O(1)
* Worst-case Time: O(n) when resizing

### Get

* Time Complexity: O(1)

### Space

* Space Complexity: O(n)

## Important Learning

A dynamic array is built on top of a fixed-size array. When the internal array becomes full, a larger array is created and the existing elements are copied into it.
