package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }

        }
        for (MusicBand groupsAfter2000 : bandsAfter2000) {
            System.out.println(groupsAfter2000);
        }
        return bandsAfter2000;

    }
}








