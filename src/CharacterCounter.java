public class CharacterCounter {

    public static int countCharacterCount(String inputString, char ch) {

        int count = 0;

        for (int i=0; i < inputString.length();i++) {

            if (inputString.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
