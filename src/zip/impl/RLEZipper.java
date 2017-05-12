package zip.impl;

import zip.Zipper;

public class RLEZipper implements Zipper {
	@Override
	public String zipText(String text) {
		StringBuilder result = new StringBuilder();
		char currentChar;
		char nextChar = ' ';
		int countOfRepeat = 1;
		for (int i = 0; i < text.length(); i++) {
			if (i != text.length() - 1 && countOfRepeat < 9){
				currentChar = text.charAt(i);
				nextChar = text.charAt(i+1);
				if (currentChar == nextChar && countOfRepeat < 9) {
					countOfRepeat ++;
				} else {
					result.append(currentChar);
					result.append(countOfRepeat);
					countOfRepeat = 1;
				}
			} else {
				result.append(nextChar);
				result.append(countOfRepeat);
				countOfRepeat = 1;
			}
		}
		return result.toString();
	}
}
