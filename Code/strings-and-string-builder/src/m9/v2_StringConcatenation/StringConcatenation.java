package m9.v2_StringConcatenation;

import static java.lang.System.out;

public class StringConcatenation {

	public static void main(String[] args) {
		out.println("\n** String Concatenation ** \n");

		String str = "Hi, ";
		String str2 = str + "Bob!";
		out.println(str2); // Hi, Bob!

		String pi = "3.14" + 15926;
		out.println(pi); // 3.1415926

		String str3 = 5 + 3 + "xyz" + 3 + 5; // "8xyz35 "

		String str4 = "Pi is ";

		str4 += "3.14";

		out.println(str4); // "Pi is 3.14"

		str4 += "__" + 5 * 4;

		out.println(str4); // "Pi is 3.14__20"

	}

}
