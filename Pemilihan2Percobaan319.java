import java.util.Scanner;

public class Pemilihan2Percobaan319 {
    public static void main(String[] args) {
         
        Scanner input19 = new Scanner(System.in);
        String Kategori;
        int Penghasilan, GajiBersih;
        double pajak = 0;

        System.out.println("masukkan kategori");
        Kategori = input19.nextLine();
        System.out.println("masukkan besarnya penghasilan : ");
        Penghasilan = input19.nextInt();

        if (Kategori.equalsIgnoreCase("pekerja")) {
            if (Penghasilan <=2000000) {
                pajak = 0.1;
            }else if (Penghasilan <=3000000){
                pajak = 0.15;
            }else{
                pajak = 0.2;
            }
            GajiBersih = (int)(Penghasilan-(pajak*Penghasilan));
            System.out.println("Gaji Bersih Pekerja " + GajiBersih);

        }else if(Kategori.equals("pebisnis")){
            if (Penghasilan <= 2500000) {
                pajak = 0.15;
            }else if(Penghasilan <=3500000){
                pajak = 0.2;
            }else{
                pajak=0.25;
            }
            GajiBersih = (int)(Penghasilan-(pajak*Penghasilan));
            System.out.println("Gaji Bersih Pembisnis " + GajiBersih);
        }else{
            System.out.println("Gaji bersih Pebisnis");
        }
            System.out.println("Gaji bersih Pekerja");
        }
    }      

