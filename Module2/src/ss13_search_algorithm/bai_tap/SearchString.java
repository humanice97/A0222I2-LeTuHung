package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            }
        }
        for (Character ch : list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
