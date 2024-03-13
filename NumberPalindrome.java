public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        if(number < 10 && number > -10){
            return true;
        }
        while(number >= 10 || number <= -10){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        reverse *= 10;
        reverse += number;
        
        if(reverse == original){
            return true;
        } 
        return false;
    }
}
