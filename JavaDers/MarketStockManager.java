import java.util.ArrayList;
import java.util.List;

public class MarketStockManager {
    private List<Product> productList;

    public MarketStockManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Ürün başarıyla eklendi.");
    }

    public void updateProduct(String productName, double newPrice, int newStock) {
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                product.setPrice(newPrice);
                product.setStock(newStock);
                System.out.println("Ürün güncellendi.");
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }

    public void removeProduct(String productName) {
        productList.removeIf(product -> product.getProductName().equalsIgnoreCase(productName));
        System.out.println("Ürün silindi.");
    }

    public void listProducts() {
        if (productList.isEmpty()) {
            System.out.println("Hiç ürün bulunmamaktadır.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public void searchProduct(String productName) {
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println("Bulunan Ürün: " + product);
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }

    public void sellProduct(String productName, int quantity) {
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                if (product.getStock() >= quantity) {
                    product.setStock(product.getStock() - quantity);
                    System.out.println("Satış gerçekleştirildi. Kalan stok: " + product.getStock());
                } else {
                    System.out.println("Yeterli stok yok.");
                }
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }
}
