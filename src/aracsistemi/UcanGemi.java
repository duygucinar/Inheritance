package aracsistemi;

public class UcanGemi extends HavaTasitlari implements DenizTasitlari{
    
    public UcanGemi(){
        
    }
    
    public UcanGemi(String Marka,String YakitTuru,int Hiz,int YolcuSayisi,int TekerlekSayisi,int Fiyat,int UretimYili,String Renk){
        this.Marka=Marka;
        this.YakitTuru=YakitTuru;
        this.Hiz=Hiz;
        this.YolcuSayisi=YolcuSayisi;
        this.TekerlekSayisi=TekerlekSayisi;
        this.Fiyat=Fiyat;
        this.UretimYili=UretimYili;
        this.Renk=Renk;
    }
    
}