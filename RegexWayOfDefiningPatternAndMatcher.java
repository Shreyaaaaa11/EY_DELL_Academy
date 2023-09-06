package com.programinig.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWayOfDefiningPatternAndMatcher {

	public static void main(String[] args) {
		Pattern P = Pattern.compile(",o");
		
		Matcher m = P.matcher("Co");
		boolean result = m.matches();
		
		System.out.println("Match Result - " + result);
		
		boolean Sameresult2 = Pattern.compile(".a").matcher("a").matches();
		System.out.println("Result is" + Sameresult2);
		
		boolean Sameresult3 = Pattern.matches(".q","Pq");
		System.out.println("Result is" + Sameresult3);
		
		}
}
