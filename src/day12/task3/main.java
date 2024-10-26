package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("The Beatles", 1960);
        MusicBand band2 = new MusicBand("Led Zeppelin", 1968);
        MusicBand band3 = new MusicBand("Queen", 1970);
        MusicBand band4 = new MusicBand("Nirvana", 1987);
        MusicBand band5 = new MusicBand("Metallica", 1981);
        MusicBand band6 = new MusicBand("Coldplay", 1998);
        MusicBand band7 = new MusicBand("Taylor Swift", 2006);
        MusicBand band8 = new MusicBand("Ariana Grande", 2008);
        MusicBand band9 = new MusicBand("Ed Sheeran", 2010);
        MusicBand band10 = new MusicBand("BTS", 2013);


        List<MusicBand> bands = new ArrayList<>();



        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);


        Collections.shuffle(bands);


        System.out.println("Оригинальный список групп:");
        for (MusicBand band : bands) {
            System.out.println(band);
        }


        System.out.println("\nГруппы, основанные после 2000 года:");
        List<MusicBand> bandsAfter2000 = Task3.groupsAfter2000(bands);

    }
}
