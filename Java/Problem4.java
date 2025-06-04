import java.util.Locale;

class Solution {
    public String shortestPalindrome(String s) {
        s = s.toLowerCase();  // assign the string in lowercase
        int j = s.length() - 1;
        String newCharacter = "";
        int sameCharacter = 0;

        while (sameCharacter != (s.length() / 2)) {
            j = s.length() - 1;
            sameCharacter = 0;

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(i + j)) {
                    j -= 2;
                    sameCharacter++;
                } else {
                    newCharacter = String.valueOf(s.charAt(i + j));
                    for (char c : newCharacter.toCharArray()) {
                        s = s.substring(0, sameCharacter) + c + s.substring(sameCharacter);
                        sameCharacter++;
                    }
                    break;
                }
            }
        }
        return s;
    }
}