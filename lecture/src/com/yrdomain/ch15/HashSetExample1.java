package com.yrdomain.ch15;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		//¿¹¿Ü³ª ¾Ë¸² ¾øÀ½?
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("ºñ¾î ÀÖÀ½");
		} else {
			//p
		}
	}

}
