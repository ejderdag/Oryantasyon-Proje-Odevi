
import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
         
        // Taban dönüştürme
        // Kullanıcıdan alınan sayı çift ise 8 tabanına, tek ise 2 tabanına çeviren java kodunu yazın.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        
        int kalan;
        String sonuc ="";
            
        if(sayi % 2 == 0) { // Sayı Çift. 8 Tabanına Çevir
            while(sayi != 0) {
                kalan = sayi % 8;
                sonuc = kalan + sonuc;
                sayi /= 8;
            }
            System.out.println("Sayının 8 Tabanındaki Karşılığı: " + sonuc);
            
        }
        else { // Sayı Tek. 2 Tabanına Çevir
            while(sayi != 0) {
                kalan = sayi % 2;
                sonuc = kalan + sonuc;
                sayi /= 2;
            }
            System.out.println("Sayının 2 Tabanındaki Karşılığı: " + sonuc);
            
        }
        
        
        
    }
    
}
