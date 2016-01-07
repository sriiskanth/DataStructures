package com.srikanth.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author srikanth
 *
 */
public class ExcelSheetColumn {

	public int ColumnToNumber(String str) {

		Map<Character, Integer> charmap = new HashMap<>();
		char ch = 'A';
		for (int i = 1; i <= 26; i++) {
			charmap.put(ch, i);
			System.out.println("Key	:	" + ch + "	Value	:	" + charmap.get(ch));
			ch += 1;
		}

		int sum=0;
		int decimal=str.length()-1;
		int k=0;
		while(decimal>=0){
			sum=(int) (sum+Math.pow(26, 0)*charmap.get(str.charAt(decimal)));
			k++;
			decimal--;
		}
		return sum;
	}
	
	
	public String NumberToColumn(int number) {
		System.out.println(3451%26 +" "+132/26);
		System.out.println(Character.valueOf((char) ('A'+3451/26)));
		
		return "AB";
		
	}

	public static void main(String[] args) {
		ExcelSheetColumn esColumn = new ExcelSheetColumn();
		//esColumn.ColumnToNumber("ABSDE");
		esColumn.NumberToColumn(345);
	}
}
