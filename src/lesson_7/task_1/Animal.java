package lesson_7.task_1;

public class Animal {
    private String food;
    private String location;
    private String name;

    public void makeNoise(){
        System.out.println(getName() + "животное спит...");
    }
    public void eat(){

    }
    public void sleep(){

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
