import java.util.*;
class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //     int res = sum(n,1);
    //     System.out.println("total sum "+res);
    // }
    // public static int sum(int n,int i){
    //     if(i>n) return 0;
    //     return i+sum(n,i+1);
    //     }
    

        int res = sum(n);
        System.out.println("total sum "+res);
    }
    public static int sum(int n){
        if(n<=1) return 1;
        return sum(n-1)+n;
        }
    }
