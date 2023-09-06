package com.programming.class8;
import java.util.Scanner;

public class TrimWhiteSpaces {

	public static void main(String[] args) {

		TrimWhiteSpaces trimWhiteSpaces = new TrimWhiteSpaces();
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();

		String trimmedMessage = trimWhiteSpaces.trimWhiteSpaces(message);
		System.out.println(trimmedMessage);
		in.close();

	}

	public String trimWhiteSpaces(String message) {

		message = message.replaceAll("\\s+"," ").trim();
        return message;
    }
		

	
	}
