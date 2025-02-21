import java.util.ArrayList;
import java.util.List;

public class UrunManager {

    private List<Urun> urunListesi;

    public List<Urun> getUrunListesi() {
        return urunListesi;
    }
    
    public UrunManager(){
        this.urunListesi = new ArrayList<>();
    }

    public void urunEkle(Urun urun){
        urunListesi.add(urun);
        System.out.println("Ürün başarıyla eklendi");
    }

    public void urunGuncelle(String yeniAd, double yeniUcret, int yeniStok){
        for(Urun urun : urunListesi){
            if(urun.getUrunIsmi().equalsIgnoreCase(yeniAd)){
                urun.setUcret(yeniUcret);
                urun.setStok(yeniStok);
                System.out.println("Ürün başarıyla güncellendi");
                return;
            }
        }
        System.out.println("Ürün bulunamadı");
    }

    public void urunKaldir(String urunIsmi){
        urunListesi.removeIf(urun -> urun.getUrunIsmi().equalsIgnoreCase(urunIsmi));
    }

    public void urunleriGoster(){
        if(urunListesi.isEmpty()){
            System.out.println("Hiç ürün bulunmamaktadır.");
        }
        else{
            for(Urun urun : urunListesi){
                System.out.println(urun);
            }
        }
    }

    public void urunAra(String urunIsmi){
        for(Urun urun : urunListesi){
            if(urun.getUrunIsmi().equalsIgnoreCase(urunIsmi)){
                System.out.println("Bulunan ürün : " + urun);
                return;
            }
        }
        System.out.println("Ürün bulunamadı");
    }

    public void urunSat(String urunIsmi, int adet){
        for(Urun urun : urunListesi){
            if(urun.getUrunIsmi().equalsIgnoreCase(urunIsmi)){
                if(urun.getStok() >= adet){
                    urun.setStok(urun.getStok() - adet);
                    System.out.println("Ürün başarıyla satıldı.");
                }else{
                    System.out.println("yeterli stok yok");
                }
                return;
            }
        }
        System.out.println("Ürün bulunamadı");
    }
}