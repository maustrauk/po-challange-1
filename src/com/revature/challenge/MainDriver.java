package com.revature.challenge;

public class MainDriver {

	public static void main(String[] args) {
		int[] testHeteromecic = {0, 2, 7, 110, 136, 156};
		int[] testHappy = {203, 11, 107};
		for(int num : testHeteromecic) System.out.println("Number " + num + " is heteromecic: " + isHeteromecic(num));
		for(int num : testHappy) System.out.println("Number " + num + " is happy: " + happy(num));
	}
	
	public static boolean isHeteromecic(int num) {
		  int n = 0;
		  while(true) {
			  int number = n * (n + 1);
			  if (number ==  num) return true;
			  if (number > num) return false;
			  n++;
		  }
	  }
	 
	public static boolean happy(int num) {
		int temp = num;
		while(true) {
			String tString = String.valueOf(temp);
			int result = 0;
			for(char ch : tString.toCharArray()) {
				int n =  Character.getNumericValue(ch);
				result += n * n;
			}
			if (result == 1) return true;
			if (result == 4) return false;
			temp = result;
		}
	}

}

