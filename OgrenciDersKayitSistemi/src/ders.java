import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ders implements Serializable {
    private String dersAd;
    private String dersKredi;
    private String dersDonem;

    public ders(String dersAd, String dersKredi) {
        this.dersAd = dersAd;
        this.dersKredi = dersKredi;
    }

    public String getdersAd() {
        return dersAd;
    }

    public void setdersAd(String dersAd) {
        this.dersAd = dersAd;
    }

    public String getdersKredi() {
        return dersKredi;
    }

    public void setdersKredi(String dersKredi) {
        this.dersKredi = dersKredi;
    }

    public String getDersDonem() {
        return dersDonem;
    }

    public void setDersDonem(String dersDonem) {
        this.dersDonem = dersDonem;
    }

    public static List<ders> ozelDersListesiOlustur() {
        List<ders> dersListesi = new ArrayList<>();

        ders ders1 = new ders("Elektronik", "3");
        ders1.setDersDonem("Bahar");

        ders ders2 = new ders("Web Tasarım", "4");
        ders2.setDersDonem("Güz");

        ders ders3 = new ders("Nesneye Dayalı Programlama", "2");
        ders3.setDersDonem("Yaz");

        ders ders4 = new ders("İngilizce", "2");
        ders4.setDersDonem("Güz"); // Düzeltildi

        dersListesi.add(ders1);
        dersListesi.add(ders2);
        dersListesi.add(ders3);
        dersListesi.add(ders4);

        return dersListesi;
    }
}
