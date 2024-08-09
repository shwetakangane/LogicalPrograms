package com.logical.program.eachoccurance;

import java.util.HashMap;
import java.util.Map;

public class EachOccurance {
	public static void main(String[] args) {
		String str="programming";
		Map<Character,Integer> map=new HashMap<>();
		char[] charArray = str.toCharArray();
		for(char c:charArray) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer integer = map.get(c);
				map.put(c, integer+1);
			}
		}
		System.out.println(map);
		 
	}

}
