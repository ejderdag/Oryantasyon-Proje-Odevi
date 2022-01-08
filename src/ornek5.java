
import java.util.Scanner;


public class ornek5 {
    public static void main(String[] args) {
        
        //Girilen derecenin Sinüs, Kosinüs ve Tanjantı değerini yazıran kodu yazın.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dereceyi Giriniz: ");
        double derece = scanner.nextDouble();
        
        double radyan = Math.toRadians(derece);
        
        System.out.printf("%-10s%-10s%-10s\n", "Sinüs", "Kosinüs", "Tanjant");
        
        System.out.printf("%-10.4f%-10.4f%-10.4f\n", Math.sin(radyan), Math.cos(radyan), Math.tan(radyan));
    }
}
