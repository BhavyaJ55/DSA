import java.util.*;
class Palindrome{
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
        int[] rev= new int[size];
        for (int i = 0; i < size; i++) {
            rev[i]=a[size-i-1];
            System.out.print(rev[i]+" ");
        }
        boolean pal=true;
        for (int i = 0; i < size/2; i++){
            if(a[i]!=rev[i]) 
               pal = false;
            break;
        }
        if(pal==true) System.out.println("palindrome");
        else System.out.println("not palindrome");
        }
    }
