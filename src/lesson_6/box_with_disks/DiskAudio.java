package lesson_6.box_with_disks;

public class DiskAudio {
    private String name;
    private String singer;
    private int year;
    private int countOfTraks;

    public DiskAudio(String name, String singer, int year, int countOfTraks) {
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.countOfTraks = countOfTraks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfTraks() {
        return countOfTraks;
    }

    public void setCountOfTraks(int countOfTraks) {
        this.countOfTraks = countOfTraks;
    }
}
