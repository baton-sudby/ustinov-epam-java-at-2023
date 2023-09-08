package tasks;

import utils.Utils;

import java.util.Arrays;

public class TaskTwo {

    Utils utils = new Utils();

    public String getOriginalArrayString(String[] originalArray) {
        return "Оригинальный массив : " + Arrays.toString(originalArray);
    }
    /**
     * 1. Найти самую короткую строку, не учитывая пустые строки. Если не найдено ни одной, вернуть сообщение об этом.
     */
    public void findShortestString() {
        System.out.println("\033[0;34mВ этом задании нам нужно найти самую короткую строку, не учитывая пустые строки. " +
                "Если не найдено ни одной, вернуть сообщение об этом.\033[0m");
        String[] stringArray = utils.getStringArray();
        String shortestString = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > 0 && !stringArray[i].matches("\\s+")) shortestString = stringArray[i];
        }
        for (int i = 0; i < stringArray.length; i++) {
            if (shortestString.length() > stringArray[i].length() && (stringArray[i].length() > 0)
                    && (!stringArray[i].matches("\\s+"))) shortestString = stringArray[i];
            stringArray[i] = "|" + stringArray[i] + "|- длина строки равна '" + stringArray[i].length() + "'";
        }
        if (shortestString.length() > 0) System.out.println("Самая короткая строка: " + shortestString);
        else System.out.println("Все строки пустые");
        System.out.println("Оригинальный массив строк, с указанием длины каждой строки: " + Arrays.toString(stringArray));
    }

    /**
     * 2. Найти те строки, длина которых больше средней, а также длину. Вывести их на консоль.
     */
    public void findStringGreaterAverageLength() {
        System.out.println("\033[0;34mВ этом задании нам нужно найти те строки, длина которых больше средней," +
                " а также длину. Вывести их на консоль.\033[0m");
        int averageLength = 0;
        String[] stringArray = utils.getStringArray();
        for (int i = 0; i < stringArray.length; i++) {
            averageLength += stringArray[i].length();
        }
        averageLength /= stringArray.length;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > averageLength) {
                System.out.printf("Длина строки '%s' больше средней длины '%s'. Ее длина составляет '%s' символов.\n", stringArray[i], averageLength, stringArray[i].length());
            }
        }
        System.out.println(getOriginalArrayString(stringArray));
    }

    /**
     * 3. Найти строку, состоящую только из цифр. Если таких строк больше одной, найти вторую из них. Если нет ни одной, вернуть сообщение об этом.
     */
    public void findStringConsistsOnlyDigits() {
        System.out.println("\033[0;34mВ этом задании нам нужно найти строку, состоящую только из цифр. " +
                "Если таких строк больше одной, найти вторую из них. Если нет ни одной, вернуть сообщение об этом\033[0m");
        String[] stringArray = utils.getStringArray();
        String result = "";
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("\\d+")) {
                result = stringArray[i];
                counter++;
                if (counter == 2) break;
            }
        }
        if (counter == 0) System.out.println("Нет ни одной строки, состоящей только из цифр");
        System.out.println("Строка, состоящая только из цифр: " + result + "\n" + getOriginalArrayString(stringArray));
    }

    /**
     * 4. В массиве строк подсчитать строки, состоящие только из уникальных символов, игнорируя пустые строки.
     */
    public void sumStringsConsistOnlyUniqueCharacters() {
        System.out.println("\033[0;34mВ этом задании нам нужно в массиве строк подсчитать строки, состоящие только из " +
                "уникальных символов, игнорируя пустые строки.\033[0m");
        String[] stringArray = utils.getStringArray();
        String[] splitedString;
        int counter = 0;
        int stringCounter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            counter = 0;
            if (stringArray[i].length() > 0) {
                splitedString = stringArray[i].split("");
                for (int j = 0; j < splitedString.length - 1; j++) {
                    for (int k = j + 1; k < splitedString.length; k++) {
                        if (splitedString[j].equals(splitedString[k])) counter ++;
                        else if (counter > 0) break;
                    }
                }
            }
            if (counter == 0) {
                System.out.println("Строка '" + stringArray[i] + "' состоит из уникальных символов");
                stringCounter++;
            }
        }
        System.out.println("Количество строк, которые содержат в себе только уникальные символы: " + stringCounter + "\n" + getOriginalArrayString(stringArray));
    }
}
