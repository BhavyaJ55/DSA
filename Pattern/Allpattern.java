
import java.util.Scanner;

class Allpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //1.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //2.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //       System.out.print("* ");
        //     }
        //       System.out.println();
        //      }  


        //3.
        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        //   }

        //4.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        //   }

        //5.
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        //   }

        //6.
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        //   }

        //7.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("* ");
        //     }           
        //      System.out.println();
        //   }


        //8.
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("* ");
        //     }           
        //      System.out.println();
        //   }


        //9.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("_ ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("* ");
        //     }           
        //      System.out.println();
        //   }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("_ ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("* ");
        //     }           
        //      System.out.println();
        //   }


        //10.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //11.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((i+j+1)%2 +" ");
        //     }
        //     System.out.println();
        // }


        //12.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     for(int k=1;k<=2*n - 2*i;k++){
        //         System.out.print("- ");
        //     }
        //     for(int l=i;l>=1;l--){
        //         System.out.print(l+" ");
        //     }
        //     System.out.println();
        //   }


        //13.
        // int count=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(count+++" ");
        //     }
        //     System.out.println();
        //   }
    

        //14.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)(j+'@')+" ");
        //     }
        //     System.out.println();
        // }
        // another method
        // for(int i=1;i<=n;i++){
        //     char a='A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a+++" ");
        //     }
        //     System.out.println();
        // }
        

        //15.
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        // }


        //16.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)(i+64)+" ");
        //     }
        //     System.out.println();
        // }


        //17.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("- ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print((char)(k+64)+" ");
        //     }
        //     for(int l=i-1;l>=1;l--){
        //         System.out.print((char)(l+64)+" ");
        //     }
        //     System.out.println();
        // }


        //18.
        // for(int i=n;i>=1;i--){
        //     for(int j=i;j<=n;j++){
        //         System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        // }


        //19.
        // for(int i=1;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(i-1);k++){
        //         System.out.print("- ");
        //     }
        //     for(int l=n;l>=i;l--){
        //         System.out.print("* ");
        //     }
        //       System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=n;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(i-1);k++){
        //         System.out.print("- ");
        //     }
        //     for(int l=n;l>=i;l--){
        //         System.out.print("* ");
        //     }
        //       System.out.println();
        // }


        //20.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print("- ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print("- ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        //21.
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n || j==1 ||j==n){
        //             System.out.print("*");
        //         }
        //         else System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        


        //22.
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i<=n && j<=n){ 
                if(i<=j) System.out.print(n-i+1+" ");
                else  System.out.print(n-j+1+" ");
            }
            else if(i<=n && j>n){ 
                if(i+j>=2*n) System.out.print(j-n+1+" ");
                else  System.out.print(n-i+1+" ");
            }
            else if(i>n && j<=n){ 
                if(i+j<=2*n) System.out.print(n-j+1+" ");
                else  System.out.print(i-n+1+" ");
            }
           
            else{
                if(i>=j) System.out.print(i-n+1+" ");
                else  System.out.print(j-n+1+" ");
            }
            
        }
        System.out.println();
        }




        }
        }