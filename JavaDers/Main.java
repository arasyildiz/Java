import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketStockManager manager = new MarketStockManager();

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

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ürün adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Fiyat: ");
                    double price = scanner.nextDouble();
                    System.out.print("Stok: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); 
                    manager.addProduct(new Product(name, price, stock));
                    break;
                case 2:
                    System.out.print("Güncellemek istediğiniz ürün adı: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Yeni fiyat: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Yeni stok: ");
                    int newStock = scanner.nextInt();
                    scanner.nextLine(); 
                    manager.updateProduct(updateName, newPrice, newStock);
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz ürün adı: ");
                    String deleteName = scanner.nextLine();
                    manager.removeProduct(deleteName);
                    break;
                case 4:
                    manager.listProducts();
                    break;
                case 5:
                    System.out.print("Aradığınız ürün adı: ");
                    String searchName = scanner.nextLine();
                    manager.searchProduct(searchName);
                    break;
                case 6:
                    System.out.print("Satmak istediğiniz ürün adı: ");
                    String sellName = scanner.nextLine();
                    System.out.print("Satılacak miktar: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    manager.sellProduct(sellName, quantity);
                    break;
                case 7:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek!");
            }
        }
    }
}