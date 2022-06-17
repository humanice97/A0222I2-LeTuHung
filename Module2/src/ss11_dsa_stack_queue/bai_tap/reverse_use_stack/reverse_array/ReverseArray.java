package ss11_dsa_stack_queue.bai_tap.reverse_use_stack.reverse_array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray<T extends Number> {
    public ReverseArray() {
    }

    public static Stack<Number> stack = new Stack<>();

    public void reverseArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        Number[] newArray = new Number[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(newArray));
    }
}
