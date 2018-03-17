package com.listconcept;

import java.util.ArrayList;

public class ArrayListModify {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("1");
		a.add("Deccan");
		a.add("Plateau");
		a.set(0,"Green");
		a.add(0,"Barren");
		a.remove(0);
		
	    for(int i = 0; i < a.size(); i++) {
	    	System.out.println(a.get(i));
		}
	}

}
