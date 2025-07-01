
import java.util.*;

class seclarge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }

        //bruteforce
        // Arrays.sort(a);
        // System.out.println(a[n-1]);
        // System.out.println(a[n-2]);


        //better
        // int largest = a[0];
        // int seclarge = -1;
        // for (int i = 0; i <= n - 1; i++) {
        //     if (a[i] > largest) {
        //         largest = a[i];
        
        //     }}
        // for (int i = 0; i <= n - 1; i++) {
        //     if (a[i] != largest && a[i] > seclarge) {
        //         seclarge = a[i];
        //     }
        // }
        // System.out.println(largest);
        // System.out.println(seclarge);
    

    //optimal
       int largest = a[0];
        int seclarge = -1;
        for (int i = 0; i <= n - 1; i++) {
            if (a[i] > largest) {
                seclarge = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>seclarge){
                seclarge = a[i];
            }
            }
        System.out.println(largest);
        System.out.println(seclarge);

    }
}
