import java.util.*;

class selection{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[] a = new int[n];
       for(int i=0;i<=n-1;i++)
           a[i] = sc.nextInt();
       for(int i=0;i<=n-2;i++){
        int min=i;
        for(int j=i;j<=n-1;j++){
          if(a[min]>a[j])
            min=j;
        }
        int temp = a[i];
        a[i]=a[min];
        a[min]=temp;

       }
       for (int i = 0; i < n; i++) {
           System.out.print(a[i]+" ");
       }
    }
}