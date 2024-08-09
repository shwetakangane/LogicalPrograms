package com.logical.program.remocespecialchars;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str = "@#$%^&*Shweta#$%^&*(";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
		}

}
