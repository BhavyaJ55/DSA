import java.util.*;

class pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*n - 2*i;k++){
                System.out.print("- ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
          }
    
}
}