import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        sortArray(arr);
    }

    private static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        return arr;
    }
}
