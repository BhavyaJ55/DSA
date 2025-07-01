
import java.util.*;

class Moving_zero_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        

        //brute
        int[] temp = new int[n];
        for(int i=0;i<=n-1;i++){
            if(a[i]!=0){
                temp[i]=a[i];
            }
        }
        for(int i=0;i<=temp.length-1;i++){
            a[i]=temp[i];
        }
        
        for(int i=temp.length;i<=n-1;i++){
            a[i]=0;
        }

         

        //optimal
        // int j=-1;
        // for(int i=0;i<=n-1;i++){
        //      if(a[i]==0){
        //         j=i;
        //         break;
        //      }
        // }
        // for(int i=j+1;i<=n-1;i++){
        //     if(a[i]!=0){
        //         int temp = a[i];
        //         a[i] = a[j];
        //         a[j] = temp;
        //         j++;
        //     }
        // }
        
        
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" " );
        }
    } 
}
