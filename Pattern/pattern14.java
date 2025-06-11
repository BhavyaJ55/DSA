import java.util.*;

class pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+'@')+" ");
            }
            System.out.println();
        }
        // another method
        // for(int i=1;i<=n;i++){
        //     char a='A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a+++" ");
        //     }
        //     System.out.println();
        // }
        
    
}
}