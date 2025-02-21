import java.util.Random;
import java.util.Scanner;

public class sayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int hak = 5;
        int cevap = 0;
        boolean bittiMi = false;
        int sayi = rand.nextInt(10);
        if (bittiMi == false){
            while (0 < hak){
                System.out.print("Tahmininizi giriniz : ");
                cevap = scan.nextInt();
                if (cevap == sayi){
                    System.out.println("Tebrikler Dogru Bildin!");
                    bittiMi = true;
                }else{
                    hak -= 1;
                    if(cevap < sayi){
                        System.out.println("Daha yüksek");
                    }else{
                        System.out.println("Daha düsük");
                    }
                }
            }
        }
    }
}
