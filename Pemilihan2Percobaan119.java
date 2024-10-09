import java.util.Scanner;

public class Pemilihan2Percobaan119 {

    public static void main(String[] args){
        Scanner input19 = new Scanner(System.in);

        System.out.println("masukkan tahun");
        int tahun = input19.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " Adalah Tahun kabisat");
                } else {
                    System.out.println(tahun + " Bukan Tahun kabisat");
                }
            } else {
                System.out.println(tahun + " Adalah Tahun kabisat");
            }
        } else {
            System.out.println(tahun + " Bukan Tahun kabisat");
        }
    }
}
