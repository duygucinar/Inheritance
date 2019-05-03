package aracsistemi;

public class Bisiklet extends KaraTasitlari{
    
    public Bisiklet(){
       // System.out.println("Bir bisiklet nesnesi oluştu...");
    }
    
    public Bisiklet(String Marka,int Hiz,int YolcuSayisi,int TekerlekSayisi,int Fiyat,int UretimYili,String Renk){
        this.Marka=Marka;
        this.Hiz=Hiz;
        this.YolcuSayisi=YolcuSayisi;
        this.TekerlekSayisi=TekerlekSayisi;
        this.Fiyat=Fiyat;
        this.UretimYili=UretimYili;
        this.Renk=Renk;
        
      //  System.out.println("Bir Bisiklet nesnesi oluşturuldu...");
    }

}