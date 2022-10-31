import java.util.Scanner;

public class belanja {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String[] Belanja = new String[10];
        for(int index=0;index<Belanja.length;index++){
            System.out.println("Masukan nama barang = ");
            Belanja[index] = Input.nextLine();
        }
    int j=0;
        do{
            System.out.println("Masukan nama barang = ");
            Belanja[j] = Input.nextLine();
        }while (j < Belanja.length);
    }
}
