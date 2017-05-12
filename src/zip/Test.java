package zip;

import zip.impl.RLEUnZipper;
import zip.impl.RLEZipper;

public class Test {
	
	public static void main(String[] args) {
		Zipper zip = new RLEZipper();
		String text1 = "cccccffffeee";
		String text2 = "C;;;;!!!!(((( StringStringccccc333333333111cC3434DoubleChar";
		String text3 = "22222222222333333333333333";
		String result = zip.zipText(text2);
		System.out.println(result);
		
		UnZipper unzip = new RLEUnZipper();
		System.out.println(unzip.unZipText(result));
	}
}
