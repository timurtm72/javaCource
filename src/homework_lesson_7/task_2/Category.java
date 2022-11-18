package homework_lesson_7.task_2;

public class Category {
    private String name;
    private Product [] products = new Product[100];

    public Category() {
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
