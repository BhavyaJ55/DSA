import java.util.*;

class quick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = 0,high=n-1;

        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        quick_sort(a,low,high);
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void quick_sort(int[] a, int low,int high){
        if(low>=high) return;
        int s = partition(a,low,high);
        quick_sort(a, low, s-1);
        quick_sort(a,s+1,high);
    }
    public static int partition(int[] a,int low,int high){
        int pivot=a[low], i=low+1 ,j=high;
        while (true) { 
            while(i<=high && pivot>=a[i])
             i++;
            while(j>low && pivot<a[j])
             j--;
            if(i<j){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else if(i>j){
                int temp = a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
            else
            return j;
        }  
    }
}
