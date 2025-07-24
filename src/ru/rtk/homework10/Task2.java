package ru.rtk.homework10;

import java.util.Scanner;

public class Task2 {
    private static final String leftArrow = "<--<<";
    private static final String rightArrow = ">>-->";
    private static final String testChain = "<><><>>>--><--<<<<<<<--<<<<<>";
    private static final int maxLength = 106;

    public Task2() {
        System.out.print("\nЗадача 2\n--------\n\n");
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.printf("1) Проверить тестовую строку '%s'\n", testChain);
            System.out.println("2) Ручной ввод строки");
            System.out.println("0) Выход");
            System.out.print("Выберите пункт: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                start(testChain);
            }

            if (choice.equals("2")) {
                System.out.print("Введите строку вручную (не более 106 символов): ");
                String text = scanner.nextLine();
                if (text.length() > maxLength)
                    text = text.substring(0, maxLength);
                start(text);
            }

            if (choice.equals("0")) {
                break;
            }
        }
    }

    private void start(String chain) {
        int leftArrowCounter = this.arrowCount(chain, leftArrow);
        int rightArrowCounter = this.arrowCount(chain, rightArrow);

        System.out.printf("\nСтрока '%s' найдена %s раз, строка '%s' найдена %s раз\n\n",
                leftArrow,
                leftArrowCounter,
                rightArrow,
                rightArrowCounter);
    }

    private int arrowCount(String chain, String arrow) {
        int arrowCounter = 0;
        int fromIndex = 0;
        while(true) {
            int resultIndex = chain.indexOf(arrow, fromIndex);
            if (resultIndex < 0) break;
            arrowCounter++;
            fromIndex = resultIndex + 1;
        }
        return arrowCounter;
    }
}
