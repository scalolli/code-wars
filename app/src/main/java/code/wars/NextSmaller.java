package code.wars;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextSmaller {

    public static long nextSmaller(long number) {
        List<Long> numberArray = splitNumberIntoArray(number);
        System.out.println(numberArray);

        for (int i = numberArray.size() - 1; i >= 0; i--) {
            for (int j = i + 1; j < numberArray.size(); j++)
                if (numberArray.get(i) > numberArray.get(j) && numberArray.get(j) != 0) {
                    return Long.valueOf(findNumber(numberArray, i, j));
                }
        }
        return -1l;
    }

    static Long findNumber(List<Long> numberArray, int xIndex, int yIndex) {
        List<Long> mutableList = new ArrayList(numberArray);
        Long x = numberArray.get(xIndex);
        Long y = numberArray.get(yIndex);

        mutableList.set(xIndex, y);
        mutableList.set(yIndex, x);

        Stream<Long> leftPart = mutableList.subList(0, xIndex + 1).stream();
        Stream<Long> rightPart = mutableList.subList(xIndex + 1, mutableList.size()).stream().sorted(Comparator.reverseOrder());

        String number = Stream.concat(leftPart, rightPart).map(n -> n.toString()).collect(Collectors.joining());

        return Long.valueOf(number);
    }

    static List<Long> splitNumberIntoArray(long number) {
        List<Long> numberArray = new ArrayList<>();
        long currentNumber = number;

        while (currentNumber > 0) {
            numberArray.add(currentNumber % 10);
            currentNumber = currentNumber / 10;
        }

        List<Long> reversedArray = getReversedArray(numberArray);
        return reversedArray;
    }

    @NotNull
    private static List<Long> getReversedArray(List<Long> numberArray) {
        List<Long> reversedArray = new ArrayList<>();
        for (int i = numberArray.size() - 1; i >= 0; i--) {
            reversedArray.add(numberArray.get(i));
        }
        return reversedArray;
    }
}
