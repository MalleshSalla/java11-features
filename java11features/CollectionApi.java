package com.java11features;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionApi {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		Integer[] arr = list.stream().toArray(size -> new Integer[size]);
		System.out.println(Arrays.toString(arr));//array converted into string array
	
		Integer[] arr2=  list.toArray(Integer[] :: new ); // java  11 feature
		System.out.println(Arrays.toString(arr2));
	}

}
