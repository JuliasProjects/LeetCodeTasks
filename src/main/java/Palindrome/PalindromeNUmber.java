package Palindrome;

public class PalindromeNUmber {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        return (String.valueOf(x)).equalsIgnoreCase(stringBuilder.reverse().toString());

    }
}
