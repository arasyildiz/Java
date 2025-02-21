import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UrunManager manager = new UrunManager();
        while (true) {
            System.out.println("\n*** Market Stok Yönetim Sistemi ***");
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürün Güncelle");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Ürün Listele");
            System.out.println("5. Ürün Ara");
            System.out.println("6. Satış Yap");
            System.out.println("7. Çıkış");
            System.out.print("Bir seçenek girin: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ürün adı: ");
                    String isim = scan.nextLine();
                    System.out.print("Fiyat: ");
                    double ucret = scan.nextDouble();
                    System.out.print("Stok: ");
                    int stok = scan.nextInt();
                    scan.nextLine();
                    manager.urunEkle(new Urun(isim, ucret, stok));
                    break;
                case 2:
                    System.out.print("Güncellemek istediğiniz ürün adı: ");
                    String yeniIsim = scan.nextLine();
                    System.out.print("Yeni fiyat: ");
                    double yeniUcret = scan.nextDouble();
                    System.out.print("Yeni stok: ");
                    int yeniStok = scan.nextInt();
                    scan.nextLine();
                    manager.urunGuncelle(yeniIsim, yeniUcret, yeniStok);
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz ürün adı: ");
                    String silinenIsim = scan.nextLine();
                    manager.urunKaldir(silinenIsim);
                    break;
                case 4:
                    manager.urunleriGoster();
                    break;
                case 5:
                    System.out.print("Aradığınız ürün adı: ");
                    String arananUrun = scan.nextLine();
                    manager.urunAra(arananUrun);
                    break;
                case 6:
                    System.out.print("Satmak istediğiniz ürün adı: ");
                    String satilanUrun = scan.nextLine();
                    System.out.print("Satılacak miktar: ");
                    int adet = scan.nextInt();
                    scan.nextLine();
                    manager.urunSat(satilanUrun, adet);
                    break;
                case 7:
                    System.out.println("Çıkılıyor...");
                    scan.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek!");
            }
        }
    }
}