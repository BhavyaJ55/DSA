
import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(LS(a,n,key));
        
    } 
    public static int LS(int[] a,int n,int key){
          for(int i=0;i<=n-1;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
