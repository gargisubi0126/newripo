package com.bridgelab.practice;

import java.util.HashMap;
import java.util.Map;

public class Arrayy {
	
	
//	 public static void findIndexesForSum(int[] nums, int tSum) {
//	        for (int i = 0; i < nums.length; i++) {
//	            for (int j = i + 1; j < nums.length; j++) {
//	                if (nums[i] + nums[j] == tSum) {
//	                    System.out.println("Indexes found: " + i + ", " + j);
//	                    return; 
//	                }
//	            }
//	        }
//	        System.out.println("No indexes found for the given sum.");
//	    }
//
//	    public static void main(String[] args) {
//	        int[] numbers = {2, 4, 1, 6, 5, 3};
//	        int t = 7;
//	        findIndexesForSum(numbers, t);
//	    }
	
	  public static int[] findIndexes(int[] nums, int target) {
	        // Create a HashMap to store the complement of each number and its index
	        Map<Integer, Integer> complementMap = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            
	            // Check if the complement exists in the map
	            if (complementMap.containsKey(complement)) {
	                // Return the indexes of the two numbers
	                return new int[]{complementMap.get(complement), i};
	            }

	            // Add the current number and its index to the map
	            complementMap.put(nums[i], i);
	        }

	        // Return an empty array if no two numbers sum up to the target
	        return new int[0];
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 4, 3, 5, 6};
	        int target = 7;

	        int[] indexes = findIndexes(nums, target);

	        if (indexes.length == 0) {
	            System.out.println("No two numbers sum up to the target.");
	        } else {
	            System.out.println("Indexes of the numbers: " + indexes[0] + ", " + indexes[1]);
	        }
	    }

}
