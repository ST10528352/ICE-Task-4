package com.mycompany.ice.task_4;

public class ICETask_4 {

public class MultipleCatchBlocks {
 
    public static void main(String[] args) {
 
        // 1. Integer array containing at least three values
        int[] numbers = {10, 20, 30};
 
        System.out.println("=== ICE Task 4: Multiple Catch Blocks ===\n");
 
        // 2. First try block: intentionally access an invalid array index
        try {
            System.out.println("Attempting to access index 5 of the array...");
            int value = numbers[5]; // array only has indexes 0 to 2
            System.out.println("Value: " + value); // never reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. The array only has "
                    + numbers.length + " elements (indexes 0 to " + (numbers.length - 1) + ").");
            System.out.println("Details: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: An arithmetic problem occurred.");
            System.out.println("Details: " + e.getMessage());
        }
    }
  }
}