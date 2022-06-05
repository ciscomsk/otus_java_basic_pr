package ru.otus.java.hw;

import java.util.Arrays;

public class ArrayModifications {
    public static void main(String[] args) {
        String[] srcArr = {"first", "second", "third"};

        String[] addArr = addToArray(srcArr, 3, "added");
        System.out.println(Arrays.toString(addArr));

        String[] removeArr = removeFromArray(srcArr, 2);
        System.out.println(Arrays.toString(removeArr));
    }

    private static String[] addToArray(String[] srcArr, int idx, String value) {
        int srcArrSize = srcArr.length;

        if (idx < 0 || idx > srcArrSize) {
            throw new IllegalArgumentException("Index value should be in range:  0 - " + srcArrSize);
        }

        String[] newArray = new String[srcArrSize + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
//            if (i < idx) newArray[i] = srcArr[i];
//            else if (i == idx) newArray[i] = value;
//            else newArray[i] = srcArr[i - 1];
            if (i != idx) {
                newArray[i] = srcArr[j];
                j++;
            }
            else {
                newArray[i] = value;
            }
        }

        return newArray;
    }

    private static String[] removeFromArray(String[] srcArr, int idx) {
        int srcArrSize = srcArr.length;
        int maxValidIndex = srcArrSize - 1;

        if (idx < 0 || idx > maxValidIndex) {
            throw new IllegalArgumentException("Index value should be in range:  0 - " + maxValidIndex);
        }

        String[] newArray = new String[srcArrSize - 1];
        for (int i = 0, j = 0; i < srcArr.length; i++) {
            if (i != idx) newArray[j++] = srcArr[i];
        }

        return newArray;
    }
}
