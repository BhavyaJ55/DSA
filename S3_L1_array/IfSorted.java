
import java.util.*;

class IfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
       boolean ans=ifsort(a,n);
         System.out.print(ans);
        
        
    }
    public static boolean ifsort(int[] a,int n) {
        for (int i = 0; i <= n - 2; i++) {
           if(a[i]<=a[i+1]) { }
           else{ return false;}
        }
        return true;
    } 
}
