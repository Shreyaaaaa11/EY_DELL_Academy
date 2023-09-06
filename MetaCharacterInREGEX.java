package com.programinig.class9;
import java.util.regex.Pattern;

public class MetaCharacterInREGEX {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("\\d", "abc"));// false
		System.out.println(Pattern.matches("\\d", "l"));// true
		System.out.println(Pattern.matches("\\d", "1234"));// false
		System.out.println(Pattern.matches("\\d", "1234"));// false
		System.out.println(Pattern.matches("\\d", "a"));// true
		System.out.println(Pattern.matches("\\D", "abc"));// true
		System.out.println(Pattern.matches("\\D", "123"));// false
		System.out.println("core java Regex".replaceAll("\s+", " "));

	}
}
