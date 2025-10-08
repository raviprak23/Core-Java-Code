package arraymethods;

import java.lang.Integer;

class compareunsignedmethod {
	public static void main(String args[]) {
		int m = 10;
		int n = 20;
		// as 10 less than 20, the output would be a value less than zero
		System.out.println(Integer.compareUnsigned(m, n));
		int x = 8;
		int y = 8;
		// as 8 equals 8, Output would be zero
		System.out.println(Integer.compareUnsigned(x, y));
		int e = 25;
		int f = 8;
		// as 25 is greater than 8, Output would be a value greater than zero
		System.out.println(Integer.compareUnsigned(e, f));
		int o = 15;
		int p = -7;
		// as 15 is greater than -7 but -7 would be treated as an unsigned number
		// which will be greater than 15
		// Output would be a value less than zero
		System.out.println(Integer.compareUnsigned(o, p));
	}
}
