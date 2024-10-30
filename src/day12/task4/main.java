package day12.task4;

public class main {
    public static void main(String[] args) {
            MusicBand band1 = new MusicBand("The Beatles", 1960);
            band1.addMember("John Lennon");
            band1.addMember("Paul McCartney");
            band1.addMember("George Harrison");
            band1.addMember("Ringo Starr");

            MusicBand band2 = new MusicBand("Led Zeppelin", 1968);
            band2.addMember("Jimmy Page");
            band2.addMember("Robert Plant");
            band2.addMember("John Paul Jones");
            band2.addMember("John Bonham");

            band1.printMembers();
            band2.printMembers();

            MusicBand.transferMembers(band1, band2);

            band1.printMembers();
            band2.printMembers();

    }
}
