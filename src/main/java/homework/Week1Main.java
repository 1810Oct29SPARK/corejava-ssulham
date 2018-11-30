package homework;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Week1Main {

	public static void main(String[] args) {
		
		//reverse("happy");
		//cleanPhoneNumber("123a456-7&8(9)785");
		
	}
	
	//1.)
	/*
	public static String reverse(String string) {
		char[] reversed = new char[string.length()];
		char[] notReversed = new char[string.length()];
		for (int x = 0; x < string.length(); x++) {
			notReversed[x] = string.charAt(x);
		}
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		System.out.println(notReversed);
		System.out.println(reversed);
		return new String(reversed);
	}
	*/
	
	//2.)
	
	public String acronym(String phrase) {
		ArrayList<String> phraseArray = new ArrayList<String>();
		return null;
	}
	
	//5.)
	
	public static String cleanPhoneNumber(String string) {
		String string2 = string.replaceAll("\\D", "");
		if (string2.length() > 10) {
			String string3 = string2.substring(string2.length() - 10, string2.length() - 1);
			System.out.println(string3);
			return string3;
		} else if (string2.length() == 10) {
			System.out.println(string2);
			return string2;
		} else {
			System.out.println("Not enough numbers!");
		}
		return null;
	}

}
