import java.util.*;

public class arrayrev {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        int s = 0;
        int e = n - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        System.out.println(Arrays.toString(arr));
    }
}