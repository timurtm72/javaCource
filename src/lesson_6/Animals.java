package lesson_6;

public class Animals {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animals() {
    }
    public Animals(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void say(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Имя '" + name + " " +
                "Возраст " + age + " " +
                "Вес " + weight + " " +
                "Цвет " + color + "\n";
    }
}
