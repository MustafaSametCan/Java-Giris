public class PalindromeNums {

    static boolean isPalindrome(int input) {
        int tmp, rnum=0, remain;
        tmp = input;
        while (tmp != 0) {
            remain = tmp % 10;
            rnum = rnum * 10 + remain;
            tmp/=10;

        }
        if(input==rnum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

            System.out.println(isPalindrome(123321));

    }
}
