package algorithmization;

import java.util.Arrays;

public class Sorts {
    public static void task1(int[] array1, int[] array2, int k) {
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i <= k; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[i + k + 1] = array2[i];
        }
        for (int i = k + 1; i < array1.length; i++)
            array[i + array2.length] = array1[i];
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void task2(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        int j = 0;
        for (int i = array1.length; i < array.length; i++) {
            array[i] = array2[j];
            j++;
        }
        Arrays.sort(array);

        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void task3(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int position = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    position = j;
                    max = array[j];
                }
            }
            array[position] = array[i];
            array[i] = max;
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void task4(int[] array) {
        int count = 0;
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    count++;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("By sort we spent\t" + count + "\tswap");
    }

    public static void task5(int[] array) {
        for (int left = 1; left < array.length; left++) {
            int newElement = array[left];
            int index = binarySearch(array, newElement, 0, left);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(array, index, array, index + 1, left - index);
            array[index] = newElement;
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int binarySearch(int[] sortedArray, int elementToSearch, int firstIndex, int lastIndex) {
        int low = firstIndex;
        int high = lastIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = sortedArray[mid];
            if (midValue < elementToSearch) low = mid + 1;
            else if (midValue > elementToSearch) high = mid - 1;
            else return mid;
        }
        return -(low + 1);
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void task6(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void task7(int[] array1, int[] array2) {
        int[] arraySum = new int[array1.length + array2.length];
        int position1 = 0;
        int position2 = 0;
        for (int i = 0; i < arraySum.length; i++) {
            if (position1 > array1.length-1) {
                arraySum[i] = array2[position2];
                System.out.println("You must insert \t"+array2[position2]+"\tat position\t"+i+"\tin new array");
                position2++;
            }
            if (position2 > array2.length-1) {
                arraySum[i] = array1[position1];
                position1++;
            } else if (array1[position1] < array2[position2]) {
                arraySum[i] = array1[position1];
                position1++;
            } else {
                arraySum[i] = array2[position2];
                System.out.println("You must insert \t"+array2[position2]+"\tat position\t"+i+"\tin new array");
                position2++;
            }
        }
    }
}
