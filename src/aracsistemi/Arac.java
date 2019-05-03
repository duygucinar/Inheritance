package aracsistemi;

public interface Arac {
    
    public String getMarka();
    public void setMarka(String Marka);
    public String getYakitTuru();
    public void setYakitTuru(String YakitTuru);
    public String getRenk();
    public void setRenk(String Renk);
    public int getHiz();
    public void setHiz(int Hiz);
    public int getYolcuSayisi();
    public void setYolcuSayisi(int YolcuSayisi);
    public int getFiyat();
    public void setFiyat(int Fiyat);
    public int getUretimYili();
    public void setUretimYili(int UretimYili);
    public void hizlandir(int h);
    public void yavaslat(int h);
    public void durdur();
    
}