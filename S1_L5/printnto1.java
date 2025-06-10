import java.util.*;
class printnto1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //     some(n,n);
    // }
    // public static void some(int n,int i){
    //     if(i<1) return;
    //     System.out.println(i);
    //     some(n,--i);
    //     }
    some(n);
    }
    public static void some(int n){
        if(n<1)
          return;
         System.out.println(n);
         some(--n);
    }
    }
