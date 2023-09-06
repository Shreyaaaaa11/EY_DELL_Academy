package com.programinig.class6;

public class MethodReferenceExample {
	@FunctionalInterface
	public static interface converter<F, T> {
		T convert(F from);
	}

	public static void main(String[] args) {
		converter<String, Integer> intconverter = (from) -> Integer.valueOf(from);
		Integer converterValue = intconverter.convert("123");
		System.out.println("Integer Value is" + converterValue);

		// doing same thing using method reference
		converter<String, Integer> intconverter2 = Integer::valueOf;
		Integer converterValue2 = intconverter2.convert("123");
		System.out.println("Integer Value is" + converterValue2);

		StartingAlphabet obj = new StartingAlphabet();
		converter<String, String> strCon = obj::startWith;
		String value = strCon.convert("Java");
		System.out.println(value);

		PersonFactor<Person> personObject = Person::new;
		Person person = personObject.create("core", "Java");
		System.out.println("Person name is" + person.firstName + " " + person.lastName);
	}

	static class StartingAlphabet {
		String startWith(String str) {
			return String.valueOf(str.charAt(0));
		}
	}

	interface PersonFactor<P extends Person> {
		P create(String firstName, String lastName);
	}

	static class Person {

		String firstName;

		String lastName;

		Person(String firstName, String lastName) {

			this.firstName = firstName;

			this.lastName = lastName;

		}
	}
}