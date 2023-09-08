package utils;

import java.util.Scanner;

public class Utils {

    private final Scanner scanner = new Scanner(System.in);
    public String getLine() {
        return scanner.nextLine();
    }

    public int getNumber() {
        String string = getLine();
        if (string.matches("\\d+")) {
            if (string.length() > 10) {
                System.out.println("Нельзя вводить числа длиной более 10 символов. Попробуйте снова: ");
                return getNumber();
            }
            return Integer.parseInt(string);
        } else {
            System.out.printf("Это '%s' не число, попробуйте снова:\n", string);
            return getNumber();
        }
    }

    public int[] getNumberRandomArray() {
        int[] inrArray = new int[20];
        for (int i = 0; i < 20; i++) {
            inrArray[i] = (int) (Math.random() * 20 - 10);
        }
        return inrArray;
    }

    public String[] getStringArray() {
        System.out.println("Введите количество строк: ");
        String[] stringArray = new String[getNumber()];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("Введите содержимое строки '%s': ", i + 1);
            stringArray[i] = getLine();
        }
        return stringArray;
    }

    public int[][] getMatrix() {
        int[][] arrayInt = new int[5][5];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length; j++) {
                arrayInt[i][j] = i;
            }
        }
        return arrayInt;
    }
//    public void findShortestString() {
//        int amountOfString = utils.getNumber();
//        String string;
//        String shortestString = "";
//        for (int i = 0; i < amountOfString; i++) {
//            shortestString =  shortestString + utils.getLine() + ",";
//        }
//        System.out.println(shortestString);
//    }
}
