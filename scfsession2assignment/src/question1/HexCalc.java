package question1;

import java.util.Scanner;

public class HexCalc {
	private static long base = 16;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean compare = false;
		String hexValue1 = null;
		String hexValue2 = null;
		String result = null;
		long decimalValue1 = 0, decimalValue2 = 0;
		int choice = 0; // Taking task choice from user
		do {
			System.out
					.println("Enter Choice\n 1:Addition\n2:Substract\n3:Multiply\n4:Division\n5:Compare Equal\n6:Compare Grater\n7:Compare Smaller\n8:Return Decimal Representation \n9:Return Hexadecimal Representation\n0:Exit");
			choice = sc.nextInt();
			if (choice == 1) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				// System.out.println("hex value:"+hexValue1+" "+hexValue2);
				decimalValue1 = hexToDecimal(hexValue1);
				decimalValue2 = hexToDecimal(hexValue2);
				// System.out.println("dec value:"+decimalValue1+" "+decimalValue2);
				result = addDecimal(decimalValue1, decimalValue2);
				print(result);
			}
			if (choice == 2) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				decimalValue1 = hexToDecimal(hexValue1);
				decimalValue2 = hexToDecimal(hexValue2);
				result = subDecimal(decimalValue1, decimalValue2);
				print(result);

			}
			if (choice == 3) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				decimalValue1 = hexToDecimal(hexValue1);
				decimalValue2 = hexToDecimal(hexValue2);
				result = mulDecimal(decimalValue1, decimalValue2);
				print(result);
			}
			if (choice == 4) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				decimalValue1 = hexToDecimal(hexValue1);
				decimalValue2 = hexToDecimal(hexValue2);
				result = divDecimal(decimalValue1, decimalValue2);
				print(result);
			}
			if (choice == 5) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				compare = hexadecimalEquality(hexValue1, hexValue2);
				print(Boolean.toString(compare));
			}
			if (choice == 6) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				compare = hexadecimalGrater(hexValue1, hexValue2);
				print(Boolean.toString(compare));
			}
			if (choice == 7) {

				hexValue1 = enterHexValue();
				hexValue2 = enterHexValue();
				compare = hexadecimalSmaller(hexValue1, hexValue2);
				print(Boolean.toString(compare));
			}
			if (choice == 8) {

				hexValue1 = enterHexValue();
				long decimalValue = hexToDecimal(hexValue1);
				print(Long.toString(decimalValue));
			}
			if (choice == 9) {

				System.out.println("Enter Decimal Value");
				decimalValue1 = sc.nextLong();
				System.out.println(decimalToHex(decimalValue1));
			}
			if (choice == 0)
				System.exit(0);
		} while (choice != 0);
	}

	/**
	 * hexadecimalEquality checks for equality of two hexadecimal numbers
	 * 
	 * @param hexValue1
	 *            gets first hexadecimal value
	 * @param hexValue2
	 *            gets second hexadecimal value
	 * @return booleans value for comparision
	 */

	private static boolean hexadecimalEquality(String hexValue1,
			String hexValue2) {
		if (hexValue1.equals(hexValue2))
			return true;
		else
			return false;
	}

	/**
	 * hexadecimalGrater checks for grater of two hexadecimal numbers
	 * 
	 * @param hexValue1
	 *            gets first hexadecimal value
	 * @param hexValue2
	 *            gets second hexadecimal value
	 * @return booleans value for comparision
	 */
	private static boolean hexadecimalGrater(String hexValue1, String hexValue2) {
		if (hexValue1.length() < hexValue2.length())
			return false;
		else
			for (int i = 0; i < hexValue1.length(); i++) {
				if (hexValue1.charAt(i) > hexValue2.charAt(i))
					return true;
			}

		return false;
	}

	/**
	 * hexadecimalGrater checks for smaller of two hexadecimal numbers
	 * 
	 * @param hexValue1
	 *            gets first hexadecimal value
	 * @param hexValue2
	 *            gets second hexadecimal value
	 * @return booleans value for comparision
	 */
	private static boolean hexadecimalSmaller(String hexValue1, String hexValue2) {
		if (hexValue1.length() > hexValue2.length())
			return false;
		else
			for (int i = 0; i < hexValue1.length(); i++) {
				if (hexValue1.charAt(i) < hexValue2.charAt(i))
					return true;
			}

		return false;
	}

	/**
	 * divDecimal is used to divide two decimal numbers
	 * 
	 * @param val1
	 *            is decimal value 1
	 * @param val2
	 *            is decimal value 2
	 * @return string which is hexadecimal value of decimal division
	 */

	private static String divDecimal(long val1, long val2) {

		long div = val1 / val2;
		String value = decimalToHex(div);
		return value;
	}

	/**
	 * mulDecimal is used to divide two decimal numbers
	 * 
	 * @param val1
	 *            is decimal value 1
	 * @param val2
	 *            is decimal value 2
	 * @return string which is hexadecimal value of decimal multiplication
	 */

	private static String mulDecimal(long val1, long val2) {
		long mul = val1 * val2;
		String value = decimalToHex(mul);
		return value;
	}

	/**
	 * subDecimal is used to substract two decimal numbers
	 * 
	 * @param val1
	 *            is decimal value 1
	 * @param val2
	 *            is decimal value 2
	 * @return string which is hexadecimal value of decimal substraction
	 */

	private static String subDecimal(long val1, long val2) {
		String value;
		StringBuffer temp = new StringBuffer();
		long sub = val1 - val2;
		if (sub < 0) {
			value = decimalToHex(sub);
			temp.append("-");
			temp.append(value);
			value = temp.toString();
		} else
			value = decimalToHex(sub);

		return value;
	}

	/**
	 * addDecimal is used for addition of two decimal numbers
	 * 
	 * @param val1
	 *            is decimal value 1
	 * @param val2
	 *            is decimal value 2
	 * @return string which is hexadecimal value of decimal addition
	 */
	private static String addDecimal(long val1, long val2) {

		long sum = val1 + val2;
		System.out.println("sum value:" + sum);
		String value = decimalToHex(sum);
		System.out.println("hex value:" + value);
		return value;
	}

	/**
	 * print is used for output
	 * 
	 * @param result
	 *            is value to be printed
	 */

	private static void print(String result) {
		System.out.println(result);

	}

	/**
	 * enterHexValue is used for getting hexadecimal values from user
	 * 
	 * @return hexadecimal string value
	 */

	private static String enterHexValue() {
		String hexValue;
		System.out.println("Enter Hexadecimal value");
		hexValue = sc.next();
		return hexValue;
	}

	/**
	 * hexToDecimal converts hexadecimal value to decimal value
	 * 
	 * @param hexVal
	 *            gets entered hexadecimal value
	 * @return decimal equivenlent of hexadecimal
	 */

	private static long hexToDecimal(String hexVal) {
		long decimalValue = 0, tempValue = 0;
		for (int i = hexVal.length() - 1, count = 0; i >= 0; i--) {
			if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') { // converting 0-9 hexadecimal to decimal
				tempValue = (int) hexVal.charAt(i) - '0';
				decimalValue = decimalValue
						+ (int) (tempValue * Math.pow(base, count));
			} else {
				if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') { //  converting A-f hexadecimal to decimal
					tempValue = (int) hexVal.charAt(i) - 'A' + 10;
					decimalValue = decimalValue
							+ (int) (tempValue * (Math.pow(base, count)));
				}
			}
			count++;
		}
		return decimalValue;
	}

	/**
	 * decimalToHex convert decimal number to equivalent hexadecimal value
	 * 
	 * @param decimalVal
	 * @return
	 */

	private static String decimalToHex(long decimalVal) {
		char tempVal;
		String returnValue = null;
		long number = decimalVal;
		StringBuffer hexVal = new StringBuffer();
		int asciiNumStart = 48;
		int asciiCharStart = 65;
		long result = 0, remainder = 0;
		if (number == 0) {
			returnValue = "0";
		}
		else {
			
			number = Math.abs(number);
			do {
				result = number / base;
				remainder = number % base;
				number = result;
				if (remainder >= 0 && remainder <= 9) {
					tempVal = (char) (remainder + asciiNumStart);
					hexVal.append(tempVal);
				} else {
					tempVal = (char) (remainder - 10 + asciiCharStart);
					hexVal.append(tempVal);
				}

			} while (result != 0);
			if(decimalVal<0)
				hexVal.append("-");
			returnValue = hexVal.reverse().toString();

		} 
		return returnValue;
	}

}