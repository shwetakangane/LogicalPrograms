package com.logical.program.logsubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		String str="java";
		int longestSubstringlength = 0;
		String longestSubstring = null;
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for (int i=0;i<charArray.length;i++) {
			char c = charArray[i];
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
			
		}
		System.out.println(map);
		longestSubstring=map.keySet().toString();
		if(map.size()>longestSubstringlength) {
			longestSubstringlength=map.size();
		}
		System.out.println("The longest substring :"+longestSubstring);
		
		System.out.println("The longest substring length :"+longestSubstringlength);
	}

}
