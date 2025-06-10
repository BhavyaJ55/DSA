import java.util.*;

class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        // for(int i=2;i<=n-1;i++)
        for(int i=2;i*i<=n;i++)
        // lesser than sqrt of n 
        {
           if(n%i==0){
            System.out.println("not prime.");
            return;
           }
        }
        System.out.println("prime");
    }
}