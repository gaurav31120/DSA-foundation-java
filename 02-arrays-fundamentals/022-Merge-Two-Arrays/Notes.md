# F022 — Merge Two Arrays

## Concept

Merging two arrays means creating a new array containing all elements from the first array followed by all elements from the second array.

Example:

```text
First:  1 2 3
Second: 4 5 6

Result: 1 2 3 4 5 6
```

Duplicates are preserved.

## Approach

First calculate the required result size:

```java id="m8cr6q"
int[] result = new int[first.length + second.length];
```

A pointer `k` keeps track of the next available position in the result array.

Copy the first array:

```java id="t7yr2m"
for (int i = 0; i < first.length; i++) {
    result[k++] = first[i];
}
```

Then copy the second array:

```java id="2r5w8n"
for (int j = 0; j < second.length; j++) {
    result[k++] = second[j];
}
```

## Why Use `k`?

`k` represents the position where the next element should be placed.

For:

```text id="x6x4yv"
first  = [1, 2, 3]
second = [4, 5]
```

the positions are:

```text id="6jce8g"
result[0] = 1
result[1] = 2
result[2] = 3
result[3] = 4
result[4] = 5
```

## Edge Cases

### First array empty

```text id="s5oj9g"
[] + [1, 2, 3]
```

Result:

```text id="q0u6la"
[1, 2, 3]
```

### Second array empty

```text id="1sgm3m"
[1, 2, 3] + []
```

Result:

```text id="x4q1z8"
[1, 2, 3]
```

### Duplicate values

Duplicates are not removed.

```text id="7w2g5j"
[1, 1] + [1, 2]
```

Result:

```text id="q6t4c1"
[1, 1, 1, 2]
```

## Complexity

**Time Complexity:** O(n + m)

Every element from both arrays is copied once.

**Space Complexity:** O(n + m)

A new array containing all elements is created.

## Key Takeaway

When combining two arrays into a new array:

1. Allocate `n + m` positions.
2. Copy the first array.
3. Copy the second array.
4. Use a separate pointer to track the result position.
