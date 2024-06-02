public class ReverseArray {

    public static void arrayReverse(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }

        System.out.println(arr.toString());
        for(int num: arr) {
            System.out.print(num+" ");
        }
    }
}
