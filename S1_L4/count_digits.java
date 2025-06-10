import java.util.*;

class count_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String num = sc.nextLine();
        // System.out.println("Digits length:"+num.length());


        int n = sc.nextInt();
        int count=0;
        while(n>0){
              count++;
              n=n/10;
        }
         System.out.println(count);
    }
}