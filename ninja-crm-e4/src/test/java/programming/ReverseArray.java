package programming;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    	
        char[] arr = {'A', 'B', 'C'};
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

