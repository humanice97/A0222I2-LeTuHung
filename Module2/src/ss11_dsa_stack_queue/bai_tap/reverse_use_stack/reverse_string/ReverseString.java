package ss11_dsa_stack_queue.bai_tap.reverse_use_stack.reverse_string;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public ReverseString() {
    }
    public static Stack<String> stack = new Stack<>();
    public void reverseStr(String str){
        String[] arr = str.split(" ");
        for(String s : arr){
            stack.push(s);
        }
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(newArr));
    }
}
