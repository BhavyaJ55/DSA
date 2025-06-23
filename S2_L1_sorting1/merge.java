import java.util.*;

class merge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int low=0,high=n-1;
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        mergesort(a,low,high);
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void mergesort(int[] a,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergesort(a,low,mid);
        mergesort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    public static void merge(int[] a,int low,int mid,int high){
        int i=low,j=mid+1,k=0;
        int[] temp = new int[high-low+1];
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=high){
            temp[k++]=a[j++];
        }
        for(i=low;i<=high;i++)
            a[i]=temp[i-low];
    }
}
