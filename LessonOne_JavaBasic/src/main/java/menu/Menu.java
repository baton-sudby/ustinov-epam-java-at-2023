package menu;

import tasks.TaskOne;
import tasks.TaskTwo;
import utils.Utils;

public class Menu {

    Utils utils = new Utils();

    public void mainMenu() {
        System.out.println("\033[0;31m____________________________________________________________________________________________\033[0m" +
                "\n\033[0;96mМеню выбора модулей.\033[0m" +
                "\n1.Массивы чисел.\n2.Массивы строк.\n3.Калькулятор.\n4.\033[0;31mЗавершить работу приложения.\033[0m" +
                "\n\033[0;96mВведите цифру, которая соответствует модулю, который вы хотите выбрать:\033[0m");
        int moduleNumber = utils.getNumber();
        switch (moduleNumber) {
            case 1:
                taskOneMenu();
                break;
            case 2:
                taskTwoMenu();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Приложение заверило работу.");
                break;
            default:
                System.out.printf("Модуля под номером '%s' не существует. попробуйте снова", moduleNumber);
                mainMenu();
                break;
        }
    }

    public void taskOneMenu() {
        TaskOne taskOne = new TaskOne();
        System.out.println("\033[0;31m____________________________________________________________________________________________\033[0m" +
                "\n\033[0;96mМеню первого модуля.\033[0m" +
                "\n1.Определить сумму элементов, стоящих на чётных позициях." +
                "\n2.Заменить нулями отрицательные элементы в массиве." +
                "\n3.В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным." +
                "\n4.В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные." +
                "\n5.Имеется массив int[X][Y], сформировать массив int[Y][X] путем поворота данных по часовой стрелке" +
                "\n6.Вычислить факториал числа Х.\n7.\033[0;92mВыход в главное меню.\033[0m" +
                "\n8.\033[0;31mЗавершить работу приложения.\033[0m" +
                "\n\033[0;96mВведите цифру, которая соответствует заданию, которое вы хотите выполнить:\033[0m");
        int taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                taskOne.determineSumOfElementsStandingInEvenPositions();
                taskOneMenu();
                break;
            case 2:
                taskOne.replaceNegativeElementsInArrayWithZeros();
                taskOneMenu();
                break;
            case 3:
                taskOne.tripleEachPositiveElementThatComesBeforeNegativeOne();
                taskOneMenu();
                break;
            case 4:
                taskOne.outputAllElementsOccurMoreOnceWithOddIndexes();
                taskOneMenu();
                break;
            case 5:
                taskOne.rotateClockwise();
                taskOneMenu();
                break;
            case 6:
                taskOne.factorial();
                taskOneMenu();
                break;
            case 7:
                System.out.println("Переходим в главное меню.");
                mainMenu();
                break;
            case 8:
                System.out.println("Приложение завершило работу.");
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. попробуйте снова", taskNumber);
                mainMenu();
                break;
        }
    }

    public void taskTwoMenu() {
        TaskTwo taskTwo = new TaskTwo();
        System.out.println("\033[0;31m____________________________________________________________________________________________\033[0m" +
                "\n\033[0;96mМеню второго модуля.\033[0m" +
                "\n1.Найти самую короткую строку, не учитывая пустые строки. Если не найдено ни одной, вернуть сообщение об этом." +
                "\n2.Найти те строки, длина которых больше средней, а также длину. Вывести их на консоль" +
                "\n3.Найти строку, состоящую только из цифр. Если таких строк больше одной, найти вторую из них. " +
                "Если нет ни одной, вернуть сообщение об этом" +
                "\n4.В массиве строк подсчитать строки, состоящие только из уникальных символов, игнорируя пустые строки." +
                "\n5.\033[0;92mВыход в главное меню.\033[0m\n6.\033[0;31mЗавершить работу приложения.\033[0m" +
                "\n\033[0;96mВведите цифру, которая соответствует заданию, которое вы хотите выполнить:\033[0m");
        int taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                taskTwo.findShortestString();
                taskTwoMenu();
                break;
            case 2:
                taskTwo.findStringGreaterAverageLength();
                taskTwoMenu();
                break;
            case 3:
                taskTwo.findStringConsistsOnlyDigits();
                taskTwoMenu();
                break;
            case 4:
                taskTwo.sumStringsConsistOnlyUniqueCharacters();
                taskTwoMenu();
                break;
            case 5:
                System.out.println("Переходим в главное меню.");
                mainMenu();
                break;
            case 6:
                System.out.println("Приложение завершило работу.");
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. попробуйте снова", taskNumber);
                mainMenu();
                break;
        }
    }
}
