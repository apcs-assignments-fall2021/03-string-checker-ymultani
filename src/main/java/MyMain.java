import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        char a_char = 'a';
        char b_char = 'b';
        char c_char = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i ++){
            char check_char = str.charAt(i);
            if (a_char == check_char || b_char == check_char || c_char == check_char){
                count++;
            }

            else{
                continue;
            }

        }
        System.out.println("Your string has " + count + "a's, b's, and c's");


        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int x = str.indexOf("the");
        int y = str.indexOf("The");
        if (x != -1 || y != -1){
            System.out.println("Your string does contain the or The");
            return true;

        }
        else{

            System.out.println("Your string does NOT contain the or The");
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String pali_string = "";
        for (int i = str.length()-1; i >= 0;i--) {

            pali_string = pali_string + str.charAt(i);
        }
        if (str.equals(pali_string)){
            System.out.println("Your string is a palindrome");
            return true;
        }
        else{
            System.out.println("Your string is NOT a palindrome");
            return false;
        }


    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input_string = scan.nextLine();
        countABC(input_string);
        containsThe(input_string);
        isPalindrome(input_string);


    }
}
