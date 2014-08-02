package com.bss.collectionsexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Practice {
	
	private static final int NULL = 0;

	public static void main(String[] args){
		
		int[] a = {-12,-11,12,10,12,4,3,10,8,3,100,49,50,30,10};
		
		test2(a,-8);
	}
	
	
  public static void test(ArrayList<Integer> a, int b ){
	  
	  int temp = 0;
	  int num;
	  
	  Iterator<Integer> ab = a.iterator();
	  
	  while(ab.hasNext()){
		  
		 num = (Integer) ab.next();
		 
		 if(num < b && num > temp)
		 { temp = num;}
		  
	  }
	  
	 System.out.println(temp);
	  
	  
  }	
  
  public static void test2(int[] a, int b){
	  
	 int temp = 0;
	 int num = 0;
	 
	 System.out.println(num);
	 
	  for(int i = 0; i < a.length; i++){
		  
		  if(a[i] < b){
			  temp = a[i];
			  
			  System.out.println(temp);
			  
		if(temp > num){
		   num = temp;
			  }
		  }
		  
		  
           
		  }
		  
		  
	  
	  
	  System.out.println(num);  
		 
		  
		 
  }

}
