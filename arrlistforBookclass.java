package com.programming;
import java.util.ArrayList;
import java.util.Iterator;
public class arrlistforBookclass {

    public static void main(String[] args) {

        ArrayList<Book> arrlist = new ArrayList<>();
        Book b1 = new Book(1,"A","B", "C",10);

        Book b2 = new Book(12,"P","Q", "R",100);

        Book b3 = new Book(32,"M","N", "O",1800);

        arrlist.add(b1);arrlist.add(b1);arrlist.add(b1);

        arrlist.add(b3);arrlist.add(b2);arrlist.add(b1);

        //arrlist.add(b1);arrlist.add(b1);arrlist.add(b1);

   for(Book b: arrlist) {

       System.out.println(b.bookid+" "+ b.name+ " " + " "+ b.publisher+ " "+ b.author+ " "+ b.quantity);
   }

   Iterator<Book> itr =arrlist.iterator();

   while(itr.hasNext()) {

       Book b=itr.next();

       System.out.println(b.bookid+" "+ b.name+ " " + " "+ b.publisher+ " "+ b.author+ " "+ b.quantity);

   }

    }
}

