
public class ornek8 {
    public static void main(String[] args) {
        
        // 1 ile 50 arasındaki asal sayıları yazdıran java kodunu yazın.
        
        boolean d;
        
        for(int i = 2; i <= 50; i++) {
            d = false;
            for(int j = 2; j <= i-1; j++) {
         
            if(i % j == 0) {
                d = true;
                break;
            }
        }
            if(d == false) {
                System.out.print(i + ", ");
            }
            
    }
    }
}
