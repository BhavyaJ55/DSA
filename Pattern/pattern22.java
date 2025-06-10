class pattern22{
    public static void main(String[] args) {
        int n=4;
        // for(int i=1;i<=2*n-1;i++){
        //     for(int j=1;j<=2*n-1;j++){
        //         if(i<=n && j<=n){ 
        //         if(i<=j) System.out.print(n-i+1+" ");
        //         else  System.out.print(n-j+1+" ");
        //     }
        //     else if(i<=n && j>n){ 
        //         if(i+j>=2*n) System.out.print(j-n+1+" ");
        //         else  System.out.print(n-i+1+" ");
        //     }
        //     else if(i>n && j<=n){ 
        //         if(i+j<=2*n) System.out.print(n-j+1+" ");
        //         else  System.out.print(i-n+1+" ");
        //     }
           
        //     else{
        //         if(i>=j) System.out.print(i-n+1+" ");
        //         else  System.out.print(j-n+1+" ");
        //     }
            
        // }
        // System.out.println();
        //}


        //another method
        // int size=2*n-1;
        // int[][] a = new int[size][size]; 
        // for(int k=1;k<=n;k++){
        //     // System.out.println();
        //     // System.out.println("i="+k);
            
        //     for(int i=k-1;i<=size-k;i++){
        //         for(int j=k-1;j<=size-k;j++){
        //             a[i][j]=(n+1)-k;
        //         }
        //     }
        // //     for(int i=0;i<size;i++){
        // //     for(int j=0;j<size;j++){
        // //         System.out.print(a[i][j]);
        // //     }
        // //     System.out.println();
        // // }
        // }
        // // System.out.println();
        // for(int i=0;i<size;i++){
            
        //     for(int j=0;j<size;j++){

        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        // }


        //indirect method
        int size=(2*n)-1;
        int[][] a = new int[size][size]; 
        int count=n;
        int t=0 , b=size-1, l=0, r=size-1;
        while(t!=b && l!=r){
            for(int i=l;i<=r;i++)
                a[t][i] = count;
            t++;
            
            for(int i=t;i<=b;i++)
                a[i][r] = count;
            r--;
            
            for(int i=r;i>=l;i--)
                a[b][i] = count;
            b--;
            
            for(int i=b;i>=t;i--)
                a[i][l] = count;
            l++;
            
            count--;
        }
        a[t][l]=1;
        for(int i=0;i<size;i++){
            
            for(int j=0;j<size;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
}
}
 