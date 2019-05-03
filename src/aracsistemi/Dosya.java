package aracsistemi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Dosya {
    
    public void yaz(String metin,String d){
        try{
                  File dosya = new File(d);
                  FileWriter yazici = new FileWriter(dosya,true);
                  BufferedWriter yaz = new BufferedWriter(yazici);
                  yaz.write(metin);
                  yaz.newLine();
                  yaz.close();
            }
            catch (IOException hata){
                  hata.printStackTrace();
            }
    }
    
    public void sil(String d){
        try{
                  File dosya = new File(d);
                  FileWriter yazici = new FileWriter(dosya,false);
                  BufferedWriter yaz = new BufferedWriter(yazici);
                  yaz.write("");
                  yaz.close();
            }
            catch (IOException hata){
                  hata.printStackTrace();
            }
    }

    
}
