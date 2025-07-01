
import java.util.*;

class Leftrotate_Dplace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        d = d % n;
        //rotate1(a,n,d);
        // rotate2own(a,n,d);
        // rotate3loop(a,n,d);
        rotateOptimal(a,n,d);
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void rotate1(int[] a, int n,int d) {
        int[] temp = new int[d];
        //moving upto d elements to temp 
        for(int i=0;i<=d-1;i++){
            temp[i]=a[i];
        } 

        //shifting after dth elements to front
        for(int i=d;i<=n-1;i++){
            a[i-d]=a[i];
        }
        //from temp to array 
        //1st method
        // for(int k=0;k<=d-1;k++){
        //      a[n-d+k]=temp[k];
        // } 

        //from temp to array 
        //2nd method
        for(int i = n-d ;i<=n-1;i++){
            a[i]=temp[i-(n-d)];
        }
    }
    public static void rotate2own(int[] a, int n,int d) {
       //brute = own
           int[] temp = new int[d];
           for(int i=0 ;i<=d-1;i++){
              temp[i] = a[i];
           }
           for(int i=d;i<=n-1;i++){
             a[i-d] =a[i];
           }
           for(int i =0;i<=d-1;i++){
                a[d+i]=temp[i];
           }
    }
    public static void rotate3loop(int[] a, int n,int d) {
        for (int j = 0; j < d; j++) {
            int temp = a[0];
            for (int i = 1; i <= n - 1; i++) {
                a[i - 1] = a[i];
            }
            a[n - 1] = temp;
        }
    }
    public static void rotateOptimal(int[] a, int n,int d) {
        int size = a.length;
        reverse(a, 0, d-1);
        reverse(a, d, size-1);
        reverse(a, 0, size-1);
    }
    
    public static void reverse(int[] a,int l,int r){
        while(l<r){
            int temp = a[l];
            a[l]= a[r];
            a[r] = temp;
            l++;
            r--;
        }
    } 
        
    }

