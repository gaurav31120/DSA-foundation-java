# F033 — Array-Based List

## Approach

An array-based list uses a regular Java array internally while maintaining a separate `size` variable.

The array stores the data, while `size` tracks the number of actual elements.

## Add

When the array is full, create a new array with double the capacity and copy the existing elements.

```java
if (size == data.length) {
    resize();
}
```

Then add the element at:

```java
data[size] = value;
size++;
```

## Get

Validate the index and return the element directly.

```java
return data[index];
```

This operation takes O(1) time.

## Set

Validate the index and replace the value:

```java
data[index] = value;
```

This operation takes O(1) time.

## Remove

To remove an element:

1. Save the element being removed.
2. Shift all following elements one position left.
3. Decrease `size`.
4. Return the removed element.

```java
for (int i = index; i < size - 1; i++) {
    data[i] = data[i + 1];
}

size--;
```

## Size vs Capacity

Example:

```text
data = [25, 30, 30, 0]
size = 2
capacity = 4
```

The logical list is:

```text
[25, 30]
```

The remaining array positions are unused capacity.

## Edge Cases

* Add when the array is full → resize.
* Remove the first element → shift all remaining elements.
* Remove the last element → no shifting is required.
* Invalid index → throw `IndexOutOfBoundsException`.
* Empty list → `isEmpty()` returns `true`.

## Complexity

* `add()` → O(1) amortized, O(n) when resizing.
* `get()` → O(1).
* `set()` → O(1).
* `remove()` → O(n).
* `size()` → O(1).
* `isEmpty()` → O(1).

## Important Learning

An array-based list combines a fixed-size array with dynamic resizing and a separate `size` variable to behave like a resizable list.
