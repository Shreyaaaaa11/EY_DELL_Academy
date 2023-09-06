package com.programming;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedlistclassBook {

	public static void main(String[] args) {
	        LinkedList<Book> list = new LinkedList<>();


	        Book b1 = new Book(1,"A","B", "C",10);

	        Book b2 = new Book(12,"P","Q", "R",180);

	        Book b3 = new Book(32,"M","N", "O",190);
	        
	        list.add(b1);list.add(b2);list.add(b3);

	        // TODO Auto-generated method stub

	        Iterator<Book> itr = list.iterator();
	        while (itr.hasNext()) {
             Book b = itr.next();

	  System.out.println(b.bookid + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

	    }
	}
	}