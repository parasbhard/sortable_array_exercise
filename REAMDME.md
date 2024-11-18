# SortableArray Project

## Overview
The SortableArray project provides functionality for sorting arrays of integers and strings in ascending order. It includes simple, reusable methods for each feature and is accompanied by test cases to ensure accuracy.

---

## Features

### **1. Sort Integers**
- **Description**: Sorts an array of integers in ascending order.
- **Method**: `SortableArray.sortIntegers(int[] arr)`
- **Usage**:
  ```java
  int[] intArray = {5, 3, 8, 1, 2};
  SortableArray.sortIntegers(intArray);
  // Output: [1, 2, 3, 5, 8]
  ```

### **2. Sort Strings**
- **Description**: Sorts an array of strings alphabetically.
- **Method**: `SortableArray.sortStrings(String[] arr)`
- **Usage**:
  ```java
  String[] stringArray = {"banana", "apple", "grape", "orange"};
  SortableArray.sortStrings(stringArray);
  // Output: ["apple", "banana", "grape", "orange"]

  ## How to Test
JUnit tests are included for both features:
- Test file: `SortableArrayTest.java`
- Example tests:
  - **Test Integer Sorting**:
    Verifies that integers are sorted in ascending order.
  - **Test String Sorting**:
    Verifies that strings are sorted alphabetically.

### **Run Tests**
1. Ensure JUnit is installed or configured in your IDE/project.
2. Run the test file (`SortableArrayTest.java`) using your IDE or terminal.
