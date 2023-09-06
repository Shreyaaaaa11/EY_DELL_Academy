package com.programming;

public class ArrayCreation
{
int[] intArr = new int[6];
//initilization
intArr[0] = 10;
intArr[5] = 60;
intArr[2] = 20;
intArr[4] = 45;
intArr[3] = 15;
intArr[1] = 18;

//Declaration, instantiated and initialization
  String[] strArr = {"z","A","X","B","D"};
//traverese
for(int i=0;i<=Arr.length-1; i++) {
	System.out.print(intArr[i] + " ");
}
System.out.println();
for(int i=0;i<=intArr.length; i++) {
	System.out.print(intArr[i] + " ");
}
System.out.println();
for(int i : intArr) {
	System.out.print(i + " ");
}
}
