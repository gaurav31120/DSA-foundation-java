# F054 — Search Linked List

## Problem

Given a singly linked list and a target value, search for the target value in the linked list.

Return `true` if the value exists in the list; otherwise, return `false`.

Do not use Java's built-in `LinkedList`.

## Initial Linked List

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

Search for:

```text
30
```

## Expected Result

```text
true
```

## Requirements

1. Create a `Node` class containing:

   * `int data`
   * `Node next`
2. Create the linked list:

   ```text
   10 -> 20 -> 30 -> 40 -> 50 -> null
   ```
3. Store the target value as `30`.
4. Traverse the linked list from `head`.
5. Compare each node's `data` with the target.
6. Return `true` immediately when the target is found.
7. Return `false` if the end of the list is reached without finding the target.
8. Print the search result.
9. Do not use Java's built-in `LinkedList`.

## Important Concept

Start from `head`:

```java
Node curr = head;
```

Check each node:

```java
while (curr != null) {
    if (curr.data == value) {
        return true;
    }

    curr = curr.next;
}
```

If the loop finishes, the value does not exist:

```java
return false;
```

## Example

Searching for `30`:

```text
10 -> 20 -> 30 -> 40 -> 50
               ↑
             found
```

Result:

```text
true
```

Searching for `100`:

```text
10 -> 20 -> 30 -> 40 -> 50 -> null
```

Result:

```text
false
```

## Edge Cases

Handle:

* Empty list
* Target at head
* Target in the middle
* Target at the end
* Target not present

## Complexity Target

For `n` nodes:

* Time Complexity: **O(n)**
* Extra Space Complexity: **O(1)**

In the worst case, every node may need to be checked.

### Task Path

```text
05-linked-list-fundamentals/054-Search-Linked-List/SearchLinkedList.java
```
