package com.programming;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class HashsetwithCustomBookClass {
	
public static void main(String[] args) {

        TreeSet<Book> treeSet = new TreeSet<>();
        Book b1 = new Book(1,"A","B", "C",10);
        Book b2 = new Book(12,"P","Q", "R",100);
        Book b3 = new Book(32,"M","N", "O",1800);
        
        treeSet.add(b3);treeSet.add(b2);treeSet.add(b1);
        // TODO Auto-generated method stub

        Iterator<Book> itr = treeSet.iterator();

        while (itr.hasNext()) {
        	Book b = itr.next();
        	System.out.println(b.bookid + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
        }
    }
}

 