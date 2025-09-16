package or.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class PracticeSet {
	public static void main(String[] args) {
		//list 
		/*
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(40);
		li.add(null);
		li.add(20);
		li.add(null);
		
		System.out.println(li);
		/*
		 
		//Hash Set
		/*
     Set <Integer> s = new HashSet();
     
     s.add(100);
     s.add(100);
     s.add(200);
     s.add(null);
     s.add(300);
     s.add(500);
     s.add(500);
     s.add(null);
     
     s.addAll(li);
//     System.out.println(s);
//     s.retainAll(li);
     System.out.println(s );
     s.removeAll(li);
     System.out.println(s );
     */
		//TreeSet in tree do not null value 
		
		Set <Integer> s = new TreeSet<>();
		
		   
	     s.add(100);
	     s.add(700);
	     s.add(200);
	     
	     s.add(100);
	     s.add(100);
	     s.add(200);
	     s.add(null);
	     s.add(300);
	     s.add(500);
	     s.add(500);
	     s.add(null);
	     
	     s.add(300);
	     s.add(500);
	     s.add(1000);
	     s.add(8000);
	     s.add(20000);
	     System.out.println(s);
	   
	     
	}

}
