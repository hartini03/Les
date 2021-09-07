package Tugas5;

import java.util.ArrayList;
import java.util.List;
public class Lesprivat {

    public static void main(String[] args) {
        List<String> siswa = new ArrayList<>();
        siswa.add("Salman");
        siswa.add("Devdan");
        siswa.add("shaqeil");
        siswa.add("rio");

        List<Integer> absen = new ArrayList<>();
        absen.add(1);
        absen.add(2);
        absen.add(3);
        absen.add(4);

        System.out.println(absen.get(0));
        System.out.println(absen.get(1));
        System.out.println(absen.get(2));
        System.out.println(absen.get(3));
    }
}
