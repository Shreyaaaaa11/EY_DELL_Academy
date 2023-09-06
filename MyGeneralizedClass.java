package com.programinig.class6;

 class MyGeneralizedClass<T> {
   T obj;
void add(T obj) {
	this.obj = obj;
}
T get () {
	return obj;
}
 public class useofgenrics {
	 public static void main(String[] args) {
		 
		 MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		 intType.add(21);
		 intType.add(31);
		 System.out.println(intType.get());
		 
		 MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
		 boolType.add(true);
		 
		 System.out.println(boolType.get());
		 }
	 
}
 }
