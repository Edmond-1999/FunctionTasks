package sortedSquaredArray;


public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] *= numbers[index];
        }

        int count = 0;

        while (count < numbers.length) {
            for (int index = 0; index < numbers.length - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
            count++;
        }

        return numbers;
    }

}
