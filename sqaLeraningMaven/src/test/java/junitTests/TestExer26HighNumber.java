package junitTests;

public class TestExer26HighNumber {
	
	public static int highestNumber(int[] varArray){
		int varInt = 0;
		for (int varHigh : varArray){
			if (varInt < varHigh){
				varInt = varHigh;
			}
		}
		return varInt;
	}
}
