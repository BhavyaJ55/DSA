import java.util.*;

class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int arm=0;
        while(n != 0){
            int rem = n%10;
            arm = arm+(rem*rem*rem);
            n=n/10;
        }
        if(num == arm) System.out.println(" yes");
        else System.out.println(" no");
         
    }
}