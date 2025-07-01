
import java.util.*;

class removeDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int i=0;
        for(int j=1;j<=n-1;j++){
            if(a[j]!=a[i]){
                a[i+1]=a[j];
                i++;

            }
            
        }
        for(int k=0;k<=i;k++){
            System.out.print(a[k]+" ");
        }
    } 
}
