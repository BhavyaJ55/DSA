import java.util.*;

class Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sen = lowup(s); // Cleaned and lowercase version of string
        StringBuilder temp = new StringBuilder();
        temp.append(sen);             // Copy of cleaned string
        temp.reverse();               // Reverse the copy
        return (temp.toString().equals(sen.toString()));
        // if (temp.toString().equals(sen.toString())) {
        //     return true;
        // } else {
        //     return false;
        // }
    }

    // Method to convert to lowercase and remove non-alphanumeric characters
    public static StringBuilder lowup(String sen) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome:");
        String input = sc.nextLine();

        Palindrome sol = new Palindrome();
        boolean isPalin = sol.isPalindrome(input);

        if (isPalin) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}



// import java.util.*;
// class Palindrome{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size= sc.nextInt();
//         int[] a = new int[size];
        
//         for (int i = 0; i < size; i++) {
//             a[i]=sc.nextInt();
//         }
        
        //method1
        // for (int i = size-1; i >=0; i--) {
        //     System.out.print(a[i]+" ");
        // }
       

        //method2
        // int[] rev= new int[size];
        // for (int i = 0; i < size; i++) {
        //     rev[i]=a[size-i-1];
        //     System.out.print(rev[i]+" ");
        // }
        // boolean pal=true;
        // for (int i = 0; i < size/2; i++){
        //     if(a[i]!=rev[i]) 
        //        pal = false;
        //     break;
        // }
        // if(pal==true) System.out.println("palindrome");
        // else System.out.println("not palindrome");
