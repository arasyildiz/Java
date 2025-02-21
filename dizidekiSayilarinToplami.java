import java.util.Scanner;

public class multiDiziler {
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++){
            System.out.print("Sayiyi giriniz : ");
            int cevap = scan.nextInt();
            sayilar[i] = cevap;
        }

        for (int deger : sayilar){
            toplam += deger;
        }
        System.out.println(toplam / sayilar.length);
    }
}
