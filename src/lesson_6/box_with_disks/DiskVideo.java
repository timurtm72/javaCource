package lesson_6.box_with_disks;

public class DiskVideo {
    private String name;
    private int year;
    private String studio;
    private String director;
    private int longTime;

    public DiskVideo(String name, int year, String studio, String director, int longTime) {
        this.name = name;
        this.year = year;
        this.studio = studio;
        this.director = director;
        this.longTime = longTime;
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongTime() {
        return longTime;
    }

    public void setLongTime(int longTime) {
        this.longTime = longTime;
    }
}
