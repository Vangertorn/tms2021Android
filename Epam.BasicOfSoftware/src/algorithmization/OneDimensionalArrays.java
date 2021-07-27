package algorithmization;

import java.util.*;

public class OneDimensionalArrays {

    public void task1(int[] arrays) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter K, please");
        int k = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % k == 0) {
                sum = sum + arrays[i];
            }
        }
        System.out.println(sum);
    }

    public void task2(int[] arrays) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Can you enter Z, please");
        int z = scanner.nextInt();
        int numberSubstitutions = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > z) {
                arrays[i] = z;
                numberSubstitutions++;
            }
        }
        System.out.println(numberSubstitutions);

    }

    public void task3(int[] arrays) {

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros = 0;
        for (Integer i : arrays) {
            if (i > 0) {
                positiveNumber++;
            } else if (i < 0) {
                negativeNumber++;
            } else {
                zeros++;
            }
        }
        System.out.println("negative number is\t" + negativeNumber);
        System.out.println("positive number is\t" + positiveNumber);
        System.out.println("zeros is\t" + zeros);
    }

    public void task4(int[] arrays) {
        int max = 0;
        int numberMax = arrays[0];
        int min = 0;
        int numberMin = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                numberMax = i;
            }
            if (arrays[i] < min) {
                min = arrays[i];
                numberMin = i;
            }
        }
        arrays[numberMax] = min;
        arrays[numberMin] = max;

    }

    public void task5(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > i) {
                System.out.print("\t" + arrays[i]);
            }
        }
    }

    public void task6(int[] arrays) {
        int sum = 0;

        if (arrays.length > 3) {
            sum = arrays[1] + arrays[2] + arrays[3];
            for (int i = 5; i < arrays.length; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;

                        break;
                    }
                }
                if (isPrime) {
                    sum = sum + arrays[i];
                }
            }

        }
        switch (arrays.length) {
            case 3:
                sum = arrays[1] + arrays[2];
                break;
            case 2:
                sum = arrays[1];
                break;

        }
        System.out.println(sum);
    }

    public void task7(int[] arrays) {
        int max = 0;
        for (int i = 0; i < (int) arrays.length; i = i + 2) {
            if (arrays[i] + arrays[i + 1] > max) {
                max = arrays[i] + arrays[i + 1];
            }
        }
        System.out.println(max);
    }

    public void task8(int[] arrays) {
        int min = arrays[0];
        List<Integer> newList = new LinkedList<>();
        for (int array : arrays) {
            if (array < min) {
                min = array;
            }
        }
        for (Integer i : arrays) {
            if (i != min) {
                newList.add(i);
            }
        }
        System.out.println(newList.toString());
    }

    public void task9(int[] arrays) {
        List<Integer> list = new LinkedList<>();
        int[] number = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            for (int array : arrays) {
                if (arrays[i] == array) {
                    number[i] = number[i] + 1;
                }
            }
        }
        int maxNumber = arrays[0];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {

            if (number[i] > max) {
                maxNumber = arrays[i];
                max = number[i];
            }
        }
        list.add(maxNumber);
        if (max == 1) {
            System.out.println("There aren't duplicate elements");
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] == max && arrays[i] != maxNumber) {
                list.add(arrays[i]);
            }
        }
        if (list.size() > 1) {
            int min = list.get(0);
            for (Integer i : list) {
                if (i < min) {
                    min = i;
                }
            }
            System.out.println(min);
        } else {
            System.out.println(maxNumber);
        }

    }

    public void task10(int[] arrays) {
        int counter = 1;
        for (int i = 1; i <= arrays.length / 2; i++) {
            arrays[i] = arrays[i + counter];
            counter = counter + 1;
        }
        double z = (double) arrays.length / 2;
        for (int i = (int) Math.ceil(z); i < arrays.length; i++) {
            arrays[i] = 0;
        }
        for (int array : arrays) {

            System.out.print("\t" + array);
        }
    }
}

