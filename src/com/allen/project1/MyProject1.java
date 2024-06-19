package com.allen.project1;

import java.util.ArrayList;
import java.util.List;

public class MyProject1 {
    // 1. create functions with String, Integer, and array-List<String> return types
    public static String getString() {
        return "Hello from getString()";
    }

    public static Integer getInteger() {
        return 42;
    }

    public static List<String> getStringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("String 1");
        stringList.add("String 2");
        return stringList;
    }

    // 2. create a function with void return type
    public static void printMessage() {
        System.out.println("This is a message from printMessage()");

        List<String> myList = new ArrayList<String>();
        myList.add("first element");
        System.out.println("Hello, World! " + myList.get(0));
    }

    public static void main(String[] args) {
        // Call and print the functions created
        System.out.println(getString());
        System.out.println(getInteger());
        System.out.println(getStringList());
        printMessage();

        // 4. instantiate Dog class and call a method from that class
        DogClass myDog = new DogClass("Buddy");
        myDog.bark();
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        try {
        	int[] result = twoSum(a,b,22);
            System.out.println(result[0]);
            System.out.println(result[1]);
        } catch(java.lang.NullPointerException err) {
        	System.out.println("target too big");
        } 
 
        //calling maxNum
        int[] c = {4,8,12,1,1,1};
        System.out.println(maxNum(c));
        
    }
    
    public static int[] twoSum(int[] num1, int[] num2, int target) {
    	if (target > maxNum(num1) + maxNum (num2)) {
    		return null;
    	}
    	for (int i = 0; i < num1.length; i++) {
    		for (int j = i+1; j < num2.length; j++)
    			if (num1 [i] + num2 [j] == target)
    				return new int[]{i, j};
    	}
    	return null;

    }
    public static int maxNum(int[] array1) {
    	int maxnum = -1;
    	for (int i=0; i < array1.length; i++) {
    		if (maxnum < array1[i]) {
    			maxnum = array1[i];
    		}
    			
    	}
    	return maxnum;
    	
    }
    
}

// June 17 assignment 2
// two-sum
// [1,2,3,4] [5,6,7,8] find two numbers that sum 11

