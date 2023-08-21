import java.util.Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {6,2,9,0,1,7};
        System.out.println("The third largest number is: " + thirdLargestNumber(arr));
    }

    private static int thirdLargestNumber(int[] arr) {
        // 1. sort arr {0,1,2,6,7,9}
        Arrays.sort(arr);
        return arr[arr.length-3];
    }


}
