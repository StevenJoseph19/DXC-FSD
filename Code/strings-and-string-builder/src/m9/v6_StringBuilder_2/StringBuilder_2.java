package m9.v6_StringBuilder_2;

import static java.lang.System.out;

public class StringBuilder_2 {

	public static void main(String[] args) {
		out.println("\n** Using StringBuilder, Part 2 ** \n");
		
		StringBuilder strBldr1 = new StringBuilder("Hello");
		strBldr1.append(" ").append("there");
		
		out.println(strBldr1); // "Hello there"
		
		StringBuilder strBldr2 = new StringBuilder(" World!");
		strBldr1.append(strBldr2);
		
		out.println(strBldr1); // "Hello there"
		
		StringBuilder strBldr3 = new StringBuilder();
		strBldr3.append(3.1)
				.append(4)
				.append(" is PI = ")
				.append(true);
		
		out.println(strBldr3); // "3.14 is PI = true"
		
		int indx = strBldr3.indexOf(".");
		out.println(indx); // 1
		
		Character chr = strBldr3.charAt(indx);
		out.println(chr); // .
		
		 strBldr1 = new StringBuilder("Hi There!");
		 strBldr1.replace(2, 3, "-*-");
		 out.println(strBldr1); // "Hi-*-There!"
		 
		 strBldr1.deleteCharAt(3);
		 out.println(strBldr1); // "Hi--There!"
		 
		 strBldr1.delete(2,4);
		 out.println(strBldr1); // "HiThere!"
		 

		 strBldr1.insert(2, " ");
		 out.println(strBldr1); // "Hi There!"
		 
		 String str1 = strBldr1.substring(0,2);
		 out.println(str1); // "Hi"
	}

}
