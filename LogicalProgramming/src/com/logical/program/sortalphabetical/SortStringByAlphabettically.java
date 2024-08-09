package com.logical.program.sortalphabetical;

import java.util.Arrays;

public class SortStringByAlphabettically {
	public static void main(String[] args) {
		//without using sort() method
		String str="dcba";
		char[] charArray = str.toCharArray();
		char temp;
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]>charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(charArray);
		
		//using sort() method
		Arrays.sort(charArray);
		System.out.println(charArray);
	}

}
