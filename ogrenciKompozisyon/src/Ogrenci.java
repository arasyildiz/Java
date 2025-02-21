public class Ogrenci {
    private int id;
    private String isim;
    private String soyad;

    Ogrenci(int id, String isim, String soyad){
        this.id = id;
        this.isim = isim;
        this.soyad = soyad;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getIsim(){
        return this.isim;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getSoyad(){
        return this.soyad;
    }

    public void setSoyad(String soyad){
        this.soyad = soyad;
    }
}
