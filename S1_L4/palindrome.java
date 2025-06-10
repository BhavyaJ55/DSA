class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int rem,rev=0;
        while(x!=0){
            rem= x%10;
            x=x/10;
            rev = (rev*10)+rem;
        }
        return temp==rev;
    }
}

class palindrome{
    public static void main(String[] args) {
         Solution p = new Solution();
         System.out.println(p.isPalindrome(121));
         System.out.println(p.isPalindrome(123));
    }
}