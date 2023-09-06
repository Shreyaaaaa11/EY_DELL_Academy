package com.programinig.class9;
import java.util.regex.Pattern;

public class UserNameValidation {
 
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd34"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd347"));
		
		System.out.println(Pattern.matches("[789](1)[0=9]{9}","9898989899"));
		String str= "  Java ExamplebTrim Function";
		System.out.println(str.trim());
	}
}
