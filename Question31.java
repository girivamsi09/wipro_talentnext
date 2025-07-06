import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();
        int[] a = new int[n];

        // Read elements
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Result array
        int[] result = new int[n];
        int idx = 0;

        // First add even numbers
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                result[idx++] = a[i];
            }
        }

        // Then add odd numbers
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 != 0) {
                result[idx++] = a[i];
            }
        }

        // Print result
        System.out.println(Arrays.toString(result));
    }
}
