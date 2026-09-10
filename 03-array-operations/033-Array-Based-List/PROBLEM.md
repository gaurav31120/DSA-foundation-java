# F033 — Array-Based List

## Problem

Implement a simple **list data structure using a Java array**.

The list should store integer elements and support basic list operations.

Unlike a normal fixed-size array, the list should automatically resize when it becomes full.

## Required Operations

Your `ArrayBasedList` must support:

1. `add(int value)` — Add an element at the end.
2. `get(int index)` — Return the element at the specified index.
3. `set(int index, int value)` — Replace the element at the specified index.
4. `remove(int index)` — Remove the element at the specified index.
5. `size()` — Return the number of elements.
6. `isEmpty()` — Check whether the list contains no elements.

## Dynamic Resizing

* Start with an initial capacity of `2`.
* When the internal array becomes full, double its capacity.
* When adding an element, place it at index `size`.
* When removing an element, shift all elements after it one position to the left.

Example:

```text id="7d8u1k"
Initial:
[10, 20]
size = 2

add(30)

Resize:
[10, 20, 30, 0]
size = 3
```

## Example

```text id="g0gk4v"
add(10)
add(20)
add(30)

get(1) → 20

set(1, 25)

get(1) → 25

remove(0)

List → [25, 30]

size() → 2
isEmpty() → false
```

## Requirements

* Use a regular Java `int[]` internally.
* Do not use `ArrayList`.
* Maintain a separate `size` variable.
* Start with capacity `2`.
* Automatically double capacity when full.
* Preserve element order.
* `get()`, `set()`, and `remove()` must validate the index.
* Throw `IndexOutOfBoundsException` for an invalid index.
* `isEmpty()` should return `true` when `size == 0`.

## Method Signatures

You may use:

```java id="9r0r7w"
void add(int value)

int get(int index)

void set(int index, int value)

int remove(int index)

int size()

boolean isEmpty()
```

## Complexity Target

* `add()` → O(1) amortized
* `get()` → O(1)
* `set()` → O(1)
* `remove()` → O(n)
* `isEmpty()` → O(1)

## Your Task

Implement the solution in:

```text id="z5w7xq"
03-array-operations/033-Array-Based-List/ArrayBasedList.java
```

Test at least:

```text id="k9x4a2"
add(10)
add(20)
add(30)
get(1)
set(1, 25)
remove(0)
size()
isEmpty()
```

First solve it yourself and send me your code for review.
