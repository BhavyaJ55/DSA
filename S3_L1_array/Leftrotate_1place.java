
import java.util.*;

class Leftrotate_1place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int temp = a[0];
        
        for(int i=1;i<=n-1;i++){
            a[i-1] = a[i];
        }
        a[n-1]=temp;
         for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" " );
        }
    } 
}
