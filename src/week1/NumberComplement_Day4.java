package week1;

/*
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 */

public class NumberComplement_Day4 {
	public static void main(String args[]) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {

		String bString = Integer.toBinaryString(num);
		String f = "";

		for (int i = 0; i < bString.length(); i++) {

			if (bString.charAt(i) == '0')
				f = f + '1';
			else
				f = f + '0';
		}

		int t = Integer.parseInt(f, 2);

		return t;
	}
}
