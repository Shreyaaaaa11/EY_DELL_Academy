package com.programming;

import java.util.HashSet;
import java.util.Iterator;

public class HashClass { 

    public static void main(String[] args) {
    	
        HashSet<String> hSet = new HashSet<>();

        hSet.add("Z");hSet.add("Z");hSet.add("Z");hSet.add("Z");
        hSet.add(null);hSet.add(null);hSet.add(null);
        
        hSet.add("X");hSet.add("A");hSet.add("Y");hSet.add("B");
        Iterator<String> itr = hSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next()+ " ");

        }
    }
}