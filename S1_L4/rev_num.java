import java.util.*;
class rev_num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int rem,rev=0;
        while(x!=0){
            rem= x%10;
            x=x/10;
            rev = (rev*10)+rem;
        }
        System.out.println(rev);
        // if(!(-2147483648<rev && 2147483647>rev))
        // {
        //     rev=0;
        // }
        // System.out.println(rev);
}
    }
      