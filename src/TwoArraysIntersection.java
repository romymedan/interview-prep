import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysIntersection {
    public static void main(String[] args) {
        int[] arr1 = {3,7,5};
        int[] arr2 = {5,9,7,1,1};

        System.out.println("The intersection array is: " + Arrays.toString(intersectionArray(arr1, arr2)));
    }

    private static int[] intersectionArray(int[] arr1, int[] arr2){
        //1. sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> intersectionArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i ++;
            } else if(arr1[i] > arr2[j]){
                j ++;
            } else {
                intersectionArr.add(arr1[i]);
                i ++;
                j ++;
            }
        }
        int[] result = new int[intersectionArr.size()];
        for (int k = 0; k < intersectionArr.size(); k ++){
            result[k] = intersectionArr.get(k);
        }
        return result;
    }
}
