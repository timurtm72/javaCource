package homework_lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

// Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку...  ");
            String line = null;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if(line != null) list.add(line.toLowerCase());
        }
        System.out.println();
// напишите тут ваш код
        int countChars = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int finalI = i;
                countChars += list.get(j).codePoints().filter(ch -> ch == alphabet.get(finalI)).count();
            }
            System.out.println(alphabet.get(i) + " = " + countChars);
            countChars = 0;
        }
    }
}
