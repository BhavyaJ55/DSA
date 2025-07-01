import java.util.*;

class largest_elem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i <= n-1; i++) {
            a[i]=sc.nextInt();
        }
        int max =a[0];
        for(int i=0;i<=n-1;i++){
            if(a[i]>max)
             max = a[i];
        }
        System.out.println(max);

        // Arrays.sort(a);
        // System.out.println(a[n-1]);
        // System.out.println(a[n-2]);

    }
}
