import java.util.*;
class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }

        //method1
        // for (int i = size-1; i >=0; i--) {
        //     System.out.print(a[i]+" ");
        // }
       

        //method2
        // int[] rev= new int[size];
        // for (int i = 0; i < size; i++) {
        //     rev[i]=a[size-i-1];
        //     System.out.print(rev[i]+" ");
        // }


        //method3
        int l=0,r=size-1;
        while(l<r){
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
             l++;
             r--;
        }
       
           for (int i = 0; i < size; i++) {
            System.out.print(a[i]+" ");
        }
        }
    }
