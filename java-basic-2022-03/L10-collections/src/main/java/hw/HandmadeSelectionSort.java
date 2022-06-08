package hw;

import java.util.List;

public class HandmadeSelectionSort {
    static List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int nMin = i;
            int min = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                // ??? + 1 sec
                int jValue = list.get(j);
                if (min > jValue) {
                    min = jValue;
                    nMin = j;
                }
            }

            list.set(nMin, list.get(i));
            list.set(i, min);
        }

        return list;
    }
}
