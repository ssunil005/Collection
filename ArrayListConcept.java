package com.listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args) {
		
		System.out.println("Normal arraylist");
		ArrayList a = new ArrayList();
		a.add(6);
		a.add("sunil");
		a.add(80);
		a.add(1,"ment");
		a.add(1,"mental");
		
		
		System.out.println(a.contains(6));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.get(1));
		
		
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("arraylist of inetger wrapper class");

		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(8);
		ai.add(10);
		ai.add(10);
		
		ArrayList<Integer> ai1 = new ArrayList<Integer>();
		ai1.add(6);
		ai1.add(200);
		
		ai.addAll(ai1);
		
		System.out.println(ai.size());
		for (Integer i: ai) {
			System.out.println(i);
			
		}
//		for(int j = 0; j<ai.size(); j++) {
//			System.out.println(ai.get(j));
//		}
		Employee e1 = new Employee("sunil",28,"QA");
		Employee e2 = new Employee("rahul", 28,"Bank");
		Employee e3 = new Employee("Sourav",30,"Police");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		
			
			}
		
	}

