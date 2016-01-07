package com.srikanth.leetcode;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "Thiss is ca";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		int k = s.indexOf(" ");
		System.out.println("K	:	"+k);
		return k == -1 ? s : reverseWords(s.substring(k + 1)) + " " + s.substring(0, k);
	}

}
