import java.util.*;
class print1ton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        some(n,1);
    }
    public static void some(int n,int i){
        if(i>n) return;
        System.out.println(i);
        some(n,++i);
        }
    }
