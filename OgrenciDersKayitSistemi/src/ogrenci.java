import java.util.ArrayList;
import java.util.List;

public class ogrenci {
    private String ogrenciAd;
    private String ogrenciSoyad;
    private int ogrenciNo;
    private String ogrenciBolum;
    private List<ders> ogrenciDers;


    public ogrenci(String ogrenciAd, String ogrenciSoyad, String ogrenciBolum, int ogrenciNo, List<ders> ogrenciDers){
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciBolum = ogrenciBolum;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciDers = ogrenciDers;

    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public String getOgrenciBolum() {
        return ogrenciAd;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public List<ders> getOgrenciDers() {
        return ogrenciDers;
    }

    public void setOgrenciDers(List<ders> ogrenciDers) {
        this.ogrenciDers = ogrenciDers;
    }

}