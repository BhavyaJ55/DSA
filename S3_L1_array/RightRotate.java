
import java.util.*;

class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        d = d%10;
        //rotate(a,n);
        rotateD(a,n,d);
         for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" " );
        }
    } 
    public static void rotate(int[] a,int n){
        int temp=a[n-1];
          
        for(int i=a.length-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=temp;
    }
    public static void rotateD(int[] a,int n, int d){
        int size = a.length;
        int l=0,r=size-1;
        while(l<r){
            int temp = a[l];
            a[l]= a[r];
            a[r] = temp;
            l++;
            r--;
        }
        l=0;
        r=d-1;
        while(l<r){
            int temp = a[l];
            a[l] =a[r];
            a[r]= temp;
            l++;
            r--;
        }
        l=d;
        r=size-1;
        while(l<r){
            int temp = a[l];
            a[l]= a[r];
            a[r] =temp;
            l++;
            r--;
        }
    }
}
