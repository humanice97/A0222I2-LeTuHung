package ss13_search_algorithm.thuc_hanh.binary_search_recursion;

public class BinarySearch {
    public int binarySearch(int[] arr, int x, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, x, low, mid - 1);
            } else {
                return binarySearch(arr, x, mid + 1, high);
            }
        }
        return -1;
    }
}
