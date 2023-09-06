package com.programming;

public class StringAsimmutableclass {
public static void main(String[] args) {
	String str = new String("ABC");
	System.out.println("1 - value of str is" + str);
str.concat("XYZ");
System.out.println("2 - value of str is" + str);
str.replace("A","X");
System.out.println("3 - value of str is" + str);
str.concat("PQR");
System.out.println("4 - value of str is" + str);
StringBuffer sb = new StringBuffer("ABC");
System.out.println("5 - value of str is" + sb.toString());
sb.append("XYZ");
System.out.println("6 - value of str is" + sb.toString());
StringBuilder sb2 = new StringBuilder("MNO");
System.out.println("5 - value of str is" + sb2.toString());
sb2.append("XYZ");
System.out.println("6 - value of str is" + sb2.toString());
}
}