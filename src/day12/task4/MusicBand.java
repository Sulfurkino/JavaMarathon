package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.year = year;
        this.name = name;
        this.members = new ArrayList<>();
    }


    public void addMember(String member){
        members.add(member);
    }
    public void removeMember(String member) {
        int index = -1;
        for (int i = 0; i < members.length; i++) {
            if (members[i].equals(member)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newMembers = new String[members.length - 1];
            System.arraycopy(members, 0, newMembers, 0, index);
            System.arraycopy(members, index + 1, newMembers, index, members.length - index - 1);
            members = newMembers;
        }
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

    public static void transferMembers(MusicBand band1, MusicBand band2){
        band1.members.addAll(band2.members);
        band2.members.clear();
    }

    public void printMembers(){
        for (String member : members) {
            System.out.println(member);
        }
    }

}
