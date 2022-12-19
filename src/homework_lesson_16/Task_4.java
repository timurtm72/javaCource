package homework_lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Task_4 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) {
//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder vowelCharBuffer = new StringBuilder();
        StringBuilder consonantCharBuffer = new StringBuilder();
        System.out.println("Введите строку...");
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (str != null && !str.isEmpty()) {
            try (StringReader stringReader = new StringReader(str)) {
                int ch = 0;
                String isVowelStr = null;
                while (true) {
                    try {
                        if (!((ch = stringReader.read()) != -1)) break;
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    if (isVowel((char) ch)) {
                        vowelCharBuffer.append((char) ch);
                        vowelCharBuffer.append(' ');
                    } else {
                        consonantCharBuffer.append((char) ch);
                        consonantCharBuffer.append(' ');
                    }
                }
            }
            System.out.println();
            System.out.println("Гласные -> " + vowelCharBuffer);
            System.out.println("Согласные и остальные -> " + consonantCharBuffer);
        }else{
            System.out.println("Строка пустая...");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) { // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
