import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NonMatchingCharacter {

    public static List<Character> findNonMatchingChars(String inputString, Set<Character> charSet) {

        List<Character> nonMatchingChars = new ArrayList<>();

        for(int i=0; i<inputString.length();i++) {

            if(!charSet.contains(inputString.charAt(i))) {
                nonMatchingChars.add(inputString.charAt(i));
            }
        }

        return nonMatchingChars;

    }
}
