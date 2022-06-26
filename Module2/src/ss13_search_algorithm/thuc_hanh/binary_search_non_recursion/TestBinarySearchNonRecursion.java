package ss13_search_algorithm.thuc_hanh.binary_search_non_recursion;

public class TestBinarySearchNonRecursion {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result;
        int x = 11;
        result = BinarySearchNonRecursion.binarySearch(list, x);
        if (result == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
