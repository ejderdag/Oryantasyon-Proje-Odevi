
import java.util.Scanner;


public class ornek7 {
    public static void main(String[] args) {
        
        // İki sayının OBEB'ini bulan java kodunu yazın.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        
        int ebob = 0;
        int k = 2;
        
        while(k <= sayi1 && k <= sayi2) {
            if((sayi1 % k == 0) && (sayi2 % k == 0)) {
                ebob = k;
            }
            k++;
        }
        System.out.println(sayi1 + " ve " + sayi2 + " için en büyük ortak bölen: " + ebob);
        
    }
    
}
