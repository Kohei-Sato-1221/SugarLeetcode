package com.sugar.leetcode.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.sugar.leetcode.*;

public class Q1_TwoSum implements Question{

	@Override
	public void run() {
		int[] nums = {2, 4, 7, 8, 11, 15, 19};
		int target = 21;
		
		int[] retVal = twoSum(nums, target);
		
		System.out.println("RETURN: [" + retVal[0] + "," + retVal[1] + "]");
	}
	
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i = 0; i < nums.length; i++) {
    		map.put(nums[i], i);
    	}
    	
        for(int i = 0; i < nums.length; i++) {
        	int x = nums[i];
        	int y = target - x;
        	
        	if(map.containsKey(y) && map.get(y) != i) { // 2番目の条件は同じ数字を省くため
        		int[] retVal = {i , map.get(y)};
        		return retVal;
        	}

        }
        return null;
    }

}
