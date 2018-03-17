package com.listconcept;

import java.util.ArrayList;

public class AddAllArrayList {
	
	public static void main(String[] args) {
		
		ArrayList a0 = new ArrayList();  //creating a new nongeneric arraylist
		a0.add(1);
		a0.add(2);
		a0.add(3);
		
		for(int i = 0;i<a0.size();i++) {
			System.out.println(a0.get(i));
		}
		
		ArrayList a1 = new ArrayList();
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		System.out.println("2nd array");
		for(int j = 0;j<a1.size();j++) {
			System.out.println(a1.get(j));
		}
		
		a0.addAll(a1);
		
		for(int k = 0; k<a0.size();k++) {
			System.out.println(a0.get(k));
		}
		
		a0.removeAll(a1);
		a0.remove(1);
		System.out.println(a0.size());
		
		
	}

}
