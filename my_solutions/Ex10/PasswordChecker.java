public class PasswordChecker {
	static boolean isGoodPassword(String inputString) {

		int length = 0;
		int numbers = 0;
		int upperCaseLetter = 0;
		int lowerCaseLetter = 0;
		int specialChar = 0;

		length = inputString.length();

		char[] charArray = new char[length];

		for(int i = 0; i < length; i++) {
			charArray[i] = inputString.charAt(i);
		}

		for(int i = 0; i < length; i++) {

			int cv = Character.codePointAt(charArray, i);

			if(cv >= 48 && cv <= 57) {
				numbers++;
			}else if(cv >= 65 && cv <= 90) {
				upperCaseLetter++;
			}else if(cv >= 97 && cv <= 122) {
				lowerCaseLetter++;
			}else if(cv >= 33 && cv <= 47 || cv >= 58 && cv <= 64 || cv >= 91 && cv <= 96 || cv >= 123 && cv <= 126) {
				specialChar++;
			}else{
				System.out.println("error: character outside of defined ranges at index " + i + " (" + charArray[i] + ")");
			}
		}

		if(length >= 8 && numbers >= 2 && upperCaseLetter >= 1 && lowerCaseLetter >= 1 && specialChar >= 1) {
			System.out.println("The password \"" + inputString + "\" is sufficiently secure.");
			return true;
		}else{
			System.out.println("The password \"" + inputString + "\" isn't strong enough.");
			return false;
		}
	}
}
