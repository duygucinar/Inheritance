
package aracsistemi;

public class Gemi implements DenizTasitlari{
    
    protected String Marka;
    protected String YakitTuru;
    protected String Renk;
    protected int Hiz;
    protected int YolcuSayisi;
    protected int Fiyat;
    protected int UretimYili;
    protected String ID;
    
    public Gemi(){
        
    }
    
    public Gemi(String Marka,String YakitTuru,int Hiz,int YolcuSayisi,int Fiyat,int UretimYili,String Renk){
        this.Marka=Marka;
        this.YakitTuru=YakitTuru;
        this.Hiz=Hiz;
        this.YolcuSayisi=YolcuSayisi;
        this.Fiyat=Fiyat;
        this.UretimYili=UretimYili;
        this.Renk=Renk;
    }
    
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