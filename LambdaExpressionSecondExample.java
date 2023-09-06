package com.programinig.class6;
@FunctionalInterface
interface isFunctional {
	void show(String data);
}
public class LambdaExpressionSecondExample {
 
	public static void main(String[] args) {
		isFunctional obj = new isFunctional() {
	
			public void show(String data) {
				System.out.println("Using Annonymous Inner" + data);
			}
		};
		obj.show("Class way of implementation");
		isFunctional obj2 = (demoData)  -> {
			System.out.println("Eliminating Annonymous Inner" + demoData);
		};
		obj2.show("Class way of implementation - Through Lambda Expression");
			 
			
		}
	}

