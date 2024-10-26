package day12.task3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name,int year) {
        this.year = year;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "musicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }


}
