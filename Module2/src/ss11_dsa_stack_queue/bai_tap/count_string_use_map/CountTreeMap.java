package ss11_dsa_stack_queue.bai_tap.count_string_use_map;

import java.util.TreeMap;

public class CountTreeMap {
    public CountTreeMap() {
    }

    public void countString(String str) {
        String[] arr = str.split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String item : arr) {
            if (treeMap.containsKey(item)) {
                treeMap.put(item, treeMap.get(item) + 1);
            } else {
                treeMap.put(item, 1);
            }
        }
        System.out.println(treeMap);
    }


}
