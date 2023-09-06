package com.programinig.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReplaceWithQuantifier {

	// TODO Auto-generated method stub

	private static final String REGEX = "a*b";
	private static final String INPUT_STRING = "aabPQRaanMNOabXYZb";
	private static final String REPLACE = "_";

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		// INPUT_STRING =m.replaceAll(REPLACED_STRING);
		StringBuffer sb = new StringBuffer();

		while (m.find())
		{
			// append and replace
			m.appendReplacement(sb, REPLACE);
		}
		System.out.println(sb.toString());

	}
}