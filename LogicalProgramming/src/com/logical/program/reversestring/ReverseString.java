package com.logical.program.reversestring;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Using toCharArray() method 
		//input:hello output:olleh
		String str="hello";
		//String[] strarr={"hello","world","shweta","sunil","kangane"};
		String strArr="hello,world,shweta,sunil,kangane";
		
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//using charAt(int index) method
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		//System.out.println();
		
		StringBuilder sbb=new StringBuilder(str);
		System.out.println(sbb.reverse());	
		
		String[] strarr = strArr.split(",");
		for(int a=0;a<strarr.length;a++) {
			char[] charArray2 = strarr[a].toCharArray();
			for(int c=charArray2.length-1;c>=0;c--) {
				System.out.print(charArray2[c]);
			}
			System.out.print(" ");
		}
		
	}
}
