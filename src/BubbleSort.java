public class BubbleSort {

    public static void bubbleSortAlgo(int[] arr) {

        int n = arr.length;

        for (int i=0; i< n-1;i++) {

            for (int j=0; j< n-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            for (int num:arr) {
                System.out.print(num+" ");
            }
            System.out.println();

        }

        for (int num:arr) {
            System.out.print(num+" ");
        }

    }
}
