package com.programming;
class Machine 
{
	void start () {
		System.out.println("Machine has started!");
	}
void stop() {
	System.out.println("Machine has stopped!");
}
}
class camera extends Machine{
	void start() {
		System.out.println("Camera has started!");
	}
void snap() {
	System.out.println("Photo clicked");
}
}

public class TypeCastingConcepts {
public static void main(String[] args) {
	
	Machine m = new Machine();
	m.start();
	m.stop();
	
	camera c = new camera();
	c.start();
	c.stop();
	c.snap();
	
	Machine pc = new camera();
	pc.start();
	pc.stop();
	Machine m3 = new camera();
	camera c2 = (camera)m3;
	c2.start();
	c2.stop();
	c2.snap();
	}
}

