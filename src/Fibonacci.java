import java.util.HashMap;

public class Fibonacci {

    //Hash map to store previous calculated Fibonacci numbers
    private static HashMap<Integer, Integer> memoMap = new HashMap<>();

    public static int fibo(int n) {

        if (n <= 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {

            return fibo(n-1) + fibo(n-2);
        }
    }

    public static int optimizedFiboFunction(int n) {

        if(n<= 0){
            return 0;
        } else if(n==1) {
            return 1;
        } else if (memoMap.containsKey(n)) {
            return memoMap.get(n);
        } else {
            int result = optimizedFiboFunction(n-1) + optimizedFiboFunction(n-2);
            memoMap.put(n,result);
            return result;
        }
    }
}
