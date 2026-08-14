# Product of Array Except Self

## LeetCode Problem

**Problem Number:** 238 - Product of Array Except Self

## Problem Description

Given an integer array `nums`, return an array where each element contains the product of all elements in the original array except the element at the same index.

The solution should be calculated without using division.

## Example

### Input

```text
[1, 2, 3, 4]
```

### Output

```text
[24, 12, 8, 6]
```

## Explanation

For each position:

* Index 0 → `2 × 3 × 4 = 24`
* Index 1 → `1 × 3 × 4 = 12`
* Index 2 → `1 × 2 × 4 = 8`
* Index 3 → `1 × 2 × 3 = 6`

## Approach

The program uses two passes.

### Step 1: Prefix Product

Store the product of all elements before the current index.

### Step 2: Suffix Product

Traverse the array from right to left and multiply each prefix product by the product of elements after the current index.

This avoids using division.

## Concepts Used

* Arrays
* Prefix Product
* Suffix Product
* Two-pass technique

## Time Complexity

`O(n)`

## Space Complexity

`O(1)` extra space, excluding the output array.

## Language

Java

## File Name

`ProductArrayExceptSelf.java`

## Author

**M. Pallavi**
