
import java.util.*;

class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        
        int[] a1 = new int[n1];
        
        for (int i = 0; i <= n1 - 1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        
        for (int i = 0; i <= n2 - 1; i++) {
            a2[i] = sc.nextInt();
        }
        
        int[] temp = merge(n1,a1,n2,a2);
        removeDuplicates(temp);
    } 
     public static int[] merge(int n1,int[] a1,int n2,int[] a2){
        int i=0,j=0,k=0;
        int[] temp = new int[a1.length+a2.length];
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                temp[k++]=a1[i++];
            }
            else{
                temp[k++]=a2[j++];
            }
        }
        while(i<n1){
            temp[k++]=a1[i++];
        }
        while(j<n2){
            temp[k++]=a2[j++];
        }
        return temp;
    }
    public static void removeDuplicates(int[] temp){
        int i=0;
        for(int j = 1;j<temp.length;j++){
            if(temp[j]!=temp[i]){
                temp[i+1]=temp[j];
                i++;
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(temp[k]+" ");
        }
    }
}
