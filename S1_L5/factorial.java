import java.util.*;
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial "+res);
    }
    public static int fact(int n){
        if(n<=1) return 1;
        return fact(n-1)*n;
        }
    }
