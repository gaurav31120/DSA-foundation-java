## Linear Search

### Core Idea

Check each array element from left to right until the target is found.

### Approach

* Start from index `0`.
* Compare each element with the target.
* Return the index immediately when a match is found.
* Return `-1` if the target is not present.

### Complexity

* **Time:** `O(n)`
* **Space:** `O(1)`

### Key Takeaway

Linear search works on **unsorted or sorted arrays** and does not require any preprocessing.

For the first occurrence, return immediately when the target is found.
