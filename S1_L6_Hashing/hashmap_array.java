
import java.util.*;

class hashmap_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(occur(arr,size,key));
    }
    public static int occur(int[] arr,int size,int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==key)
              count++;
        }
        return count;
    }
}
