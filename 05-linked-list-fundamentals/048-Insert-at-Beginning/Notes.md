# F048 — Insert at Beginning

## Concept

Inserting at the beginning of a singly linked list means creating a new node and making it the new `head`.

### Initial List

```text
10 -> 20 -> 30 -> 40 -> null
```

Insert `5` at the beginning.

### Result

```text
5 -> 10 -> 20 -> 30 -> 40 -> null
```

---

## Core Logic

```java
Node newNode = new Node(x);

newNode.next = head;
head = newNode;
```

### Step 1 — Create New Node

```text
newNode
   ↓
   5
```

### Step 2 — Connect New Node to Head

```text
5 -> 10 -> 20 -> 30 -> 40 -> null
     ↑
    head
```

### Step 3 — Update Head

```text
head
 ↓
5 -> 10 -> 20 -> 30 -> 40 -> null
```

---

## Implementation

```java
static Node insertAtBeginning(Node head, int x) {

    Node newNode = new Node(x);

    newNode.next = head;
    head = newNode;

    return head;
}
```

The new head is returned because the `head` reference changes.

---

## Why Is Insertion O(1)?

Only three operations are required:

1. Create the new node.
2. Connect it to the existing head.
3. Update the head.

No traversal is required.

Therefore:

* Time Complexity of insertion: **O(1)**
* Extra Space Complexity: **O(1)**

If the complete program also traverses the list to print it, total time becomes **O(n)**.

---

## Key Points

* The new node becomes the first node.
* Set `newNode.next = head` first.
* Then update `head`.
* Return the new head.
* Existing nodes are not moved.
* Insertion at the beginning is an **O(1)** operation.

---

## Example

```text
Before:
10 -> 20 -> 30 -> 40 -> null

Insert:
5

After:
5 -> 10 -> 20 -> 30 -> 40 -> null
```
