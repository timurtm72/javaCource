package lesson_6.box_with_disks;

public class Disk {
    private String name;
    private int year;

    public Disk() {

    }
    public Disk(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
