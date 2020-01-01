package com.sugar.leetcode.impl;

import com.sugar.leetcode.Question;

public class Q7_Reverse_Integer implements Question{

	@Override
	public void run() {
		int x = -2147483412;
		int y = reverse(x);
		System.out.println("result:" + x + " original:" + y);
	}
	

    public int reverse(int x) {
    	boolean isNegative = x < 0;
    	//計算時にOverflowが発生してしまうのでlongにCast
    	long tempX = isNegative ? x * -1 : x; 
    	int length = ("" + tempX).length();
    	long retVal = 0;
    	//最初に連続する0は無視するようにする
    	boolean isFirstNonZero = false;
    	for(int i = 0 ; i < length; i++) {
    		long tempLen = (int) Math.pow(10, i);
    		// 数字を１つずつ取り出す
    		int tempVal = (int) ((((tempX / tempLen) * tempLen) - ((tempX / (tempLen * 10)) * (tempLen * 10))) / tempLen);
    		if(tempVal != 0 || isFirstNonZero) {
    			retVal = (long) (retVal + (tempVal * Math.pow(10, length - i - 1)));
    			isFirstNonZero = true;
    		}
    	}
    	if(retVal < Integer.MIN_VALUE || retVal > Integer.MAX_VALUE) {
    		return 0;
    	}
    	retVal = isNegative ? retVal * -1 : retVal;
    	return (int) retVal;
    }
}
