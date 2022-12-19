package lesson_16;

public class Sun {
    private String color;
    private String name;
    private static Sun instance;
    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }

//    public Sun(String color, String name) {
//        this.color = color;
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
