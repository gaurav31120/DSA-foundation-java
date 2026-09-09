# F017 — Second Largest Element

## Concept

The goal is to find the **second largest distinct element** without sorting the array.

Instead of sorting, maintain two values:

* `max` → largest element found so far
* `secondMax` → second largest distinct element found so far

## Approach

Traverse the array once.

### Case 1: Current element is greater than `max`

```java
if (arr[i] > max) {
    secondMax = max;
    max = arr[i];
}
```

The previous maximum becomes the second maximum.

### Case 2: Current element belongs between `max` and `secondMax`

```java
else if (arr[i] < max && arr[i] > secondMax) {
    secondMax = arr[i];
}
```

The `arr[i] < max` condition is important because the problem asks for a **distinct** second-largest value.

Therefore, a duplicate of the largest value is ignored.

## Example

```text
10 25 7 42 18
```

Progress:

```text
max = 10
secondMax = MIN_VALUE

max = 25
secondMax = 10

max = 42
secondMax = 25
```

Final answer:

```text
25
```

## Edge Cases

### Duplicate maximum

```text
10 20 20 30
```

Answer:

```text
20
```

The duplicate `20` does not become the second largest.

### No second distinct element

```text
5 5 5
```

There is no second largest distinct value.

### Negative numbers

```text
-10 -5 -20 -3
```

Answer:

```text
-5
```

Initializing with `Integer.MIN_VALUE` allows negative values to be processed correctly.

## Complexity

**Time Complexity:** O(n)

Only one traversal of the array is required.

**Space Complexity:** O(1)

Only a constant number of variables are used.

## Key Takeaway

For finding the second largest element efficiently:

```text
largest + second largest
```

can be maintained during a **single traversal**, giving O(n) time and O(1) extra space.

Always consider the **distinct-value requirement** and edge cases where a second value does not exist.
