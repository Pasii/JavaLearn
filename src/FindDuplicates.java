import java.util.HashSet;

public class FindDuplicates {

    public static void fvoidindDup(int [] arr) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num: arr) {

            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }

        }

        for (int n : duplicates) {
            System.out.print(n+" ");
        }

    }
}
