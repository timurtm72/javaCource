package homework_lesson_10;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
    //напишите тут ваш код
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains("р") && strings.get(i).contains("л")){
                continue;
            }
            if(strings.get(i).contains("р")) {
                strings.remove(i);
            }
            if(strings.get(i).contains("л")) {
                strings.set(i,strings.get(i).repeat(2));
            }
        }
        return strings;
    }
}
