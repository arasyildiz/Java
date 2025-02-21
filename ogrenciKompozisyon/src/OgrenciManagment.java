public class OgrenciManagment {
    Ogrenci ogrenci;

    OgrenciManagment(Ogrenci ogrenci){
        this.ogrenci = ogrenci;
    }

    public void ogrenciEkle(){
        System.out.println("Ogrenci eklendi : " + ogrenci.getIsim());
    }

}
