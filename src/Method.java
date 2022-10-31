import java.util.Scanner;

public class Method {
    public static void Penjumlah(int x, int y){
        int hasil_Jumlah = x + y;
        System.out.println("Hasilnya adalah " +hasil_Jumlah);
    }
    public static void Pengurangan(int x, int y){
        int hasil_Kurang = x - y;
        System.out.println("Hasilnya adalah " +hasil_Kurang);
    }
    public static void Perkalian(int q, int z) {
        int hasil_kali = q * z;
        System.out.println("Hasilnya adalah " +hasil_kali);
    }
    public static void Pembagian(int q, int z) {
        int hasil_bagi = q / z;
        System.out.println("Hasilnya adalah " + hasil_bagi);
    }

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Masukan angka1 = ");
        int angka1 = inputData.nextInt();
        System.out.println("masukan angka2 = ");
        int angka2 = inputData.nextInt();
        Penjumlah(angka1,angka2);
        Perkalian(angka1,angka2);
        Pembagian(angka1,angka2);
        Pengurangan(angka1,angka2);
    }
}
