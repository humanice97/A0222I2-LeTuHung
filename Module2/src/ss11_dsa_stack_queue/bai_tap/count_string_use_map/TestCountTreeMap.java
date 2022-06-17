package ss11_dsa_stack_queue.bai_tap.count_string_use_map;

import java.util.Locale;
import java.util.Scanner;

public class TestCountTreeMap {
    public static void main(String[] args) {
        CountTreeMap countTreeMap = new CountTreeMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine().toLowerCase();
        countTreeMap.countString(str);
    }
}
