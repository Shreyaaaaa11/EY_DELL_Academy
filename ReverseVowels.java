package com.programming.class8;
import java.util.Scanner;

public class ReverseVowels {

	public String reverseVowels(String str) {
		char[] ch = str.toCharArray();

        int l = 0;
        int r = ch.length - 1;
        while (l < r) {
            if (isVowel(ch[l]) && isVowel(ch[r])) {
                char t = ch[l];
                ch[l] = ch[r];
                ch[r] = t;
                l++;
                r--;
            } else if (isVowel(ch[l])) {
                r--;
            } else {
                l++;            }
        }
        return new String(ch);
    }
    private boolean isVowel(char c) {
		c = Character.toLowerCase(c);
        return c =='a'||c =='e'||c =='i'||c =='o'||c =='u';
    }

	public static void main(String[] args) {
		ReverseVowels reverseVowels = new ReverseVowels();
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String reverseString = reverseVowels.reverseVowels(str);
		System.out.print(reverseString);
		scanner.close();
	}
}
