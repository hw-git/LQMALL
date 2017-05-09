package org.lanqiao.lqmall.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			Character character=new Character(str.charAt(i));
			if(map.get(character)==null){
				map.put(character, 1);
			}else{
				map.put(character, map.get(character)+1);
			}
		}
		System.out.println(map.toString());
	}

}
