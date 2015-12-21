package com.srikanth.InterviewQuestions;


/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*/

public class AddDigits {
	public int addDigits(int num) {
        
		if(num/10==0){
			return num;
        }
		return addDigits(addDigits(num%10)+addDigits(num/10));
	}

	public static void main(String[] args) {
		AddDigits addDigits=new AddDigits();
		
		int num=addDigits.addDigits(383337);
		System.out.println("Result :	"+num);
		

	}

}
