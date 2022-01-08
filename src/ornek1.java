
import java.util.Scanner;


public class ornek1 {
    public static void main(String[] args) {
        // Yakılan Kalori miktaırını hesaplayan kodu yazın. 
        // kalori = (adimSayisi * adimUzunlugu) / 500
        // adimUzunluğu Erkek için 45 cm, Kadın için 30 cm dir.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\tKalori Hesaplama Programı");
        
        System.out.print("Cinsiyet Giriniz: ");
        String cinsiyet = scanner.nextLine();
        System.out.print("Adım Sayısı: ");
        int adim_sayisi = scanner.nextInt();
        
        
        int kalori = 0;
        
        if(cinsiyet.equals("Kadin")) { // adimUzunlugu = 30 
            kalori = (adim_sayisi * 30) / 500;
            
        }
        else if(cinsiyet.equals("Erkek")) { // adimUzunlugu = 45
            kalori =  (adim_sayisi * 45) / 500;
        }
        else {
            System.out.println("Geçersiz İşlem");
        }
        
        System.out.println(kalori + " Kalori Yakmışsınız.");
        
    }
    
}
