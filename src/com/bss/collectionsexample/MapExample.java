package com.bss.collectionsexample;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(3, "Fremomt");
		hm.put(2, "Union City");
		hm.put(5, "Palo Alto");
		hm.put(0, "Chicago");
		hm.put(32, "Fremomt1");
		hm.put(22, "Union City1");
		hm.put(51, "Palo Alto1");
		hm.put(10, "Chicago1");
		
		System.out.println(hm);
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(hm);
		System.out.println(treeMap);
		Iterator<Integer> tm = treeMap.keySet().iterator();
		
		while(tm.hasNext()){
			
		System.out.println(treeMap.get(tm.next()));	
	
		}
		
		Set<Entry<Integer,String>> es = treeMap.entrySet();
		Iterator<Entry<Integer,String>> it = es.iterator();
		Set<Entry<Integer, String>> a = hm.entrySet();
		while(it.hasNext()){
			
			Entry<Integer,String> e = it.next();
			System.out.println(e.getKey() +": "+ e.getValue());
			
		}
		
		
	}
	
}
