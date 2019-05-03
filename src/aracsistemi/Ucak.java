package aracsistemi;

public class Ucak extends HavaTasitlari{
    
    public Ucak(){
        //System.out.println("Bir Uçak nesnesi oluşturuldu...");
    }

    public Ucak(String Marka,String YakitTuru,int Hiz,int YolcuSayisi,int TekerlekSayisi,int Fiyat,int UretimYili,String Renk){
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

