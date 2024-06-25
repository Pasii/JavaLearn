public class PrimeNumbers {

    static int i = 2;

    public static boolean isPrimeReccurssiveWay(int num) {

        //corner cases
        if (num == 0 || num == 1) {
            return false;
        }

        //checking prime
        if (num == i) {
            return true;
        }

        //base case
        if (num % i == 0) {
            return false;
        }
        i++;

        return isPrimeReccurssiveWay(num);
    }

    public static void main(String[] args) {

        if(isPrimeReccurssiveWay(5)) {
            System.out.println("is prime number..");
        } else {
            System.out.println("is not a prime number..");
        }
    }
}
