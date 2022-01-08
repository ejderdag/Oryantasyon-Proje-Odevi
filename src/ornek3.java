
import java.util.Scanner;


public class ornek3 {
    
    public static void main(String[] args) {
        
        // Girilen bir sayının çift olması halinde rakamlarının Aritmetik Ortalamasını
        // tek olması halinde ise Geometrik ortalmasını hesaplayan kodu yazın.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
 
            if(sayi % 2 == 0) { // Sayı Çifttir. Aritmetik Ortalama Hesaplama
                
                int rakam;
                double AO;
                double toplam = 0;
                int basamak_sayisi = 0;
                
                while(sayi != 0) {
                rakam = sayi % 10;
                toplam += rakam;
                sayi /= 10;
                basamak_sayisi++;
                }
                
                AO = toplam / basamak_sayisi;
                System.out.println("Sayının Rakamlarının Aritmetik Ortalaması = " + AO);
            }
            
            else { // Sayı Tektir. Geometrik Ortalama Hesapla
                int carpim = 1;
                int i = 0;
                double GO;
                
                while(sayi != 0) {
                    int rakam = sayi % 10;
                    sayi /= 10;
                    i = i + 1;
                    if(rakam != 0) {
                        carpim = carpim * rakam;
                    }
                }
                GO = Math.pow(carpim, (1.0/i));
                System.out.println("Sayının Rakamlarının Geometrik Ortalaması: " + GO);
            }
        
    }
}
