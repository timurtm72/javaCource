package lesson_9_10.tern_operator;

public class Main {
    public static void main(String[] args) {
        People people = new People("Вася",21);
//
//        if(people.getAge() < 18){
//            System.out.println("Нет " + people.getName()+ " , ты не можешь пройти...");
//        }else{
//            System.out.println("Да " + people.getName()+ " , ты можешь пройти...");
//        }
        String answer = people.getAge() < 16 ? "Нет " + people.getName()+ " , ты не можешь пройти...":"Да " + people.getName()+ " , ты можешь пройти...";
        System.out.println(answer);
    }
}
