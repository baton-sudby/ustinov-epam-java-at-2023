package utils;

import java.util.Scanner;

public class Utils {

    private final Scanner scanner = new Scanner(System.in);
    public String getLine() {
        return scanner.nextLine();
    }

    public int getNumber() {
        System.out.println("Ведите количество строк:");
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

    public int[] getNumberArray() {
        int[] inrArray = new int[20];
        for (int i = 0; i < 20; i++) {
            inrArray[i] = (int) ((Math.random() * 20 - 10));
        }
        return inrArray;
    }

    public String[] getStringArray() {
        String[] stringArray = new String[getNumber()];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Введите строку: ");
            stringArray[i] = getLine();
        }
        return stringArray;
    }
}
