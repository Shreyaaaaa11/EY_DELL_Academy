package com.programinig.class5.Annotation;

//@Jsonserializable

public class Person {

	@JsonElement
	public String firstName;

	@JsonElement
	public String lastName;

	@JsonElement(key = "[personAge")

	private String age;

	private String address;

	public Person(String firstName, String lastName) {

		super();

		this.firstName = firstName;

		this.lastName = lastName;

	}

	public Person(String firstName, String lastName, String Age) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;
	}

	@Intit

        private void initNames() {

            this.firstName = this.firstName.substring(0,1).toUpperCase() + this.firstName.substring(1);

            

            this.lastName = this.lastName.substring(0,1).toUpperCase() + this.lastName.substring(1);

 

        }

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}
}