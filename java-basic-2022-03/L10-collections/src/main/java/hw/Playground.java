package hw;


import java.util.*;

public class Playground {
    public static void main(String[] args) {
//        List<Integer> manualList = new ArrayList<>(Arrays.asList(1, -5, 20, 4));
//        HandmadeSelectionSort.sort(manualList);
//        System.out.println(manualList);

        var generatedList = generateRandomList(100_000);
        System.out.println(generatedList);

        Long start = System.currentTimeMillis();
        Collections.sort(generatedList);
        HandmadeSelectionSort.sort(generatedList);
        Long end = System.currentTimeMillis();
        System.out.println("Sort time : " + (end - start));

        /*
            10_000
            Collections.sort == 6
            HandmadeSelectionSort.sort == 116

            100_000
            Collections.sort == 34
            HandmadeSelectionSort.sort == 10491
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
}
