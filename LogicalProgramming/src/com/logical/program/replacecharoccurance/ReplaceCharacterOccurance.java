package com.logical.program.replacecharoccurance;

public class ReplaceCharacterOccurance {
	public static void main(String[] args) {
		String str="opentexttttttttttttt";
		char ch='t';
		int indexOf = str.indexOf(ch);
		if(indexOf==-1) {
			System.out.println("Character not occurred");
			System.exit(0);
		}
		
//		char[] charArray = str.toCharArray();
//		int cnt=1;
//		for(int i=0;i<charArray.length;i++) {
//			if(charArray[i]==ch) {
//				charArray[i]=String.valueOf(cnt).charAt(0);
//				cnt++;
//			}
//		}
//		System.out.println(charArray);
		int cnt=1;
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			if(charAt==ch) {
				str=str.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str);

	}

}
