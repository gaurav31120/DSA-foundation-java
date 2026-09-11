# F062 — Remove Nth Node

## 1. Problem Understanding

Given a singly linked list and an integer `n`, remove the **nth node from the end** of the linked list.

Example:

```text
10 -> 20 -> 30 -> 40 -> 50
n = 2
```

The 2nd node from the end is `40`.

Result:

```text
10 -> 20 -> 30 -> 50
```

---

## 2. Key Idea

Use two pointers:

* `fast`
* `slow`

Keep `fast` exactly **n nodes ahead of `slow`**.

When `fast` reaches the end, `slow` will be positioned **just before the node that needs to be deleted**.

Then skip that node:

```java
slow.next = slow.next.next;
```

---

## 3. Why Do We Need a Dummy Node?

Consider removing the first node:

```text
10 -> 20 -> 30 -> 40 -> 50
n = 5
```

The node to remove is `10`.

Without a dummy node, the head is a special case.

With a dummy node:

```text
dummy -> 10 -> 20 -> 30 -> 40 -> 50
```

Now the node before `10` is simply the dummy node.

So the same deletion operation works:

```java
slow.next = slow.next.next;
```

No separate head-removal logic is required.

---

## 4. Pointer Setup

```java
Node dummy = new Node(0);
dummy.next = head;

Node fast = dummy;
Node slow = dummy;
```

Initial structure:

```text
dummy -> 10 -> 20 -> 30 -> 40 -> 50
  ↑
fast
slow
```

---

## 5. Move Fast `n` Steps

For:

```text
n = 2
```

Move `fast` two times.

After moving:

```text
dummy -> 10 -> 20 -> 30 -> 40 -> 50
  ↑              ↑
 slow            fast
```

The gap between `slow` and `fast` is now `n` nodes.

---

## 6. Move Both Pointers

Now move both pointers together:

```java
while (fast.next != null) {
    fast = fast.next;
    slow = slow.next;
}
```

Eventually:

```text
dummy -> 10 -> 20 -> 30 -> 40 -> 50
                    ↑              ↑
                  slow            fast
```

`slow` is immediately before the node to delete.

Here:

```text
slow -> 30
slow.next -> 40
```

So `40` is the node we need to remove.

---

## 7. Delete the Node

Use:

```java
slow.next = slow.next.next;
```

Before:

```text
30 -> 40 -> 50
```

After:

```text
30 -> 50
```

Final list:

```text
10 -> 20 -> 30 -> 50
```

---

## 8. Why `return dummy.next`?

The dummy node is not part of the actual list.

So we return the real head:

```java
return dummy.next;
```

For normal deletion:

```text
dummy -> 10 -> 20 -> 30 -> 50
         ↑
       answer
```

For head deletion:

```text
dummy -> 20 -> 30 -> 40 -> 50
         ↑
       answer
```

This is why the dummy node makes the solution clean.

---

## 9. Complete Algorithm

```text
1. Create dummy node.
2. Point dummy.next to head.
3. Set fast = dummy.
4. Set slow = dummy.
5. Move fast n positions forward.
6. Move fast and slow together until fast.next == null.
7. Delete slow.next.
8. Return dummy.next.
```

---

## 10. Important Code Pattern

```java
Node dummy = new Node(0);
dummy.next = head;

Node fast = dummy;
Node slow = dummy;

for (int i = 0; i < n; i++) {
    fast = fast.next;
}

while (fast.next != null) {
    fast = fast.next;
    slow = slow.next;
}

slow.next = slow.next.next;

return dummy.next;
```

---

## 11. Edge Cases

### Remove tail

```text
10 -> 20 -> 30 -> 40 -> 50
n = 1
```

Result:

```text
10 -> 20 -> 30 -> 40
```

### Remove head

```text
10 -> 20 -> 30 -> 40 -> 50
n = 5
```

Result:

```text
20 -> 30 -> 40 -> 50
```

### Single node

```text
10
n = 1
```

Result:

```text
empty list
```

The dummy-node approach handles all of these without a separate head-removal condition.

---

## 12. Complexity

### Time Complexity — O(n)

The list is traversed using the two pointers.

Even though there are two pointer movements, each pointer moves through the list at most once.

Therefore:

```text
O(n)
```

### Space Complexity — O(1)

Only a few pointers are used:

```text
dummy
fast
slow
```

No extra array or linked list is created.

Therefore:

```text
O(1)
```

---

## 13. What I Learned from My First Attempt

My first approach used:

```text
length -> index -> traverse again -> delete
```

That approach can also achieve:

```text
Time: O(n)
Space: O(1)
```

So the problem was **not that the complexity was wrong**.

The important issue was that F062 is specifically designed to teach the **two-pointer technique**.

I also initially calculated the index before calculating the length, which caused an incorrect value.

The dummy-node approach is cleaner because it automatically handles:

* deleting the head
* deleting the tail
* deleting a middle node
* single-node list

without separate special-case logic.

---

## 14. Interview Pattern

### Pattern

**Two Pointers + Fixed Gap**

Whenever a problem says something like:

> Find/remove the kth/nth node from the end

think:

```text
Dummy Node
     +
Fast & Slow Pointers
     +
Maintain a fixed gap
```

The main idea to remember:

```text
Fast is n nodes ahead of Slow.
```

When `Fast` reaches the end:

```text
Slow is just before the answer.
```

Then:

```java
slow.next = slow.next.next;
```
