# F055 — Find Length

## Problem

Given a singly linked list, find and return the **number of nodes** present in the linked list.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

## Expected Result

The linked list contains:

```text
5
```

nodes.

## Expected Output

```text
5
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the linked list:

   ```text
   10 -> 20 -> 30 -> 40 -> 50
   ```
3. Traverse the list from `head`.
4. Count every node.
5. Return the total number of nodes.
6. Print the length.
7. Do not use Java's built-in `LinkedList`.

## Important Concept

Use a counter initialized to `0`:

```java
int count = 0;
```

Traverse the list:

```java
Node curr = head;

while (curr != null) {
    count++;
    curr = curr.next;
}
```

Finally:

```java
return count;
```

For:

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

the counter becomes:

```text
1 -> 2 -> 3 -> 4 -> 5
```

Therefore the length is `5`.

## Edge Case

For an empty list:

```text
head == null
```

the length should be:

```text
0
```

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

Every node must be visited once.

### Task Path

```text
05-linked-list-fundamentals/055-Find-Length/FindLength.java
```
