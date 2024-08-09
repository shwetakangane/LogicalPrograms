package com.logical.program.removewhitespaces;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str="  s h  w e t   a   ";
		
		//without using trim method
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println(replaceAll);
		//using trim method we can only remove first and last spaces of sentence
System.out.println(str.trim());
	}

}
