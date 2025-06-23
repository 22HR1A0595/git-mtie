class GFG {
 
// utility function to check for vowel

    static boolean isVowel(char c) {

        return (c == 'a' || c == 'A' || c == 'e'

                || c == 'E' || c == 'i' || c == 'I'

                || c == 'o' || c == 'O' || c == 'u'

                || c == 'U');

    }
 
// Function to reverse order of vowels

    static String reverseVowel(String str1) {

        int j = 0;

        // Storing the vowels separately

        char[] str = str1.toCharArray();

        String vowel = "";

        for (int i = 0; i < str.length; i++) {

            if (isVowel(str[i])) {

                j++;

                vowel += str[i];

            }

        }
 

	}
}
}
	