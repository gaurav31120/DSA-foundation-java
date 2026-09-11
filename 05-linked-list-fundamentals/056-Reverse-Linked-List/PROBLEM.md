# F056 — Reverse Linked List

## Problem

Given a singly linked list, reverse the direction of all links so that the list is reversed.

You must reverse the **existing linked list** by changing the `next` references.

Do not create a separate linked list or use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

## Expected Result

```text
50 -> 40 -> 30 -> 20 -> 10 -> null
```

## Expected Output

```text
50 -> 40 -> 30 -> 20 -> 10
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the linked list:

   ```text
   10 -> 20 -> 30 -> 40 -> 50 -> null
   ```
3. Reverse the linked list by changing the existing `next` references.
4. Update `head` to point to the new first node.
5. Traverse and print the reversed list using `->`.
6. Do not create a separate linked list.
7. Do not use Java's built-in `LinkedList`.

## Important Concept

You need three references:

```java id="x7k2pm"
Node prev = null;
Node curr = head;
Node next;
```

During each iteration:

### 1. Save the next node

```java id="m3v8qa"
next = curr.next;
```

### 2. Reverse the current link

```java id="n6p2xr"
curr.next = prev;
```

### 3. Move `prev`

```java id="c9w4mk"
prev = curr;
```

### 4. Move `curr`

```java id="r5x7vz"
curr = next;
```

Continue until:

```java id="q2m8np"
curr == null
```

Finally, `prev` becomes the new head.

## Visual Example

Initial:

```text id="u7k3mx"
null    10 -> 20 -> 30 -> 40 -> 50 -> null
 ↑
prev
       ↑
      curr
```

After reversing all links:

```text id="w4p9qa"
50 -> 40 -> 30 -> 20 -> 10 -> null
```

Then:

```java id="f8m2vk"
head = prev;
```

## Edge Cases

Handle:

* Empty list
* Single-node list
* Normal multi-node list

For an empty list:

```text id="z6q1rx"
head = null
```

the reversed list is still:

```text id="t3m7wp"
null
```

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

Every node is visited once, and only a few pointer variables are used.

### Task Path

```text id="b5n8qx"
05-linked-list-fundamentals/056-Reverse-Linked-List/ReverseLinkedList.java
```
