package com.programming;

public class PersonData implements Cloneable {
int person_id;
String person_name;
PersonData(int perspn_id, String person_name){
	this.person_id = person_id;
	this.person_name = person_name;
	}
public static void main(String[] args) throws CloneNotSupportedException
{
	PersonData obj1 = new PersonData(123,"ABC");
	PersonData obj2 = (PersonData) obj1.clone();
	System.out.println("Person id is" + obj1.person_id + " and name is" + obj2.person_name);
	System.out.println("Person id is" + obj2.person_id + " and name is" + obj2.person_name);
}
}
