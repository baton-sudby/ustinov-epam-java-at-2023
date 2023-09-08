package tasks;

import utils.Utils;

import java.util.Arrays;

public class TaskOne {

    Utils utils = new Utils();
    int[] originalArray = utils.getNumberRandomArray();

    private String getOriginalArrayText() {
        return "Оригинальный массив: " + Arrays.toString(originalArray);
    }

    private String getModifiedArrayText(int[] originalArray) {
        return "Измененный массив: " + Arrays.toString(originalArray);
    }
    /**
     * 1. Определить сумму элементов, стоящих на чётных позициях.
     */
    public void determineSumOfElementsStandingInEvenPositions() {
        System.out.println("\033[0;34mВ этом задании нам нужно определить сумму элементов, стоящих на чётных позициях.\033[0m" +
                "\n" + getOriginalArrayText());
        int sumOfElements = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            sumOfElements += originalArray[i];
        }
        System.out.println("Сумма элементов, стоящих на четных позициях: " + sumOfElements);
    }

    /**
     * 2. Заменить нулями отрицательные элементы в массиве.
     */
    public void replaceNegativeElementsInArrayWithZeros() {
        System.out.println("\033[0;34mВ этом задании нам нужно заменить нулями отрицательные элементы в массиве.\033[0m" +
                "\n" + getOriginalArrayText());
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < 0) originalArray[i] = 0;
        }
        System.out.println(getModifiedArrayText(originalArray));
    }

    /**
     *  3. В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
     */
    public void tripleEachPositiveElementThatComesBeforeNegativeOne() {
        System.out.println("\033[0;34mВ этом задании нам нужно в массиве целых чисел утроить каждый положительный элемент, " +
                "который стоит перед отрицательным.\033[0m\n" + getOriginalArrayText());
        for (int i = 0; i < originalArray.length - 1; i++) {
                if (originalArray[i] > 0 && originalArray[i + 1] < 0) originalArray[i] *= 3;
        }
        System.out.println(getModifiedArrayText(originalArray));
    }

    /**
     * 4. В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные
     */
    public void outputAllElementsOccurMoreOnceWithOddIndexes() {
        System.out.println("\033[0;34mВ этом задании нам нужно в массиве целых чисел вывести все элементы, " +
                "которые встречаются больше одного раза и индексы которых нечётные.\033[0m\n" + getOriginalArrayText());
        for (int i = 1; i < originalArray.length; i += 2) {
            for (int j = 0; j < originalArray.length; j++) {
                if ((originalArray[i] == originalArray[j]) && i != j) {
                    System.out.println(originalArray[i] + " встречается более Одного раза и его индекс: " + i);
                    break;
                }
            }
        }
    }

    /**
     * 5. Имеется массив int[X][Y], сформировать массив int[Y][X] путем поворота данных по часовой стрелке.
     */
    public void rotateClockwise() {
        System.out.println("\033[0;34mВ этом задании нам нужно из массива int[X][Y], сформировать массив int[Y][X]" +
                "путем поворота данных по часовой стрелке.\033[0m\n");
        System.out.println("Матрица до изменений:");
        int[][] matrix = utils.getMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Матрица после изменений:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][matrix.length - j - 1] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 6. Вычислить факториал числа Х.
     */
    public void factorial() {
        System.out.println("\033[0;34mВ этом задании нам нужно вычислить факториал числа Х.\033[0m\nВведите число:");
        int number = utils.getNumber();
        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialNumber *= i;
        }
        System.out.println("Факториал числа '" + number + "' равен: " + factorialNumber);
    }
}
