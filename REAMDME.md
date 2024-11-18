# SortableArray Project

## Features
This project provides functionality for sorting arrays of integers and strings in ascending order.

### **Sort Integers**
- Sorts an array of integers in ascending order.
- Method: `SortableArray.sortIntegers(int[] arr)`.
- Input: An array of integers.
- Output: The same array, sorted in ascending order.

### **Sort Strings**
- Sorts an array of strings alphabetically.
- Method: `SortableArray.sortStrings(String[] arr)`.
- Input: An array of strings.
- Output: The same array, sorted alphabetically.

---

## How to Use
1. Include the `SortableArray` class in your project.
2. Use the respective methods based on your sorting needs:
   - For integers:
     ```java
     int[] intArray = {5, 3, 8, 1, 2};
     SortableArray.sortIntegers(intArray);
     // Output: [1, 2, 3, 5, 8]
     ```
   - For strings:
     ```java
     String[] stringArray = {"banana", "apple", "grape", "orange"};
     SortableArray.sortStrings(stringArray);
     // Output: ["apple", "banana", "grape", "orange"]
     ```

---

## How to Test
JUnit tests are provided for each feature:
- Test file: `SortableArrayTest.java`
- Example tests:
  - `testSortIntegers` for sorting integers.
  - `testSortStrings` for sorting strings.

To run the tests:
1. Ensure you have JUnit 4 or 5 configured in your project.
2. Run the test file using your IDE or the terminal.

---

## Project Structure
