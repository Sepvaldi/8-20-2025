package aritmatika;
import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai anda : ");
        int nilai = input.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 0 && nilai <= 69) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }

}
