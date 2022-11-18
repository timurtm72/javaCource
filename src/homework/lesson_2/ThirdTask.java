package homework.lesson_2;

public class ThirdTask {
    public static void main(String[] args) {
        // Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        // насколько быстрее голодный Вася съедает один банан? Вывести на консоль
        float hungryTimeCount =      9;// время поедания бананов когда Вася голодный
        float wellFedTimeCount =    15;// время поедания бананов когда Вася сытый
        float bananCount =           3;// количество бананов
        float differenceBananEat =   0;// разница в поедании бананов в разах
        float differenceToMinutes =  0;// разница в поедании бананов в минутах

        differenceBananEat = (wellFedTimeCount / bananCount) / (hungryTimeCount  / bananCount);

        System.out.println("Время поедания бананов когда Вася голодный  " + hungryTimeCount + " минут");
        System.out.println("Время поедания бананов когда Вася сытый  " + wellFedTimeCount + " минут");
        System.out.println("Количество бананов  " + bananCount + " штуки");
        System.out.println("Голодный Вася съедает один банан в  " + differenceBananEat + " раза быстрее");
        differenceToMinutes = (wellFedTimeCount / bananCount) - (hungryTimeCount  / bananCount);
        System.out.println("Голодный Вася съедает один банан на  " + differenceToMinutes + " минуты быстрее");
    }
}
