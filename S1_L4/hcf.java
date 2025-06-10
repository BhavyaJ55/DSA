import java.util.*;
class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int max=(a>b?a:b);
        // int HCF=0;
        // for(int i=1;i<=max;i++){
        //     if((a%i ==0) && (b%i == 0))  
        //        HCF=i;
        // }
        // System.out.println(HCF);
          


          //another method using euclidean algm must get the rem of both numbers

          while(b!=0){
            int temp=b;
            b= a%b;
            a=temp;
          }

          System.out.println(a);

    }
}