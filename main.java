
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci vize notunuzu giriniz:");
        int vizenotu1 = scanner.nextInt();
        System.out.println("ikinci vize notunuzu giriniz:");
        int vizenotu2 = scanner.nextInt();
        System.out.println("final notunuzu giriniz:");
        int finalnotu = scanner.nextInt();
        double ortalama = ((vizenotu1*3)/10 + (vizenotu2*3)/10 +(finalnotu*4)/10);
        System.out.println("ortalama: " + ortalama);
        if(80<=ortalama && ortalama<=100){
            System.out.println("AA");
            System.out.println("afferin sana...");
        }
        else
            if(60<=ortalama && ortalama<80){
            System.out.println("BB");
        }
            else
                if(50<=ortalama && ortalama<60){
                    System.out.println("CC");
        }
                else
                    if(ortalama<50){
                    System.out.println("FF");
                    System.out.println("sinifta kaldiniz gecmis olsun...");
        }
        
                
    }
}
