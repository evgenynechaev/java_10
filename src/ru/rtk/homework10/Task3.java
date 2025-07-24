package ru.rtk.homework10;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static final String testText = "AcBDe egHjAfGh";

    public Task3() {
        System.out.print("\nЗадача 3\n--------\n\n");
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.printf("1) Тестовая строка '%s'\n", testText);
            System.out.println("2) Ручной ввод строки");
            System.out.println("0) Выход");
            System.out.print("Выберите пункт: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                this.start(testText);
            }

            if (choice.equals("2")) {
                System.out.print("\nВведите строку вручную: ");
                String text = scanner.nextLine();
                this.start(text);
            }

            if (choice.equals("0")) {
                break;
            }
        }
    }

    public void start(String text) {
        String[] list = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            char[] c = list[i].toLowerCase().toCharArray();
            Arrays.sort(c);
            if(i > 0) sb.append(" ");
            sb.append(new String(c));
        }
        String result = sb.toString();
        System.out.printf("\nРезультат: %s\n\n", result);
    }
}
