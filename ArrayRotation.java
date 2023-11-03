import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        
        rotateArrayInPlace(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotateArrayInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
