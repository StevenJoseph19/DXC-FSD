package org.dxc;

public class PlayWithPrimitiveTypes {

	public static void main(String[] args) {
		
		int i1 = 10;
		long l1 = i1;
		
		i1 = (int)l1;
		
		float f1 = 2.2f;
		double d1 = 2.2f;
		
		int i2 = 20;
		int i3 = (int)(l1 + i2);
		
		short s1 = 10;
		short s2 = 20;
		
//		short s3 = (short) (s1 + s2);
		
		int s3 = s1 + s2;
		
		
		
		
		
		
		
		
	}

}
