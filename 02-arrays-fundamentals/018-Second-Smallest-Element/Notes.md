# F018 — Second Smallest Element

## Concept

The goal is to find the **second smallest distinct element** without sorting the array.

Maintain two values while traversing:

* `min` → smallest element found so far
* `secondMin` → second smallest distinct element found so far

## Approach

### Case 1: Current element is smaller than `min`

```java
if (arr[i] < min) {
    secondMin = min;
    min = arr[i];
}
```

The previous smallest becomes the second smallest.

### Case 2: Current element belongs between `min` and `secondMin`

```java
else if (arr[i] > min && arr[i] < secondMin) {
    secondMin = arr[i];
}
```

The `arr[i] > min` condition ensures that a duplicate of the smallest value is ignored.

## Example

For:

```text id="7qj9oe"
10 25 7 42 18
```

The values evolve as:

```text id="p8n0xy"
min = 10
secondMin = 25

min = 7
secondMin = 10
```

Final answer:

```text id="3q3t7e"
10
```

## Duplicate Values

For:

```text id="x9y8mz"
10 20 10 30
```

the answer is:

```text id="zv7v6u"
20
```

The second `10` is ignored because:

```java
arr[i] > min
```

is false.

## Edge Cases

### No second distinct value

```text id="x7h5pz"
5 5 5
```

There is no second smallest distinct element.

### Negative numbers

```text id="c0f5ae"
-10 -5 -20 -3
```

The second smallest is:

```text id="y2z7qk"
-10
```

## Complexity

**Time Complexity:** O(n)

The array is traversed only once.

**Space Complexity:** O(1)

Only a constant number of variables are used.

## Key Takeaway

The second-smallest problem is the mirror image of finding the second-largest element:

```text id="0d5w2q"
smallest + second smallest
```

can be maintained in one traversal without sorting.
