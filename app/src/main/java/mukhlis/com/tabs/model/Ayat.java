package mukhlis.com.tabs.model;

/**
 * Created by yahyamukhlis on 12/10/15.
 */
public class Ayat {

    private String topik;

    private String namaSurat;

    private int ayat;

    private String terjemahan;

    private String imageUrl;

    public Ayat(String topik, String namaSurat, int ayat, String terjemahan) {
        this.topik = topik;
        this.namaSurat = namaSurat;
        this.ayat = ayat;
        this.terjemahan = terjemahan;
    }

    public String getTopik() {
        return topik;
    }

    public String getNamaSurat() {
        return namaSurat;
    }

    public int getAyat() {
        return ayat;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
