package hello_Git;

import java.util.Arrays;

public class Git12345 {

	public static void main(String[] args) {
		System.out.println("We will Practice again - Tom");

		// One of Interview question
		String str = "Testing OnE Two THree";

		char x = 'z'; // A-65 Z-90 a-97 z-122
		int z = x;

		String upperCase = "";
		int countUpperC = 0;

		String lowerCase = "";
		int countLowerCase = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				upperCase += c;
				countUpperC++;
			}
			if (c >= 97 && c <= 122) {
				lowerCase += c;
				countLowerCase++;
			}
		}
		System.out.println("Upper case : " + upperCase + " and count : " + countUpperC);
		System.out.println("Lower case : " + lowerCase + " and count : " + countLowerCase);

		int[] num = { 10, 10, 20, 30, 40, 50, 30, 60 };

		System.out.println("Original Array = " + Arrays.toString(num));
		String str1 = "";

		for (int i = 0; i < num.length; i++) {
			String temp = num[i] + "";
			if (!str1.contains(temp)) {
				str1 += temp + ",";
			}
		}
		String[] tempNum = str1.split(",");

		int[] newNum = new int[tempNum.length];

		for (int i = 0; i < tempNum.length; i++) {
			int n = Integer.parseInt(tempNum[i]);
			newNum[i] += n;
		}
		System.out.println("Unique number in array = "+Arrays.toString(newNum));

	}

}
