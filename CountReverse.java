package com.core.java;

import java.util.HashMap;


public class CountReverse {

	private static HashMap<String,Integer> tempMap=new HashMap<String, Integer>();
	private static void count(String name){
		for(int i=1;i<=name.length();i++){
			if(tempMap.get(name.substring(i-1, i)) != null){
				tempMap.put((name.substring(i-1, i)),tempMap.get(name.substring(i-1, i))+1);
			}
			else
				tempMap.put((name.substring(i-1, i)),1);
		}
	for (int i = name.length(); i >= 0; i--) {
		System.out.println(name.substring(i-1, i) + " = " + tempMap.get(name.substring(i-1, i)));
	}
	
	}
	
	public static void main(String[] args){
<<<<<<< HEAD
		count("Master");
=======
		count("JavaBasics");
>>>>>>> 7aea7298da16d3fb9e78cc6797d942ffaf812045
	}
}
