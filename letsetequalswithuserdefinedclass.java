package com.programming;
//public static void main(String[] args) {
class Employee{
	String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public class letsetequalswithuserdefinedclass {
		public static void main(String[] args) {
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			
			e1.setFirstName("ABC");
			e2.setFirstName("ABC");
			if(e1.equals(e2)) {
				System.out.println("equals work with custom class");
			}
			else
			{
				System.out.println("equals does not work with custom class");
			}
			System.out.println("Memory address is"+ e1.hashCode());
			System.out.println("Memory address is"+ e2.hashCode());
}
}
}
