public class PrintNumInReverse {
    public static void main(String[] args) {
        int num = 12345;
        String str = "Hello you!";
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("the number in reverse is: " + reverseNum(num));
        System.out.println("the string in reverse is: " + reverseStr);
    }

    private static int reverseNum(int num) {
        int reverse = 0, lastDigit = 0;
        while (num > 0){
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }
}
