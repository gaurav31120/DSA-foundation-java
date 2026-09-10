# F032 — Implement Dynamic Array

## Problem

Implement a simple **dynamic array** from scratch using a regular Java array.

The dynamic array should automatically increase its capacity when there is no free space available.

## Required Operations

Your dynamic array must support:

1. `add(int value)` — Add an element at the end.
2. `get(int index)` — Return the element at the specified index.
3. `size()` — Return the number of elements currently stored.
4. `capacity()` — Return the current capacity.

## Dynamic Resizing Rule

When the internal array becomes full:

* Create a new array with **double the current capacity**.
* Copy all existing elements into the new array.
* Replace the old internal array with the new one.

Example:

```text id="q8v6o2"
Initial capacity = 2

add(10)
add(20)

Array is full.

Next add:
capacity 2 → capacity 4
```

## Example

```text id="0gl5f8"
add(10)
add(20)
add(30)

size()     → 3
capacity() → 4

get(0) → 10
get(1) → 20
get(2) → 30
```

## Requirements

* Use a regular Java `int[]` internally.
* Do not use `ArrayList`.
* Maintain a separate `size` variable.
* Start with an initial capacity of `2`.
* Double the capacity whenever the array becomes full.
* `get(index)` should validate the index.
* Throw `IndexOutOfBoundsException` for an invalid index.
* Preserve all existing elements during resizing.

## Class Structure

You may create a class similar to:

```java id="vyd4y4"
class DynamicArray {
    private int[] data;
    private int size;

    // constructor
    // add()
    // get()
    // size()
    // capacity()
}
```

## Complexity Target

For `add()`:

```text
Average: O(1) amortized
Worst case: O(n) when resizing
```

For `get()`:

```text
Time: O(1)
```

## Your Task

Implement the solution in:

```text id="5u3z6n"
03-array-operations/032-Implement-Dynamic-Array/ImplementDynamicArray.java
```

Test at least these operations:

```text
add(10)
add(20)
add(30)
get(0)
get(1)
get(2)
size()
capacity()
```

First solve it yourself and send me your code for review.
