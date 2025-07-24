package ru.rtk.homework10;

import java.util.Scanner;

public class Task1 {
    private static final String chain = "qwertyuiopasdfghjklzxcvbnm";

    public Task1()
    {
        System.out.print("\nЗадача 1\n--------\n\n");
        while (true) {
            if(!this.start()) break;
        }
    }

    private boolean start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву английского алфавита или [0] для выхода: ");
        String input = scanner.nextLine();
        char letter = input.toLowerCase().charAt(0);

        if (letter == '0') return false;

        return this.showNeighbour(letter);
    }

    private boolean showNeighbour(Character letter) {
        int letterPosition = chain.indexOf(letter);
        int chainLength = chain.length();

        if (letterPosition < 0) {
            System.out.printf("Символ %s не найден в последовательности букв.\n", letter);
        }
        else {
            if (letterPosition == 0)
                System.out.printf("Слева стоит буква %s.\n", chain.charAt(chainLength - 1));
            else
                System.out.printf("Слева стоит буква %s.\n", chain.charAt(letterPosition - 1));
        }
        return true;
    }
}
