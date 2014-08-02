package com.bss.collectionsexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionSample {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Fremont");
		hs.add("San Jose");
		hs.add("Fremont");
		hs.add("Union City");
		hs.add("Palo Alto");
		hs.add("Fremont");
		hs.add("Santa Clara");
		
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs);
		
		TreeSet<String> tree = new TreeSet<String>();
		TreeSet<String> smarttree = new TreeSet<String>(hs);
		
		System.out.println("Smart Tree:" + smarttree);
		tree.add("Fremont");
		tree.add("San Jose");
		tree.add("Fremont");
		tree.add("Union City");
		tree.add("Palo Alto");
		tree.add("Fremont");
		tree.add("Santa Clara");
		
		System.out.println("Tree: " + tree);
		
		ArrayList<String> list = new ArrayList<String>(hs);
		
		list.add("Fremont");
		list.add("Union City");
		System.out.println("ArrayList:" + list);
		System.out.println(list.get(6));
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			
			System.out.println("hs has: " + it.next());
			
		}
		
	   Iterator<String> itList = list.iterator();
	 
	   
	   while(itList.hasNext()){
		   
		   System.out.println("List has:" + itList.next());
		   
	   }
	}

}
