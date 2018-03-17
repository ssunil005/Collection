package com.listconcept;

import java.util.ArrayList;

public class ArrayListConcept0 {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		for(int i = 0 ; i < 5; i++) {
			a.add(i);
		}
		System.out.println(a.contains(2));
		
		System.out.println("Size of the arraylist is : " + a.size());
		
		for(int j = 0; j<a.size(); j++) {
			System.out.println(a.get(j));
		}
	}

}
