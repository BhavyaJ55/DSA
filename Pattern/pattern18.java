//pattern18
class pattern18
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
}
}
 