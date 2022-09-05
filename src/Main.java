import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayi;
        while(true) {
            System.out.println("Lütfen Bir Sayı Giriniz :");
            sayi = scan.nextInt();

            if(sayi < 0) {
                System.out.println("Program Bitti Negatif Sayı Girdiniz!");
                System.out.println("Girilen Tek Sayılar Toplamı :" + toplam);
                break;
            }

            if(sayi % 2 == 1) {
                toplam +=sayi;
            }
        }

    }
}