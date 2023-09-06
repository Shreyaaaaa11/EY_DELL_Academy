package com.programinig.class9;

import java.util.regex.Pattern;

//[abc] - a or b or c
public class CharacterClassInRegex {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("[amn]?", "a"));// true
		System.out.println(Pattern.matches("[amn]?", "z"));// false
		System.out.println(Pattern.matches("[amn]?", "am"));// false
		System.out.println(Pattern.matches("[amn]?", ""));// true
		
		System.out.println(Pattern.matches("[amn]", "aaaa"));// true
		System.out.println(Pattern.matches("[amn]", "aaaammm"));// true
		System.out.println(Pattern.matches("[amn]", "aaaammmooo"));// false
		
		System.out.println(Pattern.matches("[amn]*", "z"));// false
		System.out.println(Pattern.matches("[amn]*", "aaaammmm"));// true
	}
}
