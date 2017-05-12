package zip;

public class RLEUnZipper implements UnZipper {
	@Override
	public String unZipText(String text) {
		StringBuilder result = new StringBuilder();
		char ch = ' ';
		int number = 0;
		for (int i = 0; i < text.length(); i++) {
			if ( i%2 == 0){
				ch = text.charAt(i);
			} else {
				number = Character.getNumericValue(text.charAt(i));
			}
			if (number != 0){
				for (int j = 0; j < number; j++){
					result.append(ch);
				}
				number = 0;
			}
		}
		return result.toString();
	}
}
