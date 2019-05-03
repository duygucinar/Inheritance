package aracsistemi;

public abstract class KaraTasitlari implements Arac{
    
    protected String Marka;
    protected String YakitTuru;
    protected String Renk;
    protected int Hiz;
    protected int YolcuSayisi;
    protected int TekerlekSayisi;
    protected int Fiyat;
    protected int UretimYili;
    protected String ID;

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    public String getYakitTuru() {
        return YakitTuru;
    }

    public void setYakitTuru(String YakitTuru) {
        this.YakitTuru = YakitTuru;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String Renk) {
        this.Renk = Renk;
    }

    public int getHiz() {
        return Hiz;
    }

    public void setHiz(int Hiz) {
        this.Hiz = Hiz;
    }

    public int getYolcuSayisi() {
        return YolcuSayisi;
    }

    public void setYolcuSayisi(int YolcuSayisi) {
        this.YolcuSayisi = YolcuSayisi;
    }

    public int getTekerlekSayisi() {
        return TekerlekSayisi;
    }

    public void setTekerlekSayisi(int TekerlekSayisi) {
        this.TekerlekSayisi = TekerlekSayisi;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int Fiyat) {
        this.Fiyat = Fiyat;
    }

    public int getUretimYili() {
        return UretimYili;
    }

    public void setUretimYili(int UretimYili) {
        this.UretimYili = UretimYili;
    }

    
    public void hizlandir(int h){
        this.Hiz=this.Hiz+h;
    }
    
    public void yavaslat(int h){
        this.Hiz=this.Hiz-h;
    }
    
    public void durdur(){
        this.Hiz=0;
    }
}
