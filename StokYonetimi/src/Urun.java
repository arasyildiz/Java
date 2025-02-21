public class Urun {
    private String urunIsmi;
    private double ucret;
    private int stok;

    public Urun(String urunIsmi, double ucret, int stok){
        this.urunIsmi = urunIsmi;
        this.ucret = ucret;
        this.stok = stok;
    }

    public String getUrunIsmi(){
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi){
        this.urunIsmi = urunIsmi;
    }

    public double getUcret(){
        return ucret;
    }

    public void setUcret(double ucret){
        this.ucret = ucret;
    }

    public int getStok(){
        return stok;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    @Override
    public String toString(){
        return "Ürün adı : " + urunIsmi + "Ucreti : " + ucret + "Stok durumu : " + stok;
    }
}
