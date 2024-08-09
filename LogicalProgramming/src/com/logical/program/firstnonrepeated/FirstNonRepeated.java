package com.logical.program.firstnonrepeated;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String input="AABCDCBE";
		
		//without collection
		for(int i=0;i<input.length();i++) {
			boolean unique=true;
			for(int j=0;j<input.length();j++) {
				if(i!=j && input.charAt(i)==input.charAt(j)) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println(input.charAt(i));
				break;
			}
			
		}
		//with collection
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<input.length();i++) {
			if(!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), 1);
			}else {
				int cnt=map.get(input.charAt(i));
				map.put(input.charAt(i), cnt+1);
			}
		}
		System.out.println(map);
		for(Entry<Character,Integer> entrySet:map.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}

}
