
import java.util.Scanner;


public class ornek10 {
    public static void main(String[] args) {
        
        // Kullanıcıdan alınan bir cümleyi kelime kelime yazdıran java kodunu yazın.
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cümleyi Giriniz: "); // Yazilim Muhendisligi Bolumu
        String cumle = scanner.nextLine();
        
        for(int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i) == ' ') {
                System.out.println("");
            }
            else {
                System.out.print(cumle.charAt(i));
            }
        }
    }
}
