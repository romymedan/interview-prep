import java.util.Arrays;

public class StringOfNumbersFindMaxAndMinNumbers {
    public static void main(String[] args) {
        String strOfNum = "1,7,2,8";
        // Split the string into an array of strings
        String[] parts = strOfNum.split(",");
        // Convert each string in the array to an integer
        int[] numArr = new int[parts.length];
        for(int i = 0; i < parts.length; i ++){
            numArr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("The max number is: " + maxNum(numArr));
        System.out.println("The min number is: " + minNum(numArr));
    }

    private static int maxNum(int[] numArr){
        Arrays.sort(numArr);
        return numArr[numArr.length-1];
    }

    private static int minNum(int[] numArr){
        Arrays.sort(numArr);
        return numArr[0];
    }
}
