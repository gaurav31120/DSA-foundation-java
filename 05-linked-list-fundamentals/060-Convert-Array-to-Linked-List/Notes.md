# F060 — Convert Array to Linked List

## Problem

Convert an integer array into a singly linked list while preserving the original order.

Example:

```text
Array:
10 20 30 40 50

Linked List:
10 -> 20 -> 30 -> 40 -> 50
```

---

## Approach — Head + Current Pointer

Start by creating a node from the first array element:

```java
Node head = new Node(arr[0]);
Node curr = head;
```

Then traverse the remaining array elements.

For every element:

```java
curr.next = new Node(arr[i]);
curr = curr.next;
```

This appends the new node to the end of the linked list.

---

## Example

Array:

```text
[10, 20, 30]
```

### First Element

```text
head
 ↓
10 -> null
```

### Second Element

```text
head
 ↓
10 -> 20 -> null
      ↑
     curr
```

### Third Element

```text
head
 ↓
10 -> 20 -> 30 -> null
           ↑
          curr
```

---

## Empty Array

An empty array must be handled before accessing `arr[0]`.

```java
if (arr.length == 0) {
    return null;
}
```

Otherwise, accessing:

```java
arr[0]
```

would cause an `ArrayIndexOutOfBoundsException`.

---

## Algorithm

1. Check whether the array is empty.
2. If empty, return `null`.
3. Create the first node and make it the `head`.
4. Use `curr` to track the last node.
5. Traverse the remaining array.
6. Create a new node for each element.
7. Connect it using `curr.next`.
8. Move `curr` forward.
9. Return `head`.

---

## Complexity

**Time Complexity:** O(n)

Every array element is processed once.

**Space Complexity:** O(n)

A new linked-list node is created for every array element.

---

## Interview Takeaway

The basic conversion pattern is:

```java
Node head = new Node(arr[0]);
Node curr = head;

for (int i = 1; i < arr.length; i++) {
    curr.next = new Node(arr[i]);
    curr = curr.next;
}

return head;
```

The key idea is:

```text
head → first node
curr → last node
```

For every new element:

```text
curr.next = new Node(value)
curr = curr.next
```

This pattern is useful whenever you need to build a linked list sequentially from another data structure.
