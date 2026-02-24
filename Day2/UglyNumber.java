public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        return n == 1;
    }

    public static void main(String[] args) {
        int num = 14;
        
        if (isUgly(num)) {
            System.out.println(num + " is an ugly number");
        } else {
            System.out.println(num + " is not an ugly number");
        }
    }
}
