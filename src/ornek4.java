
import java.util.Scanner;


public class ornek4 {
    public static void main(String[] args) {
        
        // İstenilen Geometrik Şeklin Alanını Hesaplama
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Alanını Bulmak İstediğiniz Şekli giriniz: ");
        String sekil = scanner.nextLine();
        
        if(sekil.equals("Kare")) {
            System.out.print("Karenin Bir Kenarını Giriniz: ");
            int kenar = scanner.nextInt();
            double alan = Math.pow(kenar, 2);
            System.out.println("Karenin Alanı: " + alan);
        }
        else if(sekil.equals("Daire")) {
            System.out.print("Dairenin Yarıçapını Giriniz: ");
            int yaricap = scanner.nextInt();
            double alan = Math.PI * Math.pow(yaricap, 2);
            System.out.println("Dairenin Alanı: " + alan);
        }
        else if(sekil.equals("Ucgen")) {
            System.out.println("Üçgenin Kenralarını Giriniz");
            System.out.print("Birinci Kenar: ");
            int kenar1 = scanner.nextInt();
            System.out.print("İkinci Kenar: ");
            int kenar2 = scanner.nextInt();
            System.out.print("Üçüncü Kenar: ");
            int kenar3= scanner.nextInt();
            
            double u = (kenar1 + kenar2 + kenar3) / 2;
            
            double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
            
            System.out.println("Üçgenin Alanı: " + alan);
        }
        else {
            System.out.println("Geçersiz İşlem Girdiniz.");
        }
    }
}