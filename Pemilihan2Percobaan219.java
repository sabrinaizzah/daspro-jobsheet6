import java.util.Scanner;
public class Pemilihan2Percobaan219 {
    
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String menu,member;
        boolean Member;
        int jumlahBeli,PilihanMenu;
        double totalBayar, harga = 0, diskon = 0;

       System.out.println("-------------------------");
       System.out.println("===== MENU KAFE JTI =====");
       System.out.println("-------------------------");
       System.out.println("1. Ricebowl");
       System.out.println("2. Ice Tea");
       System.out.println("3. paket Bunding  (Ricebowl + Ice Tea)");
       System.out.println("--------------------------------------");
       System.out.print("masukkan angka dari menu yang dipilih =");
       PilihanMenu =  input19.nextInt();
       input19.nextLine();
       System.out.print("Apakah punya member (ya/tidak) ? =");
       member = input19.nextLine();
       System.out.println("--------------------------------------");

        if (member.equals ("ya")){
            diskon = 0.10;
            System.out.println("besar diskon = 10%");
            if (PilihanMenu == 1 ){
                harga = 14000;
                System.out.println("harga rice bowl = " + harga);

            }else if (PilihanMenu == 2){
                harga = 3000;
                System.out.println("harga ice tea = " + harga);

            }else if (PilihanMenu == 3){
                harga = 15000;
                System.out.println("harga bundling =" + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalBayar = harga - (harga * diskon);
            System.out.println("total bayar setelah diskon = " + totalBayar);

            }


            else if (member.equals ("tidak")){
                if (PilihanMenu == 1){
                    harga = 14000;
                    System.out.println("harga ricebowl = " + harga);

                }else if (PilihanMenu == 2){
                    harga = 3000;
                    System.out.println("harga ice tea = " + harga);

                }else if (PilihanMenu == 3){
                    harga = 15000; 
                    System.out.println("harga bundling = " + harga);

                }else {
                    System.out.println("masukkan pilihan menu dengan benar ");
                    return;
                }
               System.out.println("total bayar = " + harga );

                }else {
                    System.out.println("member tidak valid");
                }
                System.out.println("--------------------------------------");
        }
        
        



    }
