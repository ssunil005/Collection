package com.listconcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListHoldsDuplicateAndNull {
	public static void main(String[] args) {
			
	ArrayList a = new ArrayList();
	a.add(100);
	a.add(200);
	a.add(null);
	a.add(null);
	a.add(100);
	a.add(100);
	
	for(int i = 0; i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	ArrayList a1 = new ArrayList();
	try{
	a1.add(1,100);
	a1.add(300);
	a1.addAll(a);
	}
	catch (IndexOutOfBoundsException e) {
    System.out.println(e);
	}
	
	
	for(int j =  0; j<a1.size();j++) {
		System.out.println(a1.get(j));
	}
	
	ListIterator l = a1.listIterator();
	
	System.out.println("fwd");
	while(l.hasNext()) {
		System.out.println(l.next());
	}
	
	System.out.println("backward");
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}
		
	
	
	
	
	
	}
	

}
