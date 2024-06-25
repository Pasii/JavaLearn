import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        int chCount = CharacterCounter.countCharacterCount("pasindu madusanka",'a');
//
//        System.out.println("Character count : "+chCount);
//
//        Set<Character> characterSet = new HashSet<>();
//        characterSet.add('h');
//        characterSet.add('l');
//        characterSet.add('o');
//
//        List<Character> nonMatch = NonMatchingCharacter.findNonMatchingChars("Hello world whats", characterSet);
//
//        System.out.println(nonMatch);
//
//        //array reverse
//        int[] arr = {2,3,4,5,6,7,8,9};
//        ReverseArray.arrayReverse(arr);

        //fibonacci
        //System.out.println("fibo 5 is "+Fibonacci.fibo(3));

        int[] arr = {1,2,2,1,4,5,6,7,8,6};
        //FindDuplicates.fvoidindDup(arr);

        int[] arr2 = {24,41,11,54,92,33,64,79};
        //BubbleSort.bubbleSortAlgo(arr2);

        int[] arr3 = {10, 5, 8, 20, 25, 25, 1};
        System.out.println("Second largest element: " + SecondLargest.secondLargestNumber(arr3));
    }
}
