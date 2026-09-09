# F019 — Count Even and Odd Elements

## Concept

Every integer is either **even** or **odd**.

An integer is even when its remainder after division by `2` is `0`.

```java
arr[i] % 2 == 0
```

Otherwise, it is odd.

## Approach

Maintain two counters:

```text id="6w8p1d"
even = 0
odd = 0
```

Traverse the array once.

If the current element is even, increment `even`.

Otherwise, increment `odd`.

## Example

For:

```text id="3h6k2r"
10 25 7 42 18
```

Classification:

```text id="a4x9cw"
10 → Even
25 → Odd
7  → Odd
42 → Even
18 → Even
```

Result:

```text id="q6y8kt"
Even count: 3
Odd count: 2
```

## Important Edge Case

Zero is an **even number**:

```text id="w0y4mx"
0 % 2 == 0
```

Negative numbers also work correctly with the modulo operation:

```text id="2g8v1s"
-4 % 2 == 0
-5 % 2 != 0
```

## Complexity

**Time Complexity:** O(n)

Every element is checked once.

**Space Complexity:** O(1)

Only two counters are used.

## Key Takeaway

Use the modulo operator `%` to determine whether an integer is even or odd:

```java
number % 2 == 0
```

This gives a simple O(n) solution with constant extra space.
