public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(1,"Aras", "Yildiz");
        OgrenciManagment ogrenciManagment = new OgrenciManagment(ogrenci);

        ogrenciManagment.ogrenciEkle();
    }
}