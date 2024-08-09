package com.logical.program.removeduplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str="programming";
		String[] strArr= {"programming","mnmnbhjn"};
		//using java 8
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		//using indexOf() method of String class
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			int indexOf = str.indexOf(ch, i+1);
			if(indexOf == -1) {
				sb2.append(ch);
			}	
		}
		System.out.println(sb2);
		
		//using character array
		StringBuilder sb3=new StringBuilder();
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i] == charArray[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(charArray[i]);
			}
		}
		System.out.println(sb3);
		
		//using set interface
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set) {
			sb4.append(ch);
		}
		System.out.println(sb);
		
		for (int i = 0; i < strArr.length; i++) {
			String var = strArr[i];
			for (int j = 0; j < var.length(); j++) {
				char charAt = var.charAt(j);
				int indexOf = var.indexOf(charAt, j + 1);
				if (indexOf == -1) {
					System.out.print(charAt);
				}

			}
			System.out.print(" ");
		}
	}
	
	
}
