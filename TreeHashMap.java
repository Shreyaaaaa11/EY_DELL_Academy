package com.programming;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TreeHashMap {

    public static void main(String[] args, Entry<Integer, Book> m) {

        // TODO Auto-generated method stub

         TreeMap<Integer,Book> tMap= new TreeMap<>();

            Book b1 = new Book(1,"A","B", "C",10);
            Book b2 = new Book(12,"P","Q", "R",100);
            Book b3 = new Book(32,"M","N", "O",1800);

            tMap.put(123,b3);
            tMap.put(135,b2);
            tMap.put(121,b1);
            for(Map.Entry<Integer, Book> M:tMap.entrySet());
            int key =m.getKey();
            Book b =m.getValue();

            System.out.println("key"+ key +"details are:");
            System.out.println(b.bookid + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

        }
    }