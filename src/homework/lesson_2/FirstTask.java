package homework.lesson_2;

public class FirstTask {
    public static void main(String[] args) {
        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        // Вывести на консоль
        float allMoney =            5;// вся сумма
        float boxOfficeCount =      2;// количество касс
        float firstOfficeMoney =    0;// деньги в первой кассе
        float secondOfficeMoney =   0;// деньги в второй кассе

        firstOfficeMoney = allMoney / boxOfficeCount;
        secondOfficeMoney = allMoney - firstOfficeMoney;

        System.out.println("Общая сумма = " + allMoney + " рублей");
        System.out.println("Кол-во денег в 1 кассе = " + firstOfficeMoney + " рубля");
        System.out.println("Кол-во денег в 2 кассе = " + secondOfficeMoney  + " рубля");
    }
}
