package com.programinig.class9;

//public class ReplaceAStringWithRegex {

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class ReplaceAStringWithRegex {

	public static final String REGEX = "Java";

	private static String INPUT_STRING = "core java programing language";

	private static final String REPLACED_STRING = "Java regex concept";

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Pattern p = Pattern.compile(REGEX);

		Matcher m = p.matcher(INPUT_STRING);

		INPUT_STRING = m.replaceAll(REPLACED_STRING);

		System.out.println("replaced string is" + INPUT_STRING);

	}
}
