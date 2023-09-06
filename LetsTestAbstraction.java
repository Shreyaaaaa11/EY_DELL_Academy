package com.programming;
abstract class shape{
	//unique functionality - define
	abstract void draw();//Declaration
	int length, area, breath, height,radius;
	double areaofCircle;
	//common functionality which every one can use
	void purpose() {
		System.out.println("Calculate the area of different shapes");
	}
}
class Traingle  extends shape {
//public class LetsTestAbstraction {

@Override
void draw() {
	// TODO Auto-generated method stub
	int breath =20, height =30;
	area = (breath*height)/2;
	System.out.println("Area of triangle is" + area);
}
}
class Rectangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int length =20, breath =30;
		area = (breath*length);
		System.out.println("area of rectangle is" + area);
	}
	}
class circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int lenghth =20, breath =30;
		areaofCircle = Math.PI*radius*radius;
		purpose();
		System.out.println("area of rectangle is" + area);
	}

public static void main(String[] args) {
//shape sh= new Shape();
	Traingle tr = new Traingle();
	tr.draw();
	Rectangle rect = new Rectangle();
	rect.draw();
	circle circ = new circle();
	circ.draw();
	}
}

