public class LatihanMethod {
    public static void Penjumlahan(){
        int angka1 = 3;
        int angka2 = 5;
        int hasil = angka1 + angka2;
    }
    public static void Perkalian(){
        int angka3 = 7;
        int angka4 = 9;
        int hasil2 = angka3 * angka4;
    }
    public static void CetakHeader(String Header){
        System.out.println(Header);
    }
    public static void CetakFooter(String Footer){
        System.out.println(Footer);
        System.out.println("--------------------");
    }
    public static void GanjilGenap(int Number1, int Number2){
        int AfterCalculate = Number1 * Number2;
        if(AfterCalculate%2==0){
            System.out.println(AfterCalculate+ " Adalah genap ");
        }else{
            System.out.println(AfterCalculate+ " Adalah ganjil ");
        }
    }

    public static void main(String[] args) {
        Penjumlahan();
        Perkalian();
        CetakHeader("Ini adalah awal Ganjil Genap");
        GanjilGenap(5,9);
        CetakFooter("Ini adalah akhir Ganjil Genap");
    }
}
