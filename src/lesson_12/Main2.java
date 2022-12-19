package lesson_12;

import lesson_12.additional.Day;

public class Main2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("Grusha",5);
        fridge.putProduct("Yabloko",8);
        fridge.putProduct("Sliva",5);
        fridge.putProduct("Pomidor",5);

        fridge.getProducts("Sliva",5);
        fridge.getProducts("Sliva",5);
        fridge.getProducts("Grusha",3);
        Day today = Day.MONDAY;
        Day[] days = Day.values();
        for( Day d: days){
            System.out.println(days.toString());
        }

    }
}
