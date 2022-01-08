
import java.util.Scanner;


public class ornek9 {
    public static void main(String[] args) {
        
        // Sayı Tahmin Oyunu
        // Rastgele üretilen bir sayıyı tahmin etme.
        
        int sayi = (int)(Math.random() * 100);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("0 ile 100 arasında bir sayı tahmin ediniz.");
        
        int tahmin = -1;
        
        while(tahmin != sayi) {
            System.out.print("Sayıyı Tahmin Ediniz: ");
            tahmin = scanner.nextInt();
            
            if(tahmin == sayi) {
                System.out.println("Tebrikler. Bildiniz.");
            }
            else if(tahmin < sayi) {
                System.out.println("Tahmininiz düşük");
            }
            else {
                System.out.println("Tahmininiz yüksek");
            }
        }
        
    }
    
}
