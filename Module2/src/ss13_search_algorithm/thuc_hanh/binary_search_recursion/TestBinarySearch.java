package ss13_search_algorithm.thuc_hanh.binary_search_recursion;

public class TestBinarySearch {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int x = 40;
        int high = arr.length;
        int result = search.binarySearch(arr, x, 0, high - 1);
        if (result == -1) {
            System.out.println("Element not present!");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
