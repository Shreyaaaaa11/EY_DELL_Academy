package com.programming;

public class MemberInnerClassNonStatic {
private int data = 10;
	class ABC{
	void show()
	{
		System.out.println("The Value of Data is" + data);
	}
	}
	public static void main(String[] args) {
		MemberInnerClassNonStatic obj = new MemberInnerClassNonStatic ();
		MemberInnerClassNonStatic.ABC obj2 = obj.new ABC();
		obj2.show();
}
}
