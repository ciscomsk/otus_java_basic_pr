package hw;

import java.util.*;

public class Playground {
    public static void main(String[] args) {
        List<Integer> manualList = new ArrayList<>(Arrays.asList(1, -5, 20, 4));
//        HandmadeSelectionSort.sort(manualList);
//        System.out.println(manualList);

        var generatedList = generateRandomList(10_000);
//        System.out.println(generatedList);

        System.out.println(getExecutionTime(() ->  Collections.sort(generatedList)));
        System.out.println(getExecutionTime(() ->  HandmadeSelectionSort.sort(generatedList)));
        System.out.println();
        /*
            10_000
            Collections.sort            == 7
            HandmadeSelectionSort.sort  == 78

            100_000
            Collections.sort            == 34
            HandmadeSelectionSort.sort  == 7848
         */

        // err - ConcurrentModificationException
//        for (int elem : manualList) {
//            System.out.println(elem);
//            manualList.add(7);
//        }

        var emptyLL = new LinkedList<Integer>();
        var emptyAL = new ArrayList<Integer>();

        var insertLLTime = getExecutionTime(() -> {
            for (int i = 0; i <= 100_000_000; i++) {
                emptyLL.add(i);
            }
        });
        System.out.println(insertLLTime); //

        var insertALTime = getExecutionTime(() -> {
            for (int i = 0; i <= 100_000_000; i++) {
                emptyAL.add(i);
            }
        });
        System.out.println(insertALTime);

        /*
            Linked list == 13646
            Array list  == 3639
         */
    }

    private static List<Integer> generateRandomList(int size) {
        // List ???
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        for (int i = 0; i < size; i++) {
            Integer randomValue = rand.nextInt();
            list.add(randomValue);
        }

        return list;
    }

    public static long getExecutionTime(Runnable code) {
        Long start = System.currentTimeMillis();
        code.run();
        Long end = System.currentTimeMillis();

        return end - start;
    }

}
