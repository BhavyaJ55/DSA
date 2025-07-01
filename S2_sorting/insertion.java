import java.util.*;

class insertion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[] a = new int[n];
       for(int i=0;i<n;i++)
           a[i] = sc.nextInt();
        is(a,n);
        for (int i = 0; i < n; i++) {
           System.out.print(a[i]+" ");
       }
       
       }
       public static void is(int[] a,int n){
        for(int i=0;i<=n-1;i++){
        int j=i;
        while(j>0 && a[j-1]>a[j]){
           int temp = a[j-1];
           a[j-1]=a[j];
           a[j]=temp;
           j--;
        }
        }
       }
    }
